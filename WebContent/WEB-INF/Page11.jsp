<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Survey Page-11</title>
</head>
<body>
<form method = "post" action ="">
	<h3>
	Before we continue, I would like to ask you a question to make sure that you understand the scenario:
	</h3>
	<p id="page11-1">
	1. Will any of your neighbors or friends in the affected region have power from the power company? 
	</p>
		<input type="radio" name="page_11_1" value="Yes">Yes<br>
		<input type="radio" name="page_11_1" value="No">No<br>
	
	<p id="page11-2">
	2. Will your laptop work if it was charged overnight?
	</p>
		<input type="radio" name="page_11_2" value="Yes">Yes<br>
		<input type="radio" name="page_11_2" value="No">No<br>
	
	<p id="page11-3">
	3. Could you use the internet with your laptop?
	</p>
		<input type="radio" name="page_11_3" value="Yes">Yes<br>
		<input type="radio" name="page_11_3" value="No">No<br>
	
	<p id="page11-4">
	4. Could you use a cell phone to call the police in an emergency (assuming that your phone is charged enough)
	</p>
		<input type="radio" name="page_11_4" value="Yes">Yes<br>
		<input type="radio" name="page_11_4" value="No">No<br>
	
	<p id="page11-5">
	5. Could you spend the day in a heated shopping mall or restaurants?
	</p>
		<input type="radio" name="page_11_5" value="Yes">Yes<br>
		<input type="radio" name="page_11_5" value="No">No<br>
	
	<input type="submit" value="Next Page" action="page12.do"/>
</form>

















</body>
</html>