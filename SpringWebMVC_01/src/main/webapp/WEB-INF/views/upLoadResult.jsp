<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<jsp:include page="header.jsp" />
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1 align="center">업로드 결과</h1>
		<div class="row">
			<h3>
				작성자 :${name}<br> 파일이름(OrignalFileName) :${fileName}<br>
				파일이름(getName) :${fileName2}<br> 경로 :${path}<br> 파일크기:
				<fmt:formatNumber value="${fileSize}" pattern="#,###" />
				Byte <br>
			</h3>

		</div>
		<hr>
		<div class="row">
		<h1>UpLoadDTO Command객체 이용하기</h1>
			<h3>
				작성자 :${upLoadDTO.name}<br>
				파일이름(OrignalFileName) :${upLoadDTO.file.originalFilename}<br>
				파일크기:<fmt:formatNumber value="${upLoadDTO.fileSize}" pattern="#,###" />
				Byte <br>
			</h3>

		</div>

	</div>

</body>
</html>