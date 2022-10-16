pipeline {
     

//testhook
    agent any
    stages {
    
            
     
             stage('Checkout GIT') {
            steps {
              echo 'cloning project'
               git branch : 'main',
                 url : 'https://github.com/faresmoalla/Projet-Devops' ;
                
                    }
                }
	stage('Cleaning the project and artifact construction') {
            steps {
                script{
		timestamps {
                    sh 'mvn clean install -DskipTests package'
                     sh 'mvn compile'
                    } }
                }
            }



		stage("Code Quality with SonarQube"){
			steps{
			sh """ mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=sonar"""
			}
			}
                  stage('Run Unit Tests') {
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
