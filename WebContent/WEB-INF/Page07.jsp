<jsp:include page="top.jsp" />

		    <h1>Main Survey: Blackout in late December</h1>
		</div>
		<div class="panel-body">
<p>
In this case, I would like to know <strong>how much you would be willing to pay</strong>  
for this <strong>service</strong> during the outage. For each of the following questions, 
please indicate whether you would be willing to pay that amount of money 
in exchange for the partial service. 
</p>

<h3>
RESPONSE MODE - INITIAL I
</h3>

<form method ="post" action="page07.do">
	<table>
		
		<tr>
			<td></td>
			<td colspan = "3">
				<p>
				Would you be willing to pay this amount <strong>per day</strong> to get full service during the outage?
				
				<!-- Range slider, low and high tracks, and selection: -->
				<br>0<input id="ex12c" type="text"/>100<br/>
				<div class="col-lg-2">
					<div style="background: lightgreen">Yes</div>
					<div style="background: lightyellow">Not Sure</div>
					<div style="background: lightpink">No</div>
				</div>
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
			<input type="radio" name="page_07_1" value="Yes">
			</td>
			<td>
			<input type="radio" name="page_07_1" value="Not sure">
			</td>
			<td>
			<input type="radio" name="page_07_1" value="No">
			</td>
		</tr>
		
		<tr>
			<td>$10 - $19.99</td>
			<td>
			<input type="radio" name="page_07_2" value="Yes">
			</td>
			<td>
			<input type="radio" name="page_07_2" value="Not sure">
			</td>
			<td>
			<input type="radio" name="page_07_2" value="No">
			</td>
		</tr>
		
		<tr>
			<td>$20 - $29.99</td>
			<td>
			<input type="radio" name="page_07_3" value="Yes">
			</td>
			<td>
			<input type="radio" name="page_07_3" value="Not sure">
			</td>
			<td>
			<input type="radio" name="page_07_3" value="No">
			</td>
		</tr>
		
		<tr>
			<td>$30 - $39.99</td>
			<td>
			<input type="radio" name="page_07_4" value="Yes">
			</td>
			<td>
			<input type="radio" name="page_07_4" value="Not sure">
			</td>
			<td>
			<input type="radio" name="page_07_4" value="No">
			</td>
		</tr>
		
		<tr>
			<td>$40 - $49.99</td>
			<td>
			<input type="radio" name="page_07_5" value="Yes">
			</td>
			<td>
			<input type="radio" name="page_07_5" value="Not sure">
			</td>
			<td>
			<input type="radio" name="page_07_5" value="No">
			</td>
		</tr>
		
		<tr>
			<td>$50 - $59.99</td>
			<td>
			<input type="radio" name="page_07_6" value="Yes">
			</td>
			<td>
			<input type="radio" name="page_07_6" value="Not sure">
			</td>
			<td>
			<input type="radio" name="page_07_6" value="No">
			</td>
		</tr>
		
		<tr>
			<td>$60 - $69.99</td>
			<td>
			<input type="radio" name="page_07_7" value="Yes">
			</td>
			<td>
			<input type="radio" name="page_07_7" value="Not sure">
			</td>
			<td>
			<input type="radio" name="page_07_7" value="No">
			</td>
		</tr>
		
		<tr>
			<td>$70 - $79.99</td>
			<td>
			<input type="radio" name="page_07_8" value="Yes">
			</td>
			<td>
			<input type="radio" name="page_07_8" value="Not sure">
			</td>
			<td>
			<input type="radio" name="page_07_8" value="No">
			</td>
		</tr>
		
		
		<tr>
			<td>$80 - $89.99</td>
			<td>
			<input type="radio" name="page_07_9" value="Yes">
			</td>
			<td>
			<input type="radio" name="page_07_9" value="Not sure">
			</td>
			<td>
			<input type="radio" name="page_07_9" value="No">
			</td>
		</tr>
		
		<tr>
			<td>$90 - $99.99</td>
			<td>
			<input type="radio" name="page_07_10" value="Yes">
			</td>
			<td>
			<input type="radio" name="page_07_10" value="Not sure">
			</td>
			<td>
			<input type="radio" name="page_07_10" value="No">
			</td>
		</tr>
		<tr>
			<td>More than $100</td>
			<td>
			<input type="radio" name="page_07_11" value="Yes">
			</td>
			<td>
			<input type="radio" name="page_07_11" value="Not sure">
			</td>
			<td>
			<input type="radio" name="page_07_11" value="No">
			</td>
		</tr>
	
	</table>
	<input type="submit" class="btn btn-info" name="submit" value="Next" style="float: right;"/>
</form>
<script>
var sliderC = new Slider("#ex12c", { id: "slider12c", min: 0, max: 100, range: true, value: [30, 70] });
$(document).ready(function () {
	console.log($( "#ex12c" ).val());
});	
 </script>
</body>
</html>