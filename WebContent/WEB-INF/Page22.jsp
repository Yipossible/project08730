<jsp:include page="top7.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<h1>6) Wrapping it up</h1>
		</div>
		<div class="panel-body">
		<c:forEach var="error" items="${errors}">
			<h3 style="color:red"> ${error} </h3>
		</c:forEach>
</p>
<br>
<p>
We have thought about what it would be like to spend few weeks without electricity during the winter. 
Here, I would like you to tell me how much the provided information affected your value of reliable electric services, 
if at all. Please rate the exercises in order of importance regarding how much they affected your value.

</p>


<form method ="post" action="page22.do">
	<table>
		<tr>
			<td></td>
			<td colspan = "3">
			</td>
		</tr>
		<tr>
			<td></td>
			<td><span style="margin-right:20px">Not at all important</span></td>
			<td><span style="margin-right:20px">Slightly important</span></td>
			<td><span style="margin-right:20px">Moderately important</span></td>
			<td><span style="margin-right:20px">Very important</span></td>
		</tr>
		
		<tr>
			<td>Information about the services available in your home and community</td>
			<td>
			<input type="radio" name="page_22_1" value="Not at all important">
			</td>
			<td>
			<input type="radio" name="page_22_1" value="Slightly important">
			</td>
			<td>
			<input type="radio" name="page_22_1" value="Moderately important">
			</td>
			<td>
			<input type="radio" name="page_22_1" value="Very important">
			</td>
		</tr>
		
		<tr>
			<td>Appliance card stack game </td>
			<td>
			<input type="radio" name="page_22_2" value="Not at all important">
			</td>
			<td>
			<input type="radio" name="page_22_2" value="Slightly important">
			</td>
			<td>
			<input type="radio" name="page_22_2" value="Moderately important">
			</td>
			<td>
			<input type="radio" name="page_22_2" value="Very important">
			</td>
		</tr>
		
		<tr>
			<td>Reasons why the outage would be inconvenient </td>
			<td>
			<input type="radio" name="page_22_3" value="Not at all important">
			</td>
			<td>
			<input type="radio" name="page_22_3" value="Slightly important">
			</td>
			<td>
			<input type="radio" name="page_22_3" value="Moderately important">
			</td>
			<td>
			<input type="radio" name="page_22_3" value="Very important">
			</td>
		</tr>
		
		<tr>
			<td>Value of perishable food and economic losses</td>
			<td>
			<input type="radio" name="page_22_4" value="Not at all important">
			</td>
			<td>
			<input type="radio" name="page_22_4" value="Slightly important">
			</td>
			<td>
			<input type="radio" name="page_22_4" value="Moderately important">
			</td>
			<td>
			<input type="radio" name="page_22_4" value="Very important">
			</td>
		</tr>
		
		<tr>
			<td>Information about important private and social services</td>
			<td>
			<input type="radio" name="page_22_5" value="Not at all important">
			</td>
			<td>
			<input type="radio" name="page_22_5" value="Slightly important">
			</td>
			<td>
			<input type="radio" name="page_22_5" value="Moderately important">
			</td>
			<td>
			<input type="radio" name="page_22_5" value="Very important">
			</td>
		</tr>
		
	</table>
	<input type="submit" class="btn btn-info" action="page23.do" name="submit" value="Next" style="float: right;"/>
</form>
</body>
</html>