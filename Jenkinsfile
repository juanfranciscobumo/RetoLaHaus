pipeline {
    agent any
environment { 
   VERSION = "${BUILD_NUMBER}"
   IMAGEN = "springholamundo"
   REGISTRY = "registryspring"
   SERVIDOR = "registryspring.azurecr.io"
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
        stage('Build') {
            steps {
                echo 'Compilando...'
				bat 'gradle build'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
				echo "Running ${VERSION} on ${JENKINS_URL}"
				bat "docker build -t ${SERVIDOR}/${IMAGEN}:${BUILD_NUMBER} ."
                echo 'Logueandose en azure...'
				bat "az acr login -n ${REGISTRY}"
				echo 'Haciendo push...'
                bat "docker push ${SERVIDOR}/${IMAGEN}:${BUILD_NUMBER}"
            }
        }
		        stage('Publish') {
            steps {
                echo 'Publicando artefacto....'
				echo 'Remplanzando versión en el archivo...'
contentReplace(
    configs: [
        fileContentReplaceConfig(
            configs: [
                fileContentReplaceItemConfig(
                    search: 'BUILD_NUMBER',
                    replace: "${BUILD_NUMBER}",
                    matchCount: 1)
                ],
            fileEncoding: 'UTF-8',
            filePath: 'deploymentJenkins.yml')
        ])
                echo 'Desplegando artefacto...'
				bat "kubectl apply -f deploymentJenkins.yml"
				
            }
        }
    }
}