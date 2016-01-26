organization  := "com.github.matsluni"

version       := "0.1"

name          := "akka-http-rpi"

scalaVersion  := "2.11.7"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers ++= Seq(
  "akka repo"             at "http://repo.akka.io/releases/"
)

libraryDependencies ++= {

    val akkaVersion = "2.4.2-RC1"
    Seq(
        "com.typesafe.akka"   %% "akka-http-experimental"       % akkaVersion,
        "com.typesafe.akka"   %% "akka-http-xml-experimental"   % akkaVersion
)}

seq(Revolver.settings: _*)

