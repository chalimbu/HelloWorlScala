name := "HelloWorld"

version := "0.1"

scalaVersion := "2.12.10"

lazy val akkaVersion = "2.5.25"
val circeVersion = "0.11.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
  "org.scalatest" %% "scalatest" % "3.0.5" % Test,

)
libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

//libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.7.10"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
