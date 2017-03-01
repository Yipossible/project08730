<jsp:include page="top4.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h3>
	Before we continue, I would like to ask you a question to make sure that you understand the scenario:
	</h3>
		</div>
		<div class="panel-body">
		<c:forEach var="error" items="${errors}">
			<h3 style="color:red"> ${error} </h3>
		</c:forEach>
<form method = "post" action ="page11.do">
	
	<p id="page11-1">
	1. Will any of your neighbors or friends in the affected region have power from the power company? 
	</p>
		<input type="radio" name="page_11_1" value="Yes"  style="margin-right:10px">Yes<br>
		<input type="radio" name="page_11_1" value="No"  style="margin-right:10px">No<br>
	
	<p id="page11-2">
	2. Will your laptop work if it was charged overnight?
	</p>
		<input type="radio" name="page_11_2" value="Yes" style="margin-right:10px">Yes<br>
		<input type="radio" name="page_11_2" value="No" style="margin-right:10px">No<br>
	
	<p id="page11-3">
	3. Could you use the internet with your laptop?
	</p>
		<input type="radio" name="page_11_3" value="Yes" style="margin-right:10px">Yes<br>
		<input type="radio" name="page_11_3" value="No" style="margin-right:10px">No<br>
	
	<p id="page11-4">
	4. Could you use a cell phone to call the police in an emergency (assuming that your phone is charged enough)
	</p>
		<input type="radio" name="page_11_4" value="Yes" style="margin-right:10px">Yes<br>
		<input type="radio" name="page_11_4" value="No" style="margin-right:10px">No<br>
	
	<p id="page11-5">
	5. Could you spend the day in a heated shopping mall or restaurants?
	</p>
		<input type="radio" name="page_11_5" value="Yes" style="margin-right:10px">Yes<br>
		<input type="radio" name="page_11_5" value="No" style="margin-right:10px">No<br>
	
	<input type="submit" class="btn btn-info" action="page23.do" name="submit" value="Next" style="float: right;"/>
</form>

















</body>
</html>