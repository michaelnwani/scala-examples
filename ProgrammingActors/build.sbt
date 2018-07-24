ThisBuild / scalaVersion := "2.12.6"
ThisBuild / organization := "com.example"

lazy val createActors = (project in file("."))
  .settings(
    name := "CreateActors",
    libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.14",
  )
