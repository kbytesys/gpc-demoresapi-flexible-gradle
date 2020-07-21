pipeline {
    agent any

    options {
        gitLabConnection('Gitlab Nttdata')
        gitlabBuilds(builds: ['build'])
    }

    post {
        unsuccessful {
            updateGitlabCommitStatus name: 'build', state: 'failed'
        }
        success {
            updateGitlabCommitStatus name: 'build', state: 'success'
        }
    }

    triggers {
        gitlab(triggerOnPush: true, triggerOnMergeRequest: true, branchFilterType: 'All')
    }

    stages {
        stage('checkout') {
            steps {
                updateGitlabCommitStatus name: 'build', state: 'running'
                checkout scm
            }
        }

        stage('build') {
            steps {
                sh './gradlew build -x test'
            }
        }

        stage('test') {
            steps {
                sh './gradlew test'
            }
        }
    }
}