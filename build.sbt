lazy val root = (project in file(".")).
  settings(
    name := "galois",
    scalaVersion := "2.11.8"
  )


libraryDependencies += "org.apache.kafka" % "kafka-clients" % "0.10.0.0"

libraryDependencies += "com.twitter" %% "algebird-core" % "0.12.1"

libraryDependencies += "org.rocksdb" % "rocksdbjni" % "4.1.0"

libraryDependencies += "com.twitter" %% "chill-bijection" % "0.8.0"

libraryDependencies += "com.google.inject" % "guice" % "4.1.0"

libraryDependencies += "com.typesafe.akka" %% "akka-http-core" % "2.4.10"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % Test

libraryDependencies += "org.mockito" % "mockito-all" % "1.10.19" % Test





