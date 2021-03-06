<jsp:include page="top7.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<h1>6. How inconvenient would it be if an outage lasted? </h1>
		</div>
		<div class="panel-body">
		<c:forEach var="error" items="${errors}">
			<h3 style="color:red"> ${error} </h3>
		</c:forEach>
<br>

<form method ="post" action="page25.do">
	<table>
		<tr>
			<td></td>
			<td colspan = "3">
			</td>
		</tr>
		<tr>
			<td></td>
			<td><span style="margin-right:20px">Not at all</span></td>
			<td><span style="margin-right:20px">Slightly</span></td>
			<td><span style="margin-right:20px">Moderately</span></td>
			<td><span style="margin-right:20px">Very</span></td>
			<td><span style="margin-right:20px">Extremely</span></td>
		</tr>
		
		<tr>
			<td>Less than 1 hour</td>
			<td>
			<input type="radio" name="page_25_1" value="Not at all"">
			</td>
			<td>
			<input type="radio" name="page_25_1" value="Slightly">
			</td>
			<td>
			<input type="radio" name="page_25_1" value="Moderately">
			</td>
			<td>
			<input type="radio" name="page_25_1" value="Very">
			</td>
			<td>
			<input type="radio" name="page_25_1" value="Extremely">
			</td>
		</tr>
		
		<tr>
			<td>1 hour to 4 hours</td>
			<td>
			<input type="radio" name="page_25_2" value="Not at all">
			</td>
			<td>
			<input type="radio" name="page_25_2" value="Slightly">
			</td>
			<td>
			<input type="radio" name="page_25_2" value="Moderately">
			</td>
			<td>
			<input type="radio" name="page_25_2" value="Very">
			</td>
			<td>
			<input type="radio" name="page_25_2" value="Extremely">
			</td>
		</tr>
		
		<tr>
			<td>4 hours to 8 hours</td>
			<td>
			<input type="radio" name="page_25_3" value="Not at all">
			</td>
			<td>
			<input type="radio" name="page_25_3" value="Slightly">
			</td>
			<td>
			<input type="radio" name="page_25_3" value="Moderately">
			</td>
			<td>
			<input type="radio" name="page_25_3" value="Very">
			</td>
			<td>
			<input type="radio" name="page_25_3" value="Extremely">
			</td>
		</tr>
		
		<tr>
			<td>1 day to 3 days</td>
			<td>
			<input type="radio" name="page_25_4" value="Not at all">
			</td>
			<td>
			<input type="radio" name="page_25_4" value="Slightly">
			</td>
			<td>
			<input type="radio" name="page_25_4" value="Moderately">
			</td>
			<td>
			<input type="radio" name="page_25_4" value="Very">
			</td>
			<td>
			<input type="radio" name="page_25_4" value="Extremely">
			</td>
		</tr>
		
		<tr>
			<td>3 days to 1 week</td>
			<td>
			<input type="radio" name="page_25_5" value="Not at all">
			</td>
			<td>
			<input type="radio" name="page_25_5" value="Slightly">
			</td>
			<td>
			<input type="radio" name="page_25_5" value="Moderately">
			</td>
			<td>
			<input type="radio" name="page_25_5" value="Very">
			</td>
			<td>
			<input type="radio" name="page_25_5" value="Extremely">
			</td>
		</tr>
		
		<tr>
			<td>Longer than 1 week</td>
			<td>
			<input type="radio" name="page_25_6" value="Not at all">
			</td>
			<td>
			<input type="radio" name="page_25_6" value="Slightly">
			</td>
			<td>
			<input type="radio" name="page_25_6" value="Moderately">
			</td>
			<td>
			<input type="radio" name="page_25_6" value="Very">
			</td>
			<td>
			<input type="radio" name="page_25_6" value="Extremely">
			</td>
		</tr>
		
		<tr>
			<td>Few weeks (1-2 weeks)</td>
			<td>
			<input type="radio" name="page_25_7" value="Not at all">
			</td>
			<td>
			<input type="radio" name="page_25_7" value="Slightly">
			</td>
			<td>
			<input type="radio" name="page_25_7" value="Moderately">
			</td>
			<td>
			<input type="radio" name="page_25_7" value="Very">
			</td>
			<td>
			<input type="radio" name="page_25_7" value="Extremely">
			</td>
		</tr>
		
		<tr>
			<td>Less than one month(2-4 weeks)</td>
			<td>
			<input type="radio" name="page_25_8" value="Not at all">
			</td>
			<td>
			<input type="radio" name="page_25_8" value="Slightly">
			</td>
			<td>
			<input type="radio" name="page_25_8" value="Moderately">
			</td>
			<td>
			<input type="radio" name="page_25_8" value="Very">
			</td>
			<td>
			<input type="radio" name="page_25_8" value="Extremely">
			</td>
		</tr>
			
	</table>
	<input type="submit" class="btn btn-info" name="submit" value="Next" style="float: right;"/>
</form>
</body>
</html>