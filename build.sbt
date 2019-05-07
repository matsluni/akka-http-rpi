organization  := "com.github.matsluni"

version       := "0.1"

name          := "akka-http-rpi"

scalaVersion  := "2.12.8"

scalacOptions := Seq("-unchecked",
                     "-deprecation",
                     "-target:jvm-1.8",
                     "-encoding", "utf8")

libraryDependencies ++= {
    val akkaHttpVersion = "10.1.8"
    val akkaVersion = "2.5.22"
    val scalaTestVersion = "3.0.7"
    Seq(
        "com.typesafe.akka" %% "akka-stream"          % akkaVersion,
        "com.typesafe.akka" %% "akka-http"            % akkaHttpVersion,
        "com.typesafe.akka" %% "akka-http-testkit"    % akkaHttpVersion  % "test",
        "com.typesafe.akka" %% "akka-stream-testkit"  % akkaVersion      % "test",
        "org.scalatest"     %% "scalatest"            % scalaTestVersion % "test"
    )
}

Seq(Revolver.settings: _*)

