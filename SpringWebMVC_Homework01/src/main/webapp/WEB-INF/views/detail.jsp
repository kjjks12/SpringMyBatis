<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Board 상세보기 페이지</title>
</head>
<body>
	<div class="container">
		<h1>게시판 상세보기</h1>

		<table class="table table-bordered">
			<tr>
				<th>번호</th>
				<th>${board_dto.no}</th>
			</tr>
			<tr>
				<th>제목</th>
				<th>${board_dto.subject}</th>
			</tr>
			<tr>
				<th>작성자</th>
				<th>${board_dto.writer}</th>
			</tr>
			<tr>
				<th>날짜</th>

				<th>${board_dto.date}</th>
			</tr>
			<tr>
				<th>내용</th>

				<th>${board_dto.content}</th>
			</tr>

		</table>
	</div>
</body>
</html>