package com.evolutionnext.asciidoctor.sbt.plugin

import sbt._

/**
 * Copyright 2013 Daniel Hinojosa and Daniel Allen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
object AsciidoctorSbtPlugin extends Plugin {
  val asciidoctorTask = TaskKey[Unit]("asciidoctor-task")
  val newSetting = SettingKey[String]("A new setting.")

  /*
   * sourceDir where the asciidoctor .asc, .asciidoc files are located, default is `src/asciidoc`
   */
  val asciidoctorSources = SettingKey[File](
    """Location of where the asciidoc sources with .asc,
      | .asciidoctor, .adoc, or .ad extensions (Default: src/asciidoctor)""".stripMargin)

  /**
   * sourceDocumentName
   * an override to process a single source file. Type: File. Defaults to all files in asciidoctorSources
   */
  val asciidoctorSingleSourceDocumentName = SettingKey[File](
    """Location of a single .asc, .asciidoctor, .adoc, or .ad file.
       | Type: File. Defaults to all files in %s""".format(asciidoctorSources).stripMargin)


  /**
   * outputDir where generated docs go. Type: File. Default: target/asciidoctor
   */
  val asciidoctorOutputDir = SettingKey[File]("Location where the rendered documents will be stored (Default: target/asciidoctor)")

  /*
   * backend the backend to use. Type: String. Default: html5. This option is a convenience for using backends property.
   */
  val asciidoctorSingleBackend = SettingKey[String]("Single backends to process asciidoctor files (Default: html5)")

  /*
   * backends the backends to use. Type: Set<String>. Default: [html5]
   */
  val asciidoctorBackends = SettingKey[Set[String]]("Multiple Backends used to process asciidoctor files (Default: [html5]")

  /*
    options a Map specifying different options that can be sent to Asciidoctor.
  */
  val asciidoctorOptions = SettingKey[Map[String, String]]("Options that can be sent to asciidoctor")

  /*
    logDocuments a boolean specifying if documents being processed should be logged on console. Type: boolean. Default: false
  */
  val asciidoctorLog = SettingKey[Boolean]("Boolean flag whether to log output on the console or not (Default: false)")
}
