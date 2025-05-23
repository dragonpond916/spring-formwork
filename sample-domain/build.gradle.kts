import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
  java
  id("org.springframework.boot") version "3.4.4"
  id("io.spring.dependency-management") version "1.1.7"
}

group = "com.domain"
version = "0.0.1-SNAPSHOT"

java {
  toolchain {
    languageVersion = JavaLanguageVersion.of(23)
  }
}

configurations {
  compileOnly {
    extendsFrom(configurations.annotationProcessor.get())
  }
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter-data-jpa")
  compileOnly("org.projectlombok:lombok")
  annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
  annotationProcessor("org.projectlombok:lombok")
  testImplementation("org.springframework.boot:spring-boot-starter-test")
  testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
  useJUnitPlatform()
}

tasks.apply {
  bootJar {
    enabled = false
  }
}
