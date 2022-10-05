pipeline {
       environment { 
        EMAIL_RECIPIENTS = "fares.moalla@esprit.tn"
    
    }

    agent any
    stages {
    
            
     
             stage('Checkout GIT') {
            steps {
              echo 'cloning project'
                 git branch: 'main',
                 url : 'https://github.com/faresmoalla/Projet-Devops' ;
                
                    }
                }
	stage('Compile Project') {
            steps {
                script{
		timestamps {
                    sh 'mvn clean install -DskipTests package'
                    } }
                }
            }



		stage("Sonar"){
			steps{
			sh """ mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=sonar"""
			}
			}
                  stage('Run Tests') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                script{
                    timestamps {
                        sh 'mvn test'
                            }
                    }
                }
            }
        }




            
       
    } }