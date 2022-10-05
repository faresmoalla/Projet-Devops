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
                    sh 'mvn clean install -DskipTests'
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
post {
always {

emailext (
to: "${EMAIL_RECIPIENTS}",
replyTo: "${EMAIL_RECIPIENTS}",
subject: "[BuildResult][${currentBuild.currentResult}] - Job '${env.JOB_NAME}' (${env.BUILD_NUMBER})",
mimeType: 'text/html',
body: '''${JELLY_SCRIPT, template="custom-html.jelly"}'''
)
}
}



            
       
    } }