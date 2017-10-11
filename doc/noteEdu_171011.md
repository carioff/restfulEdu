# 171011 restful

mime

URI
프로토콜://서버/리소스

요청 Method
1. Get
2. Post: Entity를 포함
Head: Http Header 정보만 수신
Trace: Request의 루프백 테스트
3. Put: URL에 자원을 생성
4. Delete: URL의 자원을 삭제
Options: 응답 가능한 HTTP 메소드 요청
Connect: 터널링의 목적으로 연결 요청 (프록시에서 사용)

URI재사용 가능 

Restful기반 웹 서비스
Roy Field 박사학위 논문에서 제안, JSON기반
PUT/member/JSON..

2000년에 제안, HTTP 프로토콜로 데이터를 전달하는 프레임워크

REST API - 소유자의 자원에 접근할 수 있는 API
RESTful 하다 - REST API 를 제공하는 웹 서비스

SOAP vs REST API
https://www.slideshare.net/seunghochoi4/soap-restful

스프링 프레임워크 특징
1. 컨테이너 역할
Java 객체의 LifeCycle을 관리하며, Spring 컨테이너로 부터 필요한 객체를 가져와 사용

2. DI(Dependency Injection) 지원
설정 파일이나 어노테이션을 통해서 객체 간의 의존관계를 설정할 수 있도록 하고 있다.

3. AOP(Aspect Oriented Programming) 지원
트랜잭션이나 로깅, 보안과 같이 공통적으로 필요로 하는 모듈들을 실제 핵심에서 분리해서 
적용할 수 있다.

4. POJO(Plain Old Java Object) 지원
스프링 컨테이너에 저장되는 Java객체는 특정한 인터페이스를 구현하거나, 특정 클래스를
상속받지 않아도 된다.

5. 트랜잭션 처리를 위한 일관된 방법을 지원
JDBC, JTA 등 어떤 트랜잭션을 사용하던 설정을 통해 정보를 관리하므로 트랜잭션 구현에
상관없이 동일한 코드 사용가능

6. Persistence과 관련된 다양한 API 지원
Spring은 Mybatis, Hibernate등 데이터베이스 처리를 위한 ORM 프레임워크들과의 연동 지원
Object Relational Mapping

Maven
의존 라이브러리를 간편하게 추가할 수 있도록 의존성 주입을 제공
Maven Repository에 업로드함으로써 자동 추가 가능
프로젝트 자동 구성

스프링부트 - 차세대 스프링 프레임워크
스프링기반 product-ready 어플개발
Convention over Configuration 을 따름
톰캣이 내장되어 단독으로 실행 가능
설정을 최대한 줄이고 XML 설정파일 필요 없음

Spring Starter Project로 프로젝트 생성

Jar: 톰캣 내장<->War: 다른 was에 로딩 
Kotlin <-> Java 1:1 변환 가능

SpringBoot 세팅
Core> devtools
Web> web

mvnw maven wrapper: 윈도우에서 실행할때 

<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
</dependency>
		starter 는 종합 툴킷
		
@RestController 
글자 그대로 화면에 호출

@Controller는 return 관련 폴더로 링크		
메소드에 @ResponseBody 로 어노테이션이 되어 있다면 메소드에서 리턴되는 값은 View 를 통해서 
출력되지 않고 HTTP Response Body 에 직접 쓰여지게 됩니다.
이때 쓰여지기 전에 리턴되는 데이터 타입에 따라 MessageConverter 에서 변환이 이뤄진 후 쓰여지게 됩니다.


#### > SpringMVC
#### > OpenAPI
프로그래밍에서 사용할 수 있는 개방되어 있는 상태의 인터페이스

#### > REST(REpresentational Safe Transfer)란
HTTP URI + HTTP Method
Post: Create
Get: Read
Put: Update or Create
Delete: Delete

##### > 기존 방식과 비교
GET/ list.do?no=510&name=java VS GET/bbs/java/510

/users GET POST
/users{userId} GET PUT DELETE
계층적 구조라 JAVA객체와 매칭이 잘 됨

@RequestBody: HTTP RequestBody를 Java객체로 전달 받겠다.
@ResponseBody: Java 객체를 ResponseBody로 전송할 수 있다.

#### > MVC 패턴의 개념
*Model: 애플리케이션 정보(Data, Business Logic 포함) ==> 핵심*
안타깝게도 Java(Eclipse)에서는 자동 생성기능이 없다. 

View: Presentation Logic
Controller: Model View 사이 상호작용 관리

#### > Front Controller 아키텍쳐
FrontController - Controller - Service - Persistence - DB

Presentation - Business - DataAccess


