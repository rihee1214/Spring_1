<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BankBookAdd</h1>
	<form action="./bankbookList" method="post">
		<input type="text" id="bookName" placeholder="Enter bookName" name="bookName">
		<input type="text" id="bookRate" placeholder="Enter bookRate" name="bookRate">
		<select id="bookSale" name="bookSale">
			<option>Y</option>
			<option>N</option>
		</select>
		<button>Send</button>
	</form>
</body>
</html>