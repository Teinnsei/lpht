import sbt._

ThisBuild / name := "lpht"
ThisBuild / organization := "io.cronenbergworld"
ThisBuild / organizationName := "The Cronenberg World"
ThisBuild / organizationHomepage := Some(url("https://cronenbergworld.io"))
ThisBuild / version := "0.0.1-RC1"
ThisBuild / idePackagePrefix := Some("io.cronenbergworld.lpht")
ThisBuild / scalaVersion := "2.13.4"
ThisBuild / libraryDependencies ++= Dependency.dependencies
ThisBuild / publishConfiguration := publishConfiguration.value.withOverwrite(true)
ThisBuild / publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true)
ThisBuild / licenses := List("Apache 2" -> new URL("https://www.apache.org/licenses/LICENSE-2.0.txt"))
ThisBuild / homepage := Some(url("https://github.com/Cronenberg-World/lpht"))
ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / publishMavenStyle := true
ThisBuild / publishTo := sonatypePublishToBundle.value

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/Cronenberg-World/lpht"),
    "scm:git@github.com:Cronenberg-World/lpht.git"
  )
)
ThisBuild / developers := List(
  Developer(
    id = "teinnsei",
    name = "Alexander Galagutskiy",
    email = "alexander.galagutskiy@pm.me",
    url = url("https://cronenbergworld.io")
  )
)

usePgpKeyHex("2A6B68CCEED5EC67481DA97267BD1625A14F0E0E")

lazy val `lpht`      = project in file("lpht")
lazy val `lpht-java` = (project in file("lpht-java")).dependsOn(`lpht`)
