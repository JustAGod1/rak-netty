buildscript {
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.0")
    }
}

plugins {

    java
    kotlin("jvm") version "1.4.0"
}

group "org.example"
version "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    "implementation"("org.jetbrains.kotlin:kotlin-stdlib")
    "testCompile"("junit:junit:4.12")
    "compile"(project(":SLikeNet"))
    add("compile", "io.netty:netty-all:4.1.33.Final")
}
