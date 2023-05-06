pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        // Checkout the code from Git
        git 'https://github.com/my-repo/my-project.git'

        // Build the project with Maven
        sh 'mvn clean package'

        // Generate JaCoCo coverage report
        sh 'mvn jacoco:report'
      }
    }
  }

  post {
    always {
      // Publish JaCoCo coverage report
      jacoco(execPattern: '**/target/*.exec')
    }
  }
}
