<jsp:include page="top3.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		    <h1>RESPONSE MODE - INITIAL I</h1>
		</div>
		<div class="panel-body">
		<c:forEach var="error" items="${errors}">
			<h3 style="color:red"> ${error} </h3>
		</c:forEach>
<p>
In this case, I would like to know <strong>how much you would be willing to pay</strong>  
for this <strong>service</strong> during the outage. For each of the following questions, 
please indicate whether you would be willing to pay that amount of money 
in exchange for the partial service. 
</p>


<form method ="post" action="page07.do">
				<p>
				Would you be willing to pay this amount <strong>per day</strong> to get full service during the outage?
				<jsp:include page="Slider.jsp" />
				
</body>
</html>