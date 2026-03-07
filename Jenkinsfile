    pipeline {
        agent any

        environment {
            DOCKER_IMAGE = "abhinav112001/scientific-calculator:latest"
        }

        stages {

            stage('Checkout Code') {
                steps {
                    checkout scm
                }
            }

            stage('Run Unit Tests') {
                steps {
                    sh 'mvn test'
                }
            }

            stage('Build Maven Package') {
                steps {
                    sh 'mvn package -DskipTests'
                }
            }

            stage('Build Docker Image') {
                steps {
                    sh 'docker build -t $DOCKER_IMAGE .'
                }
            }

            stage('Push Docker Image') {
                steps {
                    withCredentials([usernamePassword(credentialsId: 'dockerhub-creds',
                    usernameVariable: 'USER', passwordVariable: 'PASS')]) {

                        sh 'echo $PASS | docker login -u $USER --password-stdin'
                        sh 'docker push $DOCKER_IMAGE'
                    }
                }
            }

            stage('Deploy using Ansible') {
                steps {
                    sh 'ansible-playbook ansible/deploy.yml'
                }
            }
        }

        post {
            success {
                mail to: 'abhinav112001@gmail.com',
                     subject: "Build Successful",
                     body: "Jenkins build completed successfully."
            }

            failure {
                mail to: 'abhinav112001@gmail.com',
                     subject: "Build Failed",
                     body: "Jenkins build failed. Check Jenkins logs."
            }
        }
    }
