## > restful 171013
### > Mybatis Bean 세팅
SqlSessionFactory ->  sessionTemplate DI 주입 

### > Controller Param @RequestBody 설정
model의 변수명과 같아야 JSON형태로 바로 받을 수 있다.

request내의 {} 와  @PathVariable 의 변수가 같으면 자동 매핑 

### > Eclipse plugin for MyBatis
content assists and validations when editing MyBatis related files.
https://github.com/mybatis/mybatipse

### > REST 어플리케이션 예외처리 
예외처리 전담 컨트롤러 
1. 전역처리 Global level- @ControllerAdvice
2. 컨트롤러단에서 처리 Controller level- @ExceptionHander
 @ExceptionHander(value = Exception.class)
 
3. 메소드 단위처리 Method level- try/catch

#### > Mybatis 구문들이 예외를 먹는다?
Exception(checkedException)
||
SQLException , RuntimeException(상속받아서 예외를 처리해 주지 않아도 됨)

Mybatis는 DB에서 처리하는 checkedException을 RuntimeException 처리

#### > Mybatis 명시적 예외처리가 필요없는 RuntimeException 타입으로 작성

#### > Mybatis 오류는 원래  ClientException 처리 ==> Controller의 GlobalException까지 버려두지 않는다.

### > REST Client 작성
Ex)NGINX
https://www.nginx.com/blog/introduction-to-microservices/

restTemplate.getForentity ==> Json그대로 가져온다.
restTemplate.getForObject ==> API Response Type

### > Mashup
DAO에서 restTemplate 호출로 RESTful 데이터를 연동
메타데이터나 데이터를 같이 보내주는것이 통상
자세히 보려면 Naver나 Google API 받아오기

### > HTTP Client 모듈 
REST Client 이전 (스프링 사용 이전)
안드로이드는 Ok Client 사용
