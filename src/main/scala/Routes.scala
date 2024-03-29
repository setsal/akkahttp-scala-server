import akka.http.scaladsl.server.Directives._
import api.{ApiErrorHandler, UsersApi}

trait Routes extends ApiErrorHandler with UsersApi{
  val routes =
    pathPrefix("demo") {
      usersApi
    } ~ path("")(getFromResource("public/index.html"))
}
