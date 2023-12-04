pipeline {
    agent any
    tools{
        maven "Jenkinslab1"
    }
    environment {
        DB_USER1 = credentials('DB_USER1')
        DUSER = credentials('dockerhub_username')
        DPWD = credentials('dockerhub_pwd')
    }
    stages{
        stage('1. GIT Clone'){
            steps{
                git 'https://github.com/Rajesh2754/RatingT9.git'
            }
        }
        stage('2. Maven Clean'){
            steps{
                bat 'mvn clean install'
            }
        }
        stage('3. Build Docker Image'){
            steps{
                script{
                    sh 'docker build -f Dockerfile -t danicoolbug/customer_doc:latest .'
                    }
            }

        }
        stage('4. Push to Docker Hub'){
            steps{
                script{
                   sh 'docker login -u %DUSER% -p %DPWD%'
                }
                sh 'docker push danicoolbug/customer_jen:latest'
            }
        }
    }
}