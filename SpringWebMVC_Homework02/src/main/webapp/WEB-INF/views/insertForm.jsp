<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품등록</title>
<jsp:include page="asset/header.jsp"></jsp:include>
<script>
	$(function() {
		/*    $('#buttonSend').click(function(){
		 alert('a');
		
		 location.href='insertForm.ko/'+
		 $('#no').val()+'/'+
		 $('#code').val()+'/'+
		 $('#name').val()+'/'+
		 $('#info').val() 

		 });  
		 */
	});
</script>
<style>
textarea {
	resize:none;
}
</style>
</head>


<body>
	<div class="container">
		<h3>상품 등록</h3>
			<form action="insert.ko" method="post">
				<div class="table-responsive">
					<table class="table table-bordered">
						<tr>
							<td>상품코드</td>
							<td><input type="text" name="code"></td>
						</tr>
						<tr>
							<td>상품이름</td>
							<td><input type="text" name="name"></td>
						</tr>
						<tr>
							<td>상품가격</td>
							<td><input type="text" name="price">원</td>
						</tr>
						<tr>
							<td>상품정보</td>
							<td><textarea rows="10" cols="80" name="info"></textarea></td>
						</tr>
					</table>
				</div>
			<input type="submit" value="전송하기" />
			</form>
			<!-- table div -->

	</div>
	<!-- container div -->



</body>
</html>