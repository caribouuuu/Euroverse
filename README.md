
[<img src="./Euroverse/WebContent/resources/images/icon/euroverse_logo.png" width="260">](http://15.165.86.252:8080/)
# Euroverse
유로버스 : 여행정보 및 플래너 제공 사이트 
> 여행의 시작인 항공권 및 숙소 결제부터 플래너 작성, 예산 점검, 동행찾기, 실시간 채팅, 그리고 커뮤니티를 통한 유저간의 소통까지 제공하는 유럽여행 종합 플랫폼 '[Euroverse](http://15.165.86.252:8080/)'

- 개발 기간 : 2020.01.01 ~ 2020.03.11 (총 2개월)
  - 분석 및 설계 : 2020.01.01 ~ 2020.01.24 
  - 구현 : 2020.01.27 ~ 2020.03.07
- 참여 인원 : 6명
- 아키텍처 : Model 2 MVC Web Architecture Pattern
- 모듈 : 회원관리 / 플래너 / 주문관리 / 커뮤니티 / 채팅 및 알람


## 기술 스택
- **Front-end** : Javascript, HTML5/CSS3, JSP, BootStrap, JQuery, Ajax
- **Back-end** : Java, Spring Framework 4.0.9, MyBatis, Apache Tomcat
- **Database** : Oracle 10g, MongoDB 3.6.17
- **Tool** : Eclipse, VSCode, DBeaver, SqlDeveloper 
- **VCS** : Github
- **Library** : JDBC, DBCP, JUnit4, Log4jdbc, AspectJ, Jackson, JSON-Simple, SweetAlert, CKEditor4, Foreign exchange rates API, 공공데이터포털API, 청기와 LAB, I'mPort API, JavaMail API, FullCalendar, Selenium, SummerNote, 네이버로그인 API, 카카오로그인 API, GoogleMap API, Owl Carousel, AOS, Swiper API

## 담당 모듈: 플래너 서비스
### 1.플래너 생성 
  #### 1.1 투두 리스트
  - 투두 리스트 작성, 삭제, 칸반보드 관리(Drag&Drop)
  #### 1.2 여행루트
  - 여행루트 편집 페이지에서 지도의 도시를 선택해 여행루트 편집
  - 도시 추가, 순서 변경, 삭제
  - 도시간 이동수단 변경
  #### 1.3 일정표
  - 여행루트 편집시 자동으로 생성되는 일정표
  - 시간대별 일정 상세내용, 카테고리, 예산 기입 
  #### 1.4 준비물 체크리스트
  - 준비물 항목 등록, 삭제, 체크
  #### 1.5 스티커 메모
  - 해당 플래너 페이지 내에서 자유롭게 이동 가능한 스티커 메모
  - 메모 등록, 수정, 삭제
  
### 2. 플래너 공유
  #### 2.1 플래너 동행
  - 플래너에 참여자 초대
  - 플래너 참여자 강퇴(플래너 최초 생성자에 한함)
  - 플래너 탈퇴(플래너 참여자에 한함)
  #### 2.2 플래너 게시판
  - '플래너 공유 게시판'에 자신의 플래너 게시
  - '플래너 공유 게시판'에 게시된 다른 사용자의 플래너 공유받기



## 추가
- 아마존 웹 서비스(AWS) EC2 배포를 통해 웹 서버 구축 방법 이해


## 참고
- 항공권 및 숙소 검색기능 빠개짐...... (Selenium AWS에 이식 실패)
- [프로젝트 발표](https://www.youtube.com/watch?v=xGH5Dzj8rAY)



