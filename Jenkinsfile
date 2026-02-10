pipeline {
    agent any

    parameters {
        choice(name: 'ENV', choices: ['dev', 'prod'], description: 'Choisir l\'environnement')
    }

    stages {
        stage('Clean') {
            steps {
                echo "--- Nettoyage ---"
                sh 'rm -rf build dist'
                sh 'mkdir build dist'
            }
        }
        stage('Compile') {
            steps {
                echo "--- Compilation ---"
                sh 'javac -d build -cp libs/junit-platform-console-standalone-1.9.3.jar src/*.java'
            }
        }
        stage('Test') {
            steps {
                echo "--- Tests Unitaires ---"
                sh 'java -jar libs/junit-platform-console-standalone-1.9.3.jar -cp build --scan-classpath'
            }
        }
        stage('Package') {
            steps {
                echo "--- Création du JAR ---"
                sh 'echo "Main-Class: Factorial" > Manifest.txt'
                sh 'jar cfm dist/Factorial.jar Manifest.txt -C build .'
            }
        }
        stage('Deploy to Prod') {
            when {
                expression { params.ENV == 'prod' }
            }
            steps {
                echo ">>> DÉPLOIEMENT EN PRODUCTION SIMULÉ <<<"
            }
        }
    }
}
