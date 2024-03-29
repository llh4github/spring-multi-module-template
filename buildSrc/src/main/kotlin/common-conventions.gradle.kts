/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm")
    id("org.graalvm.buildtools.native")
}
val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")
repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}
group = project.group.toString()
version = project.version.toString()

dependencies {
    constraints {
        // Define dependency versions as constraints
        implementation("org.apache.commons:commons-text:1.11.0")

    }
    implementation("org.slf4j:slf4j-api:${libs.findVersion("slf4j").get()}")
    implementation("ch.qos.logback:logback-classic:${libs.findVersion("logback").get()}")
    implementation("ch.qos.logback:logback-core:${libs.findVersion("logback").get()}")
    implementation("io.github.oshai:kotlin-logging-jvm:${libs.findVersion("oshaiKotlinLogging").get()}")
    // Use JUnit Jupiter for testing.
    testImplementation("org.junit.jupiter:junit-jupiter:${libs.findVersion("junit5").get()}")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(libs.findVersion("jdk").get().toString()))
    }
//    withSourcesJar()
//    withJavadocJar()
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
