pipeline {

	//agent any
	agent none

	stages {
	
		agent { label 'UbuntuPC' }
		stage('Compile Stage') {
			steps {
				//	sh 'mvn clean compile'
				sh 'ifconfig'
				echo 'compile stage'
				
			}
		}
		
		agent { label 'UbuntuPC2' }
		stage('Testing Stage') {
			steps {
				sh 'ifconfig'
				echo 'Testing stage'
				//sh 'mvn test'
			}
		}
		
		agent { label 'UbuntuPC' }
		stage('Deployment Stage') {
			steps {
					//sh 'mvn deploy'
					echo 'Deployment is going on'
					sh 'ifconfig'
					
			}
		}
		

	}
	
}
