<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BankBookUpdate</h1>
	<form action="./bankbookUpdate" method="post">
		<input type = "hidden" id="bookNumber" name="bookNumber">${bookNumber}
		<label>Name : </label><input type="text" id="bookName" name="bookName">
		<label>Rate : </label><input type="text" id="bookRate" name="bookRate">
		<label>Sale : </label><select id="bookSale" name="bookSale"><option>Y</option><option>N</option></select>
		<button>Submit</button>
	</form>
</body>
</html>