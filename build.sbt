name := "practice"

version := "0.1"

scalaVersion := "2.12.4"

resolvers += "mvnrepository" at "http://mvnrepository.com/artifact/"

libraryDependencies ++=
  Seq(
    "com.typesafe.akka" %% "akka-actor" % "2.5.12",
    "com.typesafe.akka" %% "akka-stream" % "2.5.12",
    "com.typesafe.akka" %% "akka-slf4j" % "2.5.12",
    "ch.qos.logback" % "logback-classic" % "1.2.3",
    "org.scalatest" %% "scalatest" % "3.0.3",
    "com.github.tototoshi" %% "scala-csv" % "1.3.5",
    "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.3",
    "org.scalaj" %% "scalaj-http" % "2.4.0")