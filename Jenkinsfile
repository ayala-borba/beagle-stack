@Library('ZupSharedLibs@darwin') _
node {

  try {

    mvnBuildWithCompose {
      composeFileName = "docker-compose-ci.yml"
      composeService = "stack-demo"
      composeProjectName = "stack-demo"
      useBuilder = "false"
    }

    buildDockerContainerAWS {
      dockerRepositoryName = "stack-demo"
      dockerFileLocation = "."
      team = "Beagle"
    }

  } catch (e) {

      notifyBuildStatus {
        buildStatus = "FAILED"
      }
      throw e

  }

}
