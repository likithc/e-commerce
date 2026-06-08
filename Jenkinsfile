pipeline {

    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK17'
    }

    environment {
        IMAGE_NAME = "ecommerce-app"
    }

    stages {

        stage('Checkout') {

            steps {
                git branch: 'main',
                url: 'https://github.com/company/ecommerce-app.git'
            }
        }

        stage('Build') {

            steps {
                sh 'mvn clean package'
            }
        }

        stage('Unit Test') {

            steps {
                sh 'mvn test'
            }
        }

        stage('Docker Build') {

            steps {
                sh 'docker build -t ecommerce-app:v1 .'
            }
        }

        stage('Deploy') {

            steps {
                sh '''
                docker stop ecommerce-app || true
                docker rm ecommerce-app || true

                docker run -d \
                --name ecommerce-app \
                -p 8080:8080 \
                ecommerce-app:v1
                '''
            }
        }
    }

    post {

        success {
            echo "Application Deployed Successfully"
        }

        failure {
            echo "Pipeline Failed"
        }
    }
}
