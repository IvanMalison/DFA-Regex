name := "dfa-regex"

organization := "com.austinyoung"

version := "0.0.1"

scalaVersion := "2.11.2"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "2.0" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.10.0" % "test" withSources() withJavadoc()
)

initialCommands := "import com.austinyoung.dfaregex._"

