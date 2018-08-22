organization  := "com.github.matsluni"

version       := "0.1"

name          := "akka-http-rpi"

scalaVersion  := "2.12.6"

scalacOptions := Seq("-unchecked",
                     "-deprecation",
                     "-target:jvm-1.8",
                     "-encoding", "utf8")

resolvers ++= Seq(
  "akka repo"             at "http://repo.akka.io/releases/"
)

libraryDependencies ++= {
    val akkaHttpVersion = "10.1.4"
    val akkaVersion = "2.5.14"
    val scalaTestVersion = "3.0.5"
    Seq(
        "com.typesafe.akka" %% "akka-stream"        % akkaVersion,
        "com.typesafe.akka" %% "akka-http"          % akkaHttpVersion,
        "com.typesafe.akka" %% "akka-http-testkit"  % akkaHttpVersion  % "test",
        "org.scalatest"     %% "scalatest"          % scalaTestVersion % "test"
    )
}

Seq(Revolver.settings: _*)

