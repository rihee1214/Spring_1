<%@page import="com.iu.s1.bankbook.BankBookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% BankBookDTO bDTO = (BankBookDTO)request.getAttribute("dto"); %>
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
			<td><%=bDTO.getBookNumber() %><td>
			<td><%=bDTO.getBookName() %><td>
			<td><%=bDTO.getBookRate() %><td>
			<td><%=bDTO.getBookSale() %><td>
		</tr>
	</table>
</body>
</html>