package com.example

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.marshallers.xml.ScalaXmlSupport._
import akka.stream.ActorMaterializer

import scala.io.StdIn

object Boot extends App {

  implicit val system = ActorSystem("akka-http")
  implicit val materializer = ActorMaterializer()

  val route =
    path("") {
      get {
        complete {
          <html>
            <body>
              <h1>Say hello to <i>akka-http</i> on <i>Raspberry Pi</i>!</h1>
            </body>
          </html>
        }
      }
    }

  // start a new HTTP server on port 8080 with our service actor as the handler
  val bindingFuture = Http().bindAndHandle(route, "0.0.0.0", 8080)

  println(s"Server online at http://localhost:8080/\nPress RETURN to stop...")

}