<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>��� �Ϸ��� �����</h1>
<h3>
	message :${sessionScope.message}
</h3>


<hr>
<h1>Command ��ü ��� �ϱ� -DTO��ü�̸��� ù���ڸ� �ҹ��ڷ�</h1>
<h2>
���̵� :${mememberDTO.id}<br>
�̸� :${mememberDTO.name}<br>
���� :${mememberDTO.age}<br>
�ּ� :${mememberDTO.addr}<br>
</h2>


<hr>
<h1>@ModelAttribute("dto")���</h1>
<h2>
���̵� :${dto.id}<br>
�̸� :${dto.name}<br>
���� :${dto.age}<br>
�ּ� :${dto.addr}<br>
</h2>

</body>
</html>