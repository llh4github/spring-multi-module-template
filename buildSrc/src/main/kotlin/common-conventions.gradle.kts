plugins {
    id("org.jetbrains.kotlin.jvm")
}
val libs : VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")
repositories {
    mavenCentral()
}
group = project.group.toString()
version = project.version.toString()


dependencies {
    constraints {
        // Define dependency versions as constraints
        implementation("org.apache.commons:commons-text:1.11.0")
    }
    implementation("io.github.oshai:kotlin-logging-jvm:${libs.findVersion("oshaiKotlinLogging").get()}")
    // Use JUnit Jupiter for testing.
    testImplementation("org.junit.jupiter:junit-jupiter:${libs.findVersion("junit5").get()}")
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(libs.findVersion("jdk").get().toString()))
    }
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
