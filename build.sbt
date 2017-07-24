organization  := "com.github.matsluni"

version       := "0.1"

name          := "akka-http-rpi"

scalaVersion  := "2.12.2"

scalacOptions := Seq("-unchecked",
                     "-deprecation",
                     "-target:jvm-1.8",
                     "-encoding", "utf8")

resolvers ++= Seq(
  "akka repo"             at "http://repo.akka.io/releases/"
)

libraryDependencies ++= {
    val akkaHttpVersion = "10.0.9"
    val akkaVersion = "2.5.3"
    val scalaTestVersion = "3.0.3"
    Seq(
        "com.typesafe.akka" %% "akka-stream"        % akkaVersion,
        "com.typesafe.akka" %% "akka-http"          % akkaHttpVersion,
        "com.typesafe.akka" %% "akka-http-testkit"  % akkaHttpVersion  % "test",
        "org.scalatest"     %% "scalatest"          % scalaTestVersion % "test"
    )
}

Seq(Revolver.settings: _*)

