<jsp:include page="top6.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		    <h1>5) An outage and critical private/social services</h1>
		</div>
		<div class="panel-body">
		<c:forEach var="error" items="${errors}">
			<h3 style="color:red"> ${error} </h3>
		</c:forEach>

<p>
<b>

</b>
</p>

<p>
While we mostly considered the inconveniences and some monetary losses from 
the household level, sometimes an outage do pose a serious risk of death or 
major property losses. For example, outages in extreme winter can cause deaths
 and major property damages (e.g., frozen water pipes). 

<b>NEED TO BE AN INTERACTIVE SLIDES HERE</b>
</p>

<form>
	<input type="submit" class="btn btn-info"  style="float: right;" name = "button" value="Next" action="">
</form>
</body>
</html>