ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

val flywayVersion      = "8.5.10"
val logbackVersion= "1.2.11"
val postgresVersion = "42.3.4"
val jwtCoreVersion="9.0.5"
val Logback= "1.2.11"
val http4sVersion="0.23.11"
val circeVersion="0.14.1"
val quillVersion="3.16.4"
val h2Version="2.1.212"
val cirisVersion="2.3.2"


val flyDependencies=Seq(
  "org.flywaydb"     % "flyway-core"         % flywayVersion
)

val cirisDependencies= Seq(
  "is.cir" %% "ciris" % cirisVersion
)
val jwtDependencies=Seq(
  "com.github.jwt-scala" %% "jwt-core" % jwtCoreVersion
)

val postgresDependencies=Seq(
  "org.postgresql"   % "postgresql" % postgresVersion
)

val httpDependencies=Seq(
  "org.http4s" %% "http4s-ember-server" % http4sVersion,
  "org.http4s" %% "http4s-dsl" % http4sVersion,
  "org.http4s" %% "http4s-circe" % http4sVersion
)
val loggingDependencies= Seq(
  "ch.qos.logback" % "logback-classic" % Logback
)
val jsonDependencies=Seq(
  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion
)


lazy val root = (project in file("."))
  .settings(
    name := "booking-app-http4s",
    libraryDependencies ++= jsonDependencies ++ loggingDependencies ++
                           httpDependencies ++ flyDependencies ++jwtDependencies++
                           postgresDependencies ++ cirisDependencies
  )