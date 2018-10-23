package com.orange.data.util;

import java.util.Optional;

public class CopyOptional<T> {

	public static <T> Optional<T> copyOf(Optional<? extends T> opt) {
		  return (Optional<T>) opt;
		}
	public static <T> Optional<? extends T> base(Optional<T> opt) {
		return (Optional<? extends T>) opt;
	}
}
