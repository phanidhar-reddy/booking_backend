pipeline {
    agent any
    triggers {
        pollSCM '*/5 * * * *'
    }
    stages {
        stage('Build') {
            steps {
                echo "Building booking application "
                sh '''
                java --version
                mvn clean install -DskipTest=true
                '''
            }
        }
        stage('Test') {
            steps {
                echo "Testing UT's booking application"
                sh '''
                mvn test
                '''
            }
        }
        stage('Deliver') {
            steps {
                echo 'Deliver booking application'
                sh '''
                echo "doing delivery stuff.."
                '''
            }
        }
    }
}