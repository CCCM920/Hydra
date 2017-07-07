name := "sydra-storage"
version := "0.2.0"
scalaVersion := "2.12.2"
organization := "com.hydra"
libraryDependencies += "org.scala-lang" % "scala-reflect" % "2.12.2"
libraryDependencies += "org.scala-lang" % "scala-compiler" % "2.12.2"
//libraryDependencies += "org.msgpack" % "msgpack-core" % "0.8.2"
//libraryDependencies += "org.msgpack" % "jackson-dataformat-msgpack" % "0.8.2"
libraryDependencies += "org.apache.logging.log4j" % "log4j" % "2.4"
libraryDependencies += "org.apache.logging.log4j" % "log4j-slf4j-impl" % "2.4"
libraryDependencies += "org.apache.logging.log4j" % "log4j-api" % "2.4"
libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.4"
libraryDependencies += "io.netty" % "netty-all" % "4.1.4.Final"
libraryDependencies += "gov.nasa.gsfc.heasarc" % "nom-tam-fits" % "1.15.2"
//libraryDependencies += "org.pegdown" % "pegdown" % "1.6.0"
libraryDependencies += "com.hydra" %% "sydra" % "0.5.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
scalacOptions ++= Seq("-feature")
scalacOptions ++= Seq("-deprecation")