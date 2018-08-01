# REST원칙
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



