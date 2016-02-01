name := "ScalTrainingShort"

version := "1.0"

scalaVersion := "2.11.7"

resolvers ++= Seq(
  "snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "releases" at "http://oss.sonatype.org/content/repositories/releases",
  "Maven central" at "http://repo1.maven.org/maven2/",
  "SBT releases" at "https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases"
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.0-M14" % "test"
)