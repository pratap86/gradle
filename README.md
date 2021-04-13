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
#### Gradle CLI Commands

|Commands|Description|
|---|---|
|`gradle --rerun-task build`|forcefully run all the tasks|
|`gradle tasks --all`|Display all the tasks|
|`gradle build --daemon`|kick start the daemon|
|`gradle build --no-daemon`|No daemon|
|`task1.dependsOn task2`|task2 executes before task1|
|`task1.finalizedBy task2`|task1 follow by task1|
|`gradle :web:clean`|only specific project did the clean in multi-module project|
|`allprojects{}`|Adding task across the modules|

#### Gradle Phases
|Phase|Description|
|---|---|
|`Initialization`|figure out the project, is it multi-mudule or single module project|
|`Configuration`|executes the task in DAG - Direct Asyclic Graph|
|`Execution`|Compiled, Testted, Jar/War|

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
