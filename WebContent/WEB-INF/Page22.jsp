<jsp:include page="top.jsp" />
<body>
    <br>
<div class="col-lg-4">
<p>
</div>
<div class="col-lg-6">
	<div class="progress">
	  <div class="progress-bar" role="progressbar" aria-valuenow="70"
	  aria-valuemin="0" aria-valuemax="100" style="width:70%">
	    Main Survey
	  </div>
	</div>
</div>
	<div class="col-lg-10">
	  <div class="panel panel-info">
		 <div class="panel-heading">
		</div>
		<div class="panel-body">
<p>
6) Wrapping it up

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
			<td>Not at all important</td>
			<td>Slightly important</td>
			<td>Moderately important</td>
			<td>Very important</td>
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