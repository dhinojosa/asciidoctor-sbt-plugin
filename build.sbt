name := "asciidoctor-sbt-plugin"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.2"

sbtPlugin := true

organization := "com.evolutionnext"

libraryDependencies ++= Seq("org.asciidoctor" % "asciidoctor-java-integration" % "0.1.4.preview.1" exclude("org.jruby", "jruby"),
                            "org.jruby" % "jruby" % "1.7.9" exclude("org.jruby.joni", "joni"),
                            "org.jruby.joni" % "joni" % "2.1.1")