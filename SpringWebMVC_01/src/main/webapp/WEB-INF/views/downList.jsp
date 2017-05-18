<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="header.jsp"/>
	<meta charset="UTF-8">
	<title>Insert title here</title></head>
<body>
	<div class="container">
	<h1>파일 list</h1>
		<table class="table">
			<tr>
				<td>번호</td>
				<td>파일이름</td>
			</tr>

			<c:forEach var="filename" items="${files}" varStatus="state">
				<tr>
					<td>${state.count}</td>
					<td><a href="downLoad.do?filename=${filename}">${filename}</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>