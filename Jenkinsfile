pipeline{
    agent any
    stages{
        stage("build"){
            steps{
                sh "mvn -DskipTests package"
            }
        }
        stage("test"){
            steps{
                sh "mvn test"
            }
        }
    }
}
