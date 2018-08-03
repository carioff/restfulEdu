# REST원칙 180801
## 확장성 있는 웹 서비스를 위한 소프트웨어 아키텍처 
### 1. Client-Server
### 2. Stateless
### 3. Cacheable
### 4. Layered system
### 5. Code on demand(ptional)
### 6. Uniform interface - uri에 의해 식별되어 짐, 데이터 구조는 강제하지 않음(json or xml)
- Resource Identifier
- Resource Representations
- Self-Descriptive Message
- HATOEAS(Hypermedia As The Engine Of Application State)
    > HTTP 응답에 다음 Action이나 관계되는 리소스에 대한 HTTP Link를 함께 리턴
    >> 페이지 처리의 경우 리턴시, 전후 페이지에 대한 링크를 제공, 연관된 리소스에 대한 디테일한 링크를 표시
---
## Resource Identifier-URI
## Representation 
- 서버가 보내준 것은 Resource가 아니라 Representation
- content negotiation, 일반적으로 proactive negotiation에 의해 서버가 선택 
- 적절한 Representation이 선택되지 않으면 406 Error
- 어떤 리소스의 특정 시점의 상태를 반영하고 있는 정보 = data + metadata

## RESTful 문서화
- 서비스 entry point
- 각 리소스에 대한 경로
- 각 리소스에 대한 HTTP 메서드 - GET, POST, PUT, DELETE
- 파라미터 목록
- 요청과 응답에 대한 양식

# 180802
## 스프링 5.0 변화
### 비동기 지원을 위해 
- For non blocking Netty, Servlet 3.1
- Spring MVC -> WebFlux 
- Data Reactive Repository(Mongo, Redis, Cassandra)

## 스프링 프레임워크
- IoC Callback을 하려면 Container가 객체의 Life-Cycle을 관리

# 180803
## 예외처리
- 기본적으로 Controller에서 모아서 
- @ControllerAdvice: 스프링 어플리케이션의 모든 예외를 처리
- @ExceptionHandler: 예외를 처리할 클래스를 정의

## Logback설정
- 
## 캐시
- Redis 세션관리
- Ehcache 로컬캐시
- Hazelcast 분산캐시
- Jcache

## 빌드
- 개발/빌드 respository는 다르다 -> 처음 maven install시 target에 jar파일 생성

