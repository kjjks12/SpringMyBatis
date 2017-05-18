<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>���� ����Ʈ ������</title>
</head>
<body>



	<div class="container">
		<h1>�Խ��� �� ���</h1>
		<a href="${pageContext.request.contextPath}/insert.jsp">��� �ϱ�</a>
		<div class="table-responsive">
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>��ȣ</th>
						<th>����</th>
						<th>�ۼ���</th>
						<th>��¥</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="board_dto" items="${sessionScope.board_list}">
						<tr>
							<th>${board_dto.no}</th>
							<th><a href="read.do?no=${board_dto.no}">${board_dto.subject}</a></th>
							<th>${board_dto.writer}</th>
							<th>${board_dto.date}</th>
						</tr>

					</c:forEach>
				</tbody>
			</table>
		</div><!-- table div -->
	</div>
</body>
</html>