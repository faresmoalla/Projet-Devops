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
                 git branch: 'Facture-Fares',
                 url : 'https://github.com/Radhwen91/App-e-commerce' ;
                
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