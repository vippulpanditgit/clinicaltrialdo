package com.orange.global;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class GlobalInstance {
	public Map<String, Integer> tokenMap = new HashMap<>();
	public Map<String, Double> tokenProbability = new HashMap<>();

	private static GlobalInstance INSTANCE;

	private GlobalInstance() {
		
	}
	public static GlobalInstance getInstance() {
		if(INSTANCE==null)
			INSTANCE = new GlobalInstance();
		return INSTANCE;
	}

	public void saveIntegerMap(File fileName, Map<String, Integer> map) {
        try
        {
               FileOutputStream fos =
                  new FileOutputStream(fileName);
               ObjectOutputStream oos = new ObjectOutputStream(fos);
               oos.writeObject(map);
               oos.close();
               fos.close();
               System.out.printf("Serialized HashMap data is saved in hashmap.ser");
        }catch(IOException ioe)
         {
               ioe.printStackTrace();
         }
	}
	public void storeDoubleMap(File fileName, Map<String, Double> map) {
        try
        {
               FileOutputStream fos =
                  new FileOutputStream(fileName);
               ObjectOutputStream oos = new ObjectOutputStream(fos);
               oos.writeObject(map);
               oos.close();
               fos.close();
               System.out.printf("Serialized HashMap data is saved in hashmap.ser");
        }catch(IOException ioe)
         {
               ioe.printStackTrace();
         }
	}
	public void read(File fileName) {
	     try
	      {
	         FileInputStream fis = new FileInputStream("hashmap.ser");
	         ObjectInputStream ois = new ObjectInputStream(fis);
	         tokenMap = (HashMap) ois.readObject();
	         ois.close();
	         fis.close();
	      }catch(IOException ioe)
	      {
	         ioe.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("Class not found");
	         c.printStackTrace();
	         return;
	      }
	}
	   public Map<String, Double> sortByValueOfTypeDouble(Map<String, Double> map) {

	        // 1. Convert Map to List of Map
	        List<Map.Entry<String, Double>> list =
	                new LinkedList<Map.Entry<String, Double>>(map.entrySet());

	        // 2. Sort list with Collections.sort(), provide a custom Comparator
	        //    Try switch the o1 o2 position for a different order
	        Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {
	            public int compare(Map.Entry<String, Double> o1,
	                               Map.Entry<String, Double> o2) {
	                return (o1.getValue()).compareTo(o2.getValue());
	            }
	        });

	        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
	        Map<String, Double> sortedMap = new LinkedHashMap<String, Double>();
	        for (Map.Entry<String, Double> entry : list) {
	            sortedMap.put(entry.getKey(), entry.getValue());
	        }


	        return sortedMap;
	    }
    public Map<String, Integer> sortByValue() {

        // 1. Convert Map to List of Map
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(tokenMap.entrySet());

        // 2. Sort list with Collections.sort(), provide a custom Comparator
        //    Try switch the o1 o2 position for a different order
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }


        return sortedMap;
    }
    public Map<String, Double> probability() {
    	Map<String, Integer> originalMap = sortByValue();
    	long totalWordCount = originalMap.values().parallelStream().reduce(0, (element1, element2)->element1+element2);
    	originalMap.keySet().stream().forEach(key-> {
    		Double tokenProbability = new Double(((double)this.tokenMap.get(key))/totalWordCount)*100;
    		this.tokenProbability.put((String)key, tokenProbability);
    	});
    	return tokenProbability;
    	
    }
}
