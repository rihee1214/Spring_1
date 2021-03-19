<%@page import="com.iu.s1.bankbook.BankBookDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% ArrayList<BankBookDTO> arr = (ArrayList<BankBookDTO>)request.getAttribute("bblist"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BankBookList</h1>
		<table>
			<tr>
				<th>Number</th>
				<th>Name</th>
				<th>Rate</th>
				<th>Sale</th>
			</tr>
			
			<tr><%for(int i = 0 ; i < arr.size(); i++){ %>
				<td><%=arr.get(i).getBookNumber() %></td>
				<td><a href="./bankbookSelect.do?booknumber=<%=arr.get(i).getBookNumber()%>"><%=arr.get(i).getBookName() %></a></td>
				<td><%=arr.get(i).getBookRate() %></td>
				<td><%=arr.get(i).getBookSale() %></td>
			</tr><%} %>
		</table>
</body>
</html>