pipeline{
    agent any
    stages{
        stage("build"){
            steps{
                sh "mvn clean -DskipTests package"
            }
        }
        stage("test"){
            steps{
                sh "mvn test"
            }
        }
    }
}
