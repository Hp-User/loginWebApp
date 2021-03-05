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
				bat 'ant -f deploy-tomcat.xml deploy'
				bat 'ant -f Test-Acceptance.xml'
				bat 'ant -f test-coverage.xml'
            }
        }
    }
}  
