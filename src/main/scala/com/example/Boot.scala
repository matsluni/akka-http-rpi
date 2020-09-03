package com.example

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Directives._

object Boot extends App with Route {

  implicit val system = ActorSystem("akka-http")

  // start a new HTTP server on port 8080 with our route as the handler
  val bindingFuture = Http().newServerAt("0.0.0.0", 8080).bind(route)

  println(s"Server online at http://localhost:8080/\nPress RETURN to stop...")

}

trait Route {
  val route =
    path("") {
      get {
        complete {
          "Say hello to akka-http on Raspberry Pi"
        }
      }
    }
}
