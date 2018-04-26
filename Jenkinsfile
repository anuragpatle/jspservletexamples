pipeline {
	agent any

	stages {
		
		stage('Compile Stage') {
			steps {
				maven(maven : 'MY_MAVEN') {
					sh 'mvn clean compile'
				}
				
			}
		}
		
		stage('Testing Stage') {
			steps {
				maven(maven : 'MY_MAVEN') {
					sh 'mvn test'
				}
				
			}
		}
		
		stage('Deployment Stage') {
			steps {
				maven(maven : 'MY_MAVEN') {
					sh 'mvn deploy'
				}
				
			}
		}
		

	}
	
}
