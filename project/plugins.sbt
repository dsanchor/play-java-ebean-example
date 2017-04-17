resolvers += "nexus repository" at "http://nexus-ci-cd.apps.192.168.1.134.nip.io/repository/development/"

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.13")

addSbtPlugin("com.typesafe.sbt" % "sbt-play-ebean" % "3.0.1")
