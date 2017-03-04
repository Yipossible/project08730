<jsp:include page="top6.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		    <h1>RESPONSE MODE - Final II</h1>
		</div>
		<div class="panel-body">
		<c:forEach var="error" items="${errors}">
			<h3 style="color:red"> ${error} </h3>
		</c:forEach>
<p>
In this case, I would like to know <strong>how much you would be willing to pay</strong>  
for this one-time <strong>partial backup service</strong> during the outage.
</p>

<h3>

</h3>

<form method ="post" action="page20.do">
	<table>
		<tr>
			<td></td>
			<td colspan = "3">
				<p>
				Would you be willing to pay this amount <strong>per day</strong> to get partial 
				(about one-fifth of your normal power) service during the outage?
				<jsp:include page="Slider.jsp" />
</body>
</html>