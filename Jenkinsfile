pipeline {
       environment { 
        EMAIL_RECIPIENTS = "fares.moalla@esprit.tn"
       
    
    }

    agent any
    stages {
    
            
     
             stage('Checkout GIT') {
            steps {
              echo 'cloning project'
               git branch : 'main',
                 url : 'https://github.com/faresmoalla/Projet-Devops' ;
                
                    }
                }
	



            
       
    } }