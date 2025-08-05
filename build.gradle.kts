plugins {
    id("java")
    application
}

application {
    mainClass.set("it.rfmariano.lox.Lox")
}

group = "it.rfmariano.lox"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
