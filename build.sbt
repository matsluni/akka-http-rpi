organization  := "com.github.matsluni"

version       := "0.1"

name          := "akka-http-rpi"

scalaVersion  := "2.12.0"

scalacOptions := Seq("-unchecked",
                     "-deprecation",
                     "-target:jvm-1.8",
                     "-encoding", "utf8")

resolvers ++= Seq(
  "akka repo"             at "http://repo.akka.io/releases/"
)

libraryDependencies ++= {
    val akkaHttpVersion = "10.0.0"
    Seq(
        "com.typesafe.akka"   %% "akka-http"                    % akkaHttpVersion
    )
}

Seq(Revolver.settings: _*)

