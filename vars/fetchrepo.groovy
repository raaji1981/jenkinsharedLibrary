def callrepo(String repoUrl){
  pipeline{
    agent any
    stages{
      stage("init"){
        steps{
          git_branch: 'main'
          url: "${repoUrl}"
        }
      }
    }
  }
          
  
