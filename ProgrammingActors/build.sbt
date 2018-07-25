ThisBuild / scalaVersion := "2.12.6"
ThisBuild / organization := "com.example"

lazy val programmingActors = (project in file("."))
  .settings(
    name := "ProgrammingActors",
    libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.14",
  )
