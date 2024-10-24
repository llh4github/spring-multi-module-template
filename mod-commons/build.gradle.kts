plugins {
    id("common-conventions")
    `java-library`
}

dependencies {
    compileOnly(libs.swagger.annotations)
    compileOnly(libs.slf4j.api)
    compileOnly(libs.logback.core)
    compileOnly(libs.logback.classic)
}
