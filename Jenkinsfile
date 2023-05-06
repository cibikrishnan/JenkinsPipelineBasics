
/* Requires the Docker Pipeline plugin */
pipeline {
    agent { docker { image 'maven:3.9.0-eclipse-temurin-11' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
                sh 'mvn clean package'
                sh 'mvn jacoco:report'

            }



        }
    }
}
post  {
    always {
    jacoco(execPattern: '**/target/*.exec')
    }
}