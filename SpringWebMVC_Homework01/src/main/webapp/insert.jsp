<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="board/insert.do" method="post">
	<table>
		<tr>
			<td>번호</td>
			<td><input type="text" name="no"/></td>
		</tr>
		<tr>
			<td>제목</td>
			<td><input type="text" name="subject"/></td>
		</tr>
		<tr>
			<td>작성자</td>
			<td><input type="text" name="writer"/></td>
		</tr>
		<tr>
			<td>날짜</td>
			<td><input type="text" name="date"/></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><input type="text" name="content"/></td>
		</tr>

	</table>
<input type="submit" value="제출하기"/>
</form>

</body>
</html>