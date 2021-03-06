<jsp:include page="top3.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		    <h1>Main Survey: Blackout in late December</h1>
		</div>
		<div class="panel-body">
		<c:forEach var="error" items="${errors}">
			<h3 style="color:red"> ${error} </h3>
		</c:forEach>
			<p>1) Hypothetical blackout scenario</p>
			In this section, I would like you to imagine the following situation: 
			A large regional blackout occurs in late December at a time when you and all your household members are at home.<br> 
	
	<iframe width="560" height="315" src="${initParam.page05_video}" frameborder="0" allowfullscreen></iframe>
	<br>
	Before we continue, I would like to ask you a question to make sure you understand the scenario: <br>
	When will the power come back on?
	<input type="radio" name="ans" value="3 hours">3 hours
	<input type="radio" name="ans" value="3 days">3 days
	<input type="radio" name="ans" value="7 days">7 days
	<input type="radio" name="ans" value="2 weeks">2 weeks
	<input type="radio" name="ans" value="1 month">1 month
	<form method="get" action="page05.do">
		<input type="submit" class="btn btn-info" name="submit" value="Next" style="float: right;"/>
	</form>
	
</body></html>

