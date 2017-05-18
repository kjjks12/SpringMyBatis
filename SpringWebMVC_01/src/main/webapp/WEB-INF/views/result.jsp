<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>결과 페이지</title>

</head>
<body>
<h1>result.jsp</h1>
<h3>
메시지 : ${message}
<br>
아이디 :${id}
</h3>
<hr>

<h1>@ModelAttribute  사용</h1>
<c:forEach  var="message" items="${jobs}">
${message}<br>

</c:forEach>

</body>
</html>