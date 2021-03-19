<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BankBookSelect</h1>
	<table>
		<tr>
			<th>Number</th>
			<th>Name</th>
			<th>Rate</th>
			<th>Sale</th>
		</tr>
		<tr>
			<c:if test="${empty bDTO}">
				<td>상품이 없습니다.</td>
			</c:if>
			<td>${bDTO.bookNumber}<td>
			<td>${bDTO.bookName}<td>
			<td>${bDTO.bookRate}<td>
			<td>${bDTO.bookSale}<td>
		</tr>
		<c:if test="${not empty bDTO}">
			<form action="./bankbookUpdate?bookNumber=${bDTO.bookNumber}" method="get"><button>Update</button></form>
		</c:if>
	</table>
</body>
</html>