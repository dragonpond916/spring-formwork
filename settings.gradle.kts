pluginManagement {
  repositories {
    gradlePluginPortal()
  }
}
plugins {
  id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "spring-formwork"

includeBuild("gradle/convention")
include("dependencyManagement")
project(":dependencyManagement").projectDir = File(rootDir, "gradle")
project(":dependencyManagement").buildFileName = "dependencies.gradle.kts"
//프로젝트 전체에서 공통으로 사용되는 보조 모듈 추가
//ex : db, message, 비즈니스 exception 등의 관리
include("assistance")

//비즈니스 API 모듈 추가
include("sample-internal-api")

//비즈니스 도메인 모듈 추가
include("sample-domain")
include("client")
include("client:beatch-weather-client")
findProject(":client:beatch-weather-client")?.name = "beatch-weather-client"
include("flyway")
include("dependencyManagement")
