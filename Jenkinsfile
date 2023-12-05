pipeline {
    agent any
    tools{
        maven "Jenkinslab1"
    }
    environment {
        DB_USER1 = credentials('DB_USER1')
        DUSER = credentials('DUSER')
        DPWD = credentials('DPWD')
    }
    stages{
        stage('1. GIT Clone'){
            steps{
                git 'https://github.com/Rajesh2754/RatingT9.git'
            }
        }
        stage('2. Maven Clean'){
            steps{
                sh 'mvn clean install'
            }
        }
        stage('3. Build Docker Image'){
            steps{
                script{
                    sh 'docker build -f Dockerfile -t danicoolbug/customer_jen:latest .'
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
