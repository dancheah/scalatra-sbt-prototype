import sbt._
class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  // SBT Intellij plugin - works great with the Intellij SBT plugin
  // See for more information: https://github.com/mpeltonen/sbt-idea
  val sbtIdeaRepo = "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"
  val sbtIdea = "com.github.mpeltonen" % "sbt-idea-plugin" % "0.4.0"

  // Akka plugin
  //val akkaRepo   = "Akka Repo" at "http://akka.io/repository"
  //val akkaPlugin = "se.scalablesolutions.akka" % "akka-sbt-plugin" % "1.1.3"
}
