<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Survey Page-08</title>
</head>
<body>
<p>
Before we continue, I would like to ask you a question to make sure that you understand the scenario:
</p>
<p>
When will the power come back on?
</p>

<form>
	<input type="radio" name="powerComebackDays" value="3 hours">3 hours<br>
	<input type="radio" name="powerComebackDays" value="1 day">1 day<br>
	<input type="radio" name="powerComebackDays" value="3 days">3 days<br>
	<input type="radio" name="powerComebackDays" value="7 days">7 days<br>
	<input type="radio" name="powerComebackDays" value="14 days">14 days<br>
</form>


<form method="get" action="Page-10.do">
	<button type="submit">Next Page</button>
</form>






</body>
</html>