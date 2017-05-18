<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 페이지</title>
<jsp:include page="asset/header.jsp"></jsp:include>

<script>
	$(function() {

		$(document).on("click", "#btn_delete", function() {
			//alert("del/"+$(this).attr('value'));
			var url="${pageContext.request.contextPath}/del/"+$(this).attr('value');
			location.href=url;

		});

	})

	
</script>

<style>
th {
	text-align: center;
}

</style>
</head>
<body>
	<div class="container">
		<h3>상품 보기</h3>
		<div class="table-responsive">
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>상품번호</th>
						<th>상품코드</th>
						<th>상품이름</th>
						<th>상품가격</th>
						<th>상품설명</th>
						<th>삭제</th>
					</tr>
				</thead>
				<tbody>
					<!-- el 2.2 ${list.size()}가능하나 불안하면 이거 쓰래-->
					<c:choose>
						<c:when test="${fn:length(productList)==0}">
							<tr>
								<th colspan="6">검색된 레코드가 없습니다.</th>
							</tr>


						</c:when>
						<c:otherwise>
							<c:forEach var="productDTO" items="${productList}"
								varStatus="state">
								<tr>
									<th>${state.count}</th>
									<th>${productDTO.code}</th>
									<th>${productDTO.name}</th>
									<th><fmt:formatNumber value="${productDTO.price}"
											pattern="#,###" />원</th>
									<th>${productDTO.info}</th>
									<th><button class="btn btn-info" type="button"
											id="btn_delete" value="${productDTO.code}">삭제</button></th>
								</tr>
							</c:forEach>
						</c:otherwise>

					</c:choose>



				</tbody>
			</table>
		</div>
		<!-- table div -->
	</div>
	<!-- container div -->

</body>
</html>