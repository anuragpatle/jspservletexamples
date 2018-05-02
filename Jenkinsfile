pipeline {

	//agent any
	agent none

	stages {
	
		
		stage('Compile Stage') {
		agent { label 'UbuntuPC2' }
			steps {
				//	sh 'mvn clean compile'
				sh 'ifconfig'
				echo 'compile stage,\n and I m '
				sh 'whoami'
				sh 'mvn clean install'
				sh 'cp target/*.war /home/apatle/Installed_softwares/apache-tomcat-8.5.23/webapps'
				
			}
		}
		
		stage('Testing Stage') {
		agent { label 'UbuntuPC' }
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
