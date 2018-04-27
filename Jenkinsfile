pipeline {

	//agent any
	agent none

	stages {
		
		agent UbuntuPC
		stage('Compile Stage') {
			steps {
				//	sh 'mvn clean compile'
				sh 'ifconfig'
				echo 'compile stage'
				
			}
		}
		
		agent UbunutPC2
		stage('Testing Stage') {
			steps {
				sh 'ifconfig'
				echo 'Testing stage'
				//sh 'mvn test'
			}
		}
		
		agent UbuntuPC
		stage('Deployment Stage') {
			steps {
					//sh 'mvn deploy'
					echo 'Deployment is going on'
					sh 'ifconfig'
					
			}
		}
		

	}
	
}
