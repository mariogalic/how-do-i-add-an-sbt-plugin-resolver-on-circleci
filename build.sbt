import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "how-do-i-add-an-sbt-plugin-resolver-on-circleci",
    libraryDependencies += scalaTest % Test,
    resolvers in ThisBuild += "Artima Maven Repository" at "http://repo.artima.com/releases"
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
