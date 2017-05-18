<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<jsp:include page="/WEB-INF/views/header.jsp"/>
<%--  <jsp:include page="../../../header.jsp"/> --%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container">
<h1>ArithmeticException 에러 페이지</h1>
<br>
${errorMessage}<br>
<hr>
${errorInfo}

</div>


</body>
</html>