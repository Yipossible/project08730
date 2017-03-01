<jsp:include page="top7.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		</div>
		<div class="panel-body">
<c:forEach var="error" items="${errors}">
			<h3 style="color:red"> ${error} </h3>
		</c:forEach>
<br>

<form method ="post" action="page24.do">
	<p>4. Please describe your experience with power outages in your lifetime:</p>
	<input type="radio" name="experience" value=" I have experienced more than one outage."  style="margin-right:10px;"> I have experienced more than one outage.
	<input type="radio" name="experience" value=" I have experienced one outage."  style="margin-right:10px;"> I have experienced one outage. 
	<input type="radio" name="experience" value="I have never experienced an outage."  style="margin-right:10px;">I have never experienced an outage.
	
	<p>5. Please tell me about whether you have the following items available to you in the case of a blackout :</p>
	<input type="checkbox" name="available_1" value="  Flashlights in easy-to-find places"  style="margin-right:10px;">  Flashlights in easy-to-find places
	<br><input type="checkbox" name="available_2" value="  Wind up or crank operated radio"  style="margin-right:10px;">  Wind up or crank operated radio 
	<br><input type="checkbox" name="available_3" value="  Wind up or crank cell phone charger"  style="margin-right:10px;">   Wind up or crank cell phone charger
	<br><input type="checkbox" name="available_4" value="  Camping lantern"  style="margin-right:10px;">    Camping lantern
	<br><input type="checkbox" name="available_5" value="  Camping cook stove"  style="margin-right:10px;">     Camping cook stove 
	<br><input type="checkbox" name="available_6" value="  Solar energy storage"  style="margin-right:10px;">       Solar energy storage
	<br><input type="checkbox" name="available_7" value="  Portable generator."  style="margin-right:10px;">     Portable generator.
	<br><input type="checkbox" name="available_8" value="  Stand-by generator."  style="margin-right:10px;">     Stand-by generator.
	<br><input type="checkbox" name="available_9" value="  Other non-generator."  style="margin-right:10px;">    Other non-generator. 
	
	<br><br><input type="submit" class="btn btn-info" name="submit" value="Next" style="float: right;"/>
</form>
</body>
</html>