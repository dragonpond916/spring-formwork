logger.lifecycle("::: gradle/convention/build.gradle.kts :::")

plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation(gradleKotlinDsl())
    implementation(libs.gradlePlugin.springBoot)
}
