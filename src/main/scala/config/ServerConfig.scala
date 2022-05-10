package config
import model._
import cats.implicits._
import ciris.{env,ConfigValue}
import cats.effect.IO
final case class ServerConfig(host:Host,port:Port)

object  ServerConfig{
    def serverConfig: ConfigValue[IO,ServerConfig]= (
        env("PORT").as[Int].default(8080),
        env("HOST").default("localhost")
    ).parMapN((port,host)=>ServerConfig(Host(host),Port(port)))
        
}
