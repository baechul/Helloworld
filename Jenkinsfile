pipeline {
  agent any
  options {
    skipStagesAfterUnstable()
  }
  stages {
    stage('Build') {
      steps {
        sh 'pwd'
      }
    }
    stage('Test') {
      steps {
        sh 'echo test'
      }
    }
    stage('Deploy') {
      steps {
        sh 'echo "haha"'
      }
    }
  }
}