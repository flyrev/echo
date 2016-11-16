name := "echo"

version := "1.0"

scalaVersion := "2.12.0"

val circeVersion = "0.6.0"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)