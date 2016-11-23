package com.example

import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.testkit.ScalatestRouteTest
import org.scalatest.{Matchers, WordSpec}

class RouteTest extends WordSpec with Matchers with ScalatestRouteTest with Route {

  "Route" should {
    "return ok for simple get" in {
      Get("/") ~> route ~> check {
        status shouldBe StatusCodes.OK
      }
    }
  }

}
