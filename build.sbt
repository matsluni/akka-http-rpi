organization  := "com.github.matsluni"

version       := "0.1"

name          := "akka-http-rpi"

scalaVersion  := "2.13.2"

scalacOptions := Seq("-unchecked",
                     "-deprecation",
                     "-target:jvm-1.8",
                     "-encoding", "utf8")

Global / onChangedBuildSource := ReloadOnSourceChanges

libraryDependencies ++= {
    val akkaHttpVersion = "10.2.0"
    val akkaVersion = "2.6.8"
    val scalaTestVersion = "3.1.2"
    Seq(
        "com.typesafe.akka" %% "akka-stream"          % akkaVersion,
        "com.typesafe.akka" %% "akka-http"            % akkaHttpVersion,
        "com.typesafe.akka" %% "akka-http-testkit"    % akkaHttpVersion  % "test",
        "com.typesafe.akka" %% "akka-stream-testkit"  % akkaVersion      % "test",
        "org.scalatest"     %% "scalatest"            % scalaTestVersion % "test"
    )
}

Seq(Revolver.settings: _*)

