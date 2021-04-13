# Gradle
  - Gradle is build automation tool, which addresses the disadvantages of Ant(Customization wrt Project structure) & Maven(Customization).

#### Why Gradle
  - DSL(Domain Specific Language), build.gradle in kotlin/groovy
  - CLI(Command Line Interface)
  - gradle uses in java, C++, Kotlin, groovy, swift
  - Repositories - Maven Central, Maven Local, JCenter, File System
  - Incremental Build
  - Build Cache
  - Daemon - keeps the prev build information
  - Plugins - jar, war, jacoco
  - bootRun

#### Important facts about Gradle are;
  - Gradle uses the groovy or kotlin to write a gradle.build file
  - Gradle is super fast because it does Incremental build, Build Cache & Daemon Process
  - GStrings
  - Groovy
  - Every build.gradle has an object of <b>Project</b> Gradle api class
  - finalizedBy
  - gretty plugin can be used to run a web application
  - apprun task can be used to run the web application when using gretty plugin
  - include 'web', 'services', 'data', 'integration' is the correct syntax to declare child projects in a parents settings.gradle
  - jTR task will generate a Jacoco Test Report
  - correct Plugin implementation;
  ``` ruby
    public class MyAWSPlugin implements Plugin<Project>
  ```
  - <b>buildSrc</b> is the name of the folder under our project where we put our plugin code
