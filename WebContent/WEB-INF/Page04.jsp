<jsp:include page="top2.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		    <h1>Part A. Information about your household</h1>
		</div>
		<div class="panel-body">
		<c:forEach var="error" items="${errors}">
			<h3 style="color:red"> ${error} </h3>
		</c:forEach>
		<form action="" method="POST">
			<p>4.	Do you work from home the majority of the time? (Is your home a place both for business and living?) </p>
			<div class="input-group">
			<input type="radio" name="workFromHome" value="Yes" style="margin-right:10px"> Yes
			<input type="radio" name="workFromHome" value="No" style="margin-right:10px"> No
			</div>
			<br>
			If yes, please explain: <br>
			<textarea name="workFromHomeExplain" rows="4" cols="50" class="form-control"></textarea>
			<p>5.	Are there any life-critical devices in your house that require electricity (e.g., life sustaining medical equipment that runs on electric power)? 
 </p>
			<div class="input-group">
			<input type="radio" name="device" value="Yes" style="margin-right:10px"> Yes
			<input type="radio" name="device" value="No" style="margin-right:10px"> No
			</div>
			If yes, do those devices have backup power? How long can they operate without electricity? Please explain: <br>
			<textarea name="deviceExplain" rows="4" cols="50" class="form-control" ></textarea>
			<p>6.   Do you live in an apartment, attached house, or detached house? </p>
			<input type="radio" name="houseType" value="Apartment"  style="margin-right:10px">Apartment/Condominium <br>
			<input type="radio" name="houseType" value="Attached house" style="margin-right:10px">Multi-Family homes(duplex or triplex, etc.)<br>
			<input type="radio" name="houseType" value="House" style="margin-right:10px">Single-family house<br>
			<input type="radio" name="houseType" value="House" style="margin-right:10px">Other
			<p>7. How many years have you lived in your current house or apartment?</p>
			<input type="text" name="houseLiveTime" class="form-control">	 
			<br>
			<input type="submit" class="btn btn-info" name="submit" value="Next" style="float: right;"/>
		</form> 
</body></html>
