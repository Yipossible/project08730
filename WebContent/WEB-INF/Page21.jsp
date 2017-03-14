<jsp:include page="top6.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		    <h1>RESPONSE MODE - SOCIAL IV</h1>
		</div>
		<div class="panel-body">
		<c:forEach var="error" items="${errors}">
			<h3 style="color:red"> ${error} </h3>
		</c:forEach>
<p>
In addition, I would like to know how much you would be willing to pay for this 
one-time partial backup service and to help others within the community during 
the outage. 
</p>
<br>
<p>
How much you would be willing to pay for this one-time partial backup service and 
to help the entire community during the outage?

</p>


<p>
${initParam.page21_image}
</p>

<form method ="post" action="page21.do">
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