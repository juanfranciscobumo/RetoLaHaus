pipeline {
    agent any
    environment {
        VERSION = "${BUILD_NUMBER}"
        REPO = 'https://github.com/juanfranciscobumo/RetoLaHaus.git'
        RAMA = 'master'
    }
    stages {
        stage('Habilitación de ambiente') {
            steps {
                echo 'Habilitando el ambiente...'
                bat 'docker-compose up'
            }
        }
        stage('Descargar codigo') {
            steps {
                echo 'Descargando código...'
                git url: "${REPO}", branch: "${RAMA}"
            }
        }
        stage('Sonarqube') {
            steps {
                echo 'Escaneando código...'
                bat 'gradle sonarqube'
            }
        }
        stage('Build') {
            steps {
                echo 'Corriendo los test...'
                bat 'gradle clean test aggregate -Ddriver=remoteDriver -Dremote=chrome'
            }
        }
        stage('Publish report') {
            steps {
                echo 'Publicando reporte de serenity...'
                publishHTML (target: [
                  allowMissing: false,
                  alwaysLinkToLastBuild: false,
                  keepAll: true,
                  reportDir: 'target/site/serenity',
                  reportFiles: 'index.html',
                  reportName: 'Reporte de serenity'
                              ])
            }
        }
        stage('Desactivación de ambiente') {
            steps {
                echo 'Desactivando el ambiente...'
                bat 'docker-compose down'
            }
        }
    }
}
