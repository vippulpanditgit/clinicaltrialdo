node {
    checkout scm
    stage('Build Maven') {
        docker.image('maven:3-alpine').inside('-v $HOME/.m2:/root/.m2') {
            sh './scripts/build-maven.sh'
        }
    }
 }
