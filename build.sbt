name := "HelloWorld"

version := "0.1"

scalaVersion := "2.12.10"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test" 
libraryDependencies += "io.monix" %% "monix" % "3.0.0"

lazy val akkaVersion = "2.5.25"
val circeVersion = "0.11.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
  "org.scalatest" %% "scalatest" % "3.0.5" % Test
)
libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

//mongo db library
libraryDependencies += "org.mongodb.scala" %% "mongo-scala-driver" % "2.6.0"

