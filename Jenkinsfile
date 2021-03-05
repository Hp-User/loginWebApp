pipeline {
    agent any
    tools {
        ant 'ant' 
    }
    stages {
     stage('SCM Code Checkout') {

            steps {
                checkout scm
     } 
  }
        stage('Ant Version Run') {
            steps {
                bat 'ant -f build.xml build-war'
            }
        }
    }
}  
