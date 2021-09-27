pipeline{
    agent any
environment { 
   VERSION = "${BUILD_NUMBER}"
   REPO = "https://github.com/juanfranciscobumo/RetoLaHaus.git"
   RAMA = "master"
}
    stages {
        stage('Descargar codigo') {
            steps {
                echo 'Descargando código...'
                git url: "${REPO}", branch: "${RAMA}"
            }
        }
         stage('Sonarqube') {
         environment {
         scannerHome = tool 'SonarQubeScanner'
    }
             steps {
                withSonarQubeEnv('sonarqube') {
                sh "${scannerHome}/bin/sonar-scanner"
        }
              timeout(time: 10, unit: 'MINUTES') {
              waitForQualityGate abortPipeline: true
        }
    }
	}	
        stage('Build') {
            steps {
                echo 'Corriendo los test...'
				bat 'gradle clean test aggregate'
				
            }
        }
		stage('Publish report') {
            steps {
                echo 'Publicando reporte de serenity...'
				  publishHTML (target: [
                  allowMissing: false,
                  alwaysLinkToLastBuild: false,
                  keepAll: true,
                  reportDir: '/target/site/serenity',
                  reportFiles: 'index.html',
                  reportName: "Reporte de serenity"
    ])
				
            }
        }
    }
}