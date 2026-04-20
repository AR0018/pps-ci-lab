plugins {
    java
    scala
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala3-library_3:3.7.4")
}

application {
    // Set the Main.scala file as main project class?
    mainClass.set("it.unibo.interoperability.Main")
}
