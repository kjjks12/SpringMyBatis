<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>등록 완료후 결과뷰</h1>
<h3>
	message :${sessionScope.message}
</h3>


<hr>
<h1>Command 객체 사용 하기 -DTO객체이름의 첫글자만 소문자로</h1>
<h2>
아이디 :${mememberDTO.id}<br>
이름 :${mememberDTO.name}<br>
나이 :${mememberDTO.age}<br>
주소 :${mememberDTO.addr}<br>
</h2>


<hr>
<h1>@ModelAttribute("dto")사용</h1>
<h2>
아이디 :${dto.id}<br>
이름 :${dto.name}<br>
나이 :${dto.age}<br>
주소 :${dto.addr}<br>
</h2>

</body>
</html>