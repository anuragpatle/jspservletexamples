pipeline {
	agent any

	stages {
		
		stage('Compile Stage') {
			steps {
				withMaven(maven : 'MY_MAVEN') {
					sh 'mvn clean compile'
				}
				
			}
		}
		
		stage('Testing Stage') {
			steps {
				withMaven(maven : 'MY_MAVEN') {
					sh 'mvn test'
				}
				
			}
		}
		
		stage('Deployment Stage') {
			steps {
				withMaven(maven : 'MY_MAVEN') {
					sh 'mvn deploy'
				}
				
			}
		}
		

	}
	
}
