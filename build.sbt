organization  := "com.github.matsluni"

version       := "0.1"

name          := "akka-http-rpi"

scalaVersion  := "2.11.7"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers ++= Seq(
  "akka repo"             at "http://repo.akka.io/releases/"
)

libraryDependencies ++= {

    val akkaHttpVersion = "1.0"
    Seq(
        "com.typesafe.akka"   %% "akka-stream-experimental"     % akkaHttpVersion,
        "com.typesafe.akka"   %% "akka-http-experimental"       % akkaHttpVersion,
        "com.typesafe.akka"   %% "akka-http-xml-experimental"   % akkaHttpVersion

//        "com.typesafe.akka"   %% "akka-testkit"             % akkaHttpVersion   % "test"
)}

seq(Revolver.settings: _*)

