pipeline {

	//agent any
	agent none

	stages {
	
		
		stage('Compile Stage') {
		agent { label 'UbuntuPC' }
			steps {
				//	sh 'mvn clean compile'
				sh 'ifconfig'
				echo 'compile stage'
				
			}
		}
		
		stage('Testing Stage') {
		agent { label 'UbuntuPC2' }
			steps {
				sh 'ifconfig'
				echo 'Testing stage'
				//sh 'mvn test'
			}
		}
		
		stage('Deployment Stage') {
		agent { label 'UbuntuPC' }
			steps {
					//sh 'mvn deploy'
					echo 'Deployment is going on'
					sh 'ifconfig'
					
			}
		}
		

	}
	
}
