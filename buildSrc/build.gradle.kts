plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    mavenLocal()
    gradlePluginPortal()
}

dependencies {
    implementation(libs.kotlin.gradle)
    implementation(libs.springBoot.gradle)
    implementation(libs.kotlin.allopen)
    implementation(libs.kotlin.noarg)
    implementation(libs.graalvm.native)
    implementation(libs.oshai.kotlinLogging)
    implementation(libs.slf4j.api)
    implementation(libs.detekt)
}
