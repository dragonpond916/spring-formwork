pluginManagement {
  repositories {
    gradlePluginPortal()
  }
}

rootProject.name = "spring-formwork"

//프로젝트 전체에서 공통으로 사용되는 보조 모듈 추가
//ex : db, message, 비즈니스 exception 등의 관리
include("assistance")

//비즈니스 API 모듈 추가
include("sample-api")

//비즈니스 도메인 모듈 추가
include("sample-domain")
