<jsp:include page="top.jsp" />
<body>
<br>
	<div class="col-lg-4">
	<p>
	</div>
	<div class="col-lg-6">
		<div class="progress">
		  <div class="progress-bar" role="progressbar" aria-valuenow="30"
	  aria-valuemin="0" aria-valuemax="100" style="width:30%">
	    Basic Information
		  </div>
		</div>
	</div>
	<div class="col-lg-10">
	  <div class="panel panel-info">
		 <div class="panel-heading">
		    <h1>Part A. Information about your household</h1>
		</div>
		<div class="panel-body">
<p>
In this case, I would like to know <strong>how much you would be willing to pay</strong>  
for this <strong>service</strong> during the outage. For each of the following questions, 
please indicate whether you would be willing to pay that amount of money 
in exchange for the partial service. 
</p>

<h3>
RESPONSE MODE - INITIAL II
</h3>

<form method ="post" action="page17.do">
	<table>
		<tr>
			<td></td>
			<td colspan = "3">
				<p>
				Would you be willing to pay this amount <strong>per day</strong> to get partial 
				(about one-fifth of your normal power) service during the outage?
				</p>
			</td>
		</tr>
		<tr>
			<td></td>
			<td>Yes</td>
			<td>Not Sure</td>
			<td>No</td>
		</tr>
		
		<tr>
			<td>Less than $10</td>
			<td>
			<input type="radio" name="page_17_1" value="Yes">
			</td>
			<td>
			<input type="radio" name="page_17_1" value="Not sure">
			</td>
			<td>
			<input type="radio" name="page_17_1" value="No">
			</td>
		</tr>
		
		<tr>
			<td>$10 - $19.99</td>
			<td>
			<input type="radio" name="page_17_2" value="Yes">
			</td>
			<td>
			<input type="radio" name="page_17_2" value="Not sure">
			</td>
			<td>
			<input type="radio" name="page_17_2" value="No">
			</td>
		</tr>
		
		<tr>
			<td>$20 - $29.99</td>
			<td>
			<input type="radio" name="page_17_3" value="Yes">
			</td>
			<td>
			<input type="radio" name="page_17_3" value="Not sure">
			</td>
			<td>
			<input type="radio" name="page_17_3" value="No">
			</td>
		</tr>
		
		<tr>
			<td>$30 - $39.99</td>
			<td>
			<input type="radio" name="page_17_4" value="Yes">
			</td>
			<td>
			<input type="radio" name="page_17_4" value="Not sure">
			</td>
			<td>
			<input type="radio" name="page_17_4" value="No">
			</td>
		</tr>
		
		<tr>
			<td>$40 - $49.99</td>
			<td>
			<input type="radio" name="page_17_5" value="Yes">
			</td>
			<td>
			<input type="radio" name="page_17_5" value="Not sure">
			</td>
			<td>
			<input type="radio" name="page_17_5" value="No">
			</td>
		</tr>
		
		<tr>
			<td>$50 - $59.99</td>
			<td>
			<input type="radio" name="page_17_6" value="Yes">
			</td>
			<td>
			<input type="radio" name="page_17_6" value="Not sure">
			</td>
			<td>
			<input type="radio" name="page_17_6" value="No">
			</td>
		</tr>
		
		<tr>
			<td>$60 - $69.99</td>
			<td>
			<input type="radio" name="page_17_7" value="Yes">
			</td>
			<td>
			<input type="radio" name="page_17_7" value="Not sure">
			</td>
			<td>
			<input type="radio" name="page_17_7" value="No">
			</td>
		</tr>
		
		<tr>
			<td>$70 - $79.99</td>
			<td>
			<input type="radio" name="page_17_8" value="Yes">
			</td>
			<td>
			<input type="radio" name="page_17_8" value="Not sure">
			</td>
			<td>
			<input type="radio" name="page_17_8" value="No">
			</td>
		</tr>
		
		
		<tr>
			<td>$80 - $89.99</td>
			<td>
			<input type="radio" name="page_17_9" value="Yes">
			</td>
			<td>
			<input type="radio" name="page_17_9" value="Not sure">
			</td>
			<td>
			<input type="radio" name="page_17_9" value="No">
			</td>
		</tr>
		
		<tr>
			<td>$90 - $99.99</td>
			<td>
			<input type="radio" name="page_17_10" value="Yes">
			</td>
			<td>
			<input type="radio" name="page_17_10" value="Not sure">
			</td>
			<td>
			<input type="radio" name="page_17_10" value="No">
			</td>
		</tr>
		<tr>
			<td>More than $100</td>
			<td>
			<input type="radio" name="page_17_11" value="Yes">
			</td>
			<td>
			<input type="radio" name="page_17_11" value="Not sure">
			</td>
			<td>
			<input type="radio" name="page_17_11" value="No">
			</td>
		</tr>
	
	</table>
	<input type="submit" class="btn btn-info" name="submit" value="Next" style="float: right;"/>
</form>
</body>
</html>