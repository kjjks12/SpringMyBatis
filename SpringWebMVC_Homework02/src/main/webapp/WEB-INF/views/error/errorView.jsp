<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<jsp:include page="/WEB-INF/views/asset/header.jsp"/>
<%--  <jsp:include page="../../../header.jsp"/> --%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container">
<h3>에러 페이지</h3>
<br>
${errMessage}
<%-- ${exception.message} --%><br>
<hr>
<%-- ${exception.getClass}
 --%>
</div>


</body>
</html>