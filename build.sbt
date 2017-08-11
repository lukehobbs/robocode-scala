name := "player.ScalaBot"

version := "1.0"

scalaVersion := "2.12.1"

assemblyExcludedJars in assembly := {
  val cp = (fullClasspath in assembly).value
  cp filter {_.data.getName == "robocode.jar"}
}

assemblyJarName in assembly := s"${name.value}_${version.value}.jar"
