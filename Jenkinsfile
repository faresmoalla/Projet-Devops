pipeline {
       environment { 
        EMAIL_RECIPIENTS = "fares.moalla@esprit.tn"
    
    }

    agent any
    stages {
    
            
        stage("Test,Build") {
            steps {
              
             sh """ mvn -version"""
                    }
               
            }
             stage('Checkout GIT') {
            steps {
              echo 'cloning project'
                 git branch: 'main',
                 url : 'https://github.com/faresmoalla/Projet-Devops' ;
                
                    }
                }
		stage("Sonar"){
			steps{
			sh """ mvn sonar:sonar"""
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