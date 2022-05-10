package config
import ciris.{env,ConfigValue}
import cats.effect.IO
import cats.implicits._
final case class AppConfig(serverConfig:ServerConfig)


object AppConfig{
    def config: ConfigValue[IO,AppConfig]=(
ServerConfig.serverConfig.map(serverConfig=>AppConfig(serverConfig))
    )

}
