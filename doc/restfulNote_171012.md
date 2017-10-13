## > restful 171012
### > 데이터 표현 
Data -> Tabular Data

#### > Data Transfer Object 디자인 패턴
java.io.Serializable 인터페이스 구현 - 직렬화 지원
Immutable 객체로 만듬 - setter 포함하지 않음
도메인 객체를 래핑(wrapping)

#### > JSON(JavaScript Object Notation)
www.json.org
lightweight Data 교환형식
Javascript에서 객체를 만들 때 사용하는 표현식
특정언어에 종속되지 않으며, 대부분의 프로그래밍 언어에서 JSON 포맷의 데이터를 핸들링 할 수 있는 라이브러리 제공

#### > JSON 형식
1.name-value 형식의 쌍(pair):여러가지 언어들에서 object, hashtable, struct로실현되었다.
2.값들의 순서화 된 리스트 형식 :여러가지 언어들에서 array, list로실현되었다.

#### > JSON 라이브러리 Jackson
jackson.codehaus.org
Jackson은 JSON <-> Java 객체
스프링부트에는 포함되어 있음 

#### > JSON 라이브러리 gson
Jackson보다 직관적 

#### > API 응답 포맷
별도로 포맷을 설정하는 것이 좋다 --> error 처리
반드시 페이징 처리를 해줘야 한다.

#### > DataSource
커넥션 객체를 확보해서 연결 
1. DB연동 Driver
2. 위치, IP, Domain
3. ID/PW
4. Connection Pool

application.properties

#### > Mysql 설치

#### > JUnit을 이용한 DI 클래스 테스트
Test케이스를 만드는 Rule
1. 클래스 생성시 Test Postfix Ex) ParkDAOTest
2. @RunWith(SpringRunner.class), @SpringBootTest 클래스에 삽입
3. @Test 메서드에 삽입
