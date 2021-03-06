import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.11.8",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Hello",
    fork := true,
    libraryDependencies ++= Seq(
        "org.apache.spark" %% "spark-core" % "2.2.0",
        "org.apache.spark" %% "spark-streaming" % "2.2.0",
        "org.apache.spark" %% "spark-streaming-kafka-0-8" % "2.2.0",
        )
  )
