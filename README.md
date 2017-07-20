# robocode-scala
Example Scala Robocode Robot

### Usage

    > sbt assembly

Now you'll have an awesome new `ScalaBot` in a single JAR file: `target/scala_2.12/ScalaBot_1.0.jar`.

Copy this file to `/robocode/robots` or create an alias from `/robocode/robots` to `target/scala_2.12/ScalaBot_1.0.jar`

Notes:
* resource property file and directory name is significant
* copied robocode.jar from robocode installation. it is out of date on maven central.  
* robocode.jar is excluded from fat jar
* alternative to creating fat jar is to add scala-library to robocode startup script
