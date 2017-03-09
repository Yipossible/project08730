<jsp:include page="top4.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<h1>2) 	More information about your home and community during blackout.</h1>
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
Next, you will be asked to think about the services that will be available 
during the blackout in your home and community, as well as the services that 
will not be available. The table below provides a list of some of the things 
that will and will not work in your home and community when the power is out 
for the entire region:
</p>

<table border="1">
	<tr>
		<td colspan = "2">
		In your home
		</td>
		<td colspan = "2">
		In community
		</td>
	</tr>
	<tr>
		<td>Will work</td>
		<td>Will NOT work</td>
		<td>Will work</td>
		<td>Will NOT work</td>
	</tr>
	<tr>
		<td>
		Old style telephones that have a rotary dial. 
Anything that runs on a battery, as long as the battery lasts 
(e.g., radios, flashlights, laptop computers, and cell phones).
		</td>
		<td>
<li> New style telephones that include a plug to a power outlet.</li>
<li> All electrical appliances that cannot also run on batteries, including air conditioners and blowers that circulate air.
<li> Cable and internet service.
<li> Natural gas and all normal water and sewer services.

		</td>
		<td>
TV and radio stations.
		</td>
		<td>
<li> Traffic signals.
<li> Street lights.
<li> Banks and ATMs.
<li> Most gas stations 
(pumps need electricity).
<li> Food stores (lights, refrigeration, and cash registers will not work).
<li> Most restaurants (very few have backup generators).
<li> Elevators in buildings without backup.
<li> Ventilator fans and lighting in traffic tunnels.
<li> Electric trolley service.
<li> Airport – major delays.
<li> Natural gas and all normal water and sewer services.
<li> Bus service.
<li> GPS service.
<li> Emergency service including 911 (via cell phone or rotary dial phone).
Hospitals, police stations, and other government services.
		</td>
	
	</tr>

</table>

<form>
		<input type="submit" class="btn btn-info" action="page10.do" name="button" value="Next" style="float: right;"/>
</form>

</body>
</html>