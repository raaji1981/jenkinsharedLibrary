def callrepo(String repoUrl) {
  pipeline {
    agent any
    stages {
      stage("init"){
        steps{
          git_branch: 'master'
          url: "${repoUrl}"
        }
      }
    }
  }
}       
  
