package routes

import cats.effect.IO
import org.http4s.dsl.Http4sDsl
import org.http4s.{HttpApp, HttpRoutes}

case object Routes extends Http4sDsl[IO] {

  import org.http4s.server.Router

  private  val prefix=""
  private val routes= HttpRoutes.of[IO] {
    case GET -> Root / "hello" => Ok("Hello dude")//.map(_.addCookie())
  }


  val router: HttpRoutes[IO] =Router(prefix->routes)
}