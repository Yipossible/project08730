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
				<p>
				Would you be willing to pay this amount <strong>per day</strong> to get full service during the outage?
				
				<!-- Range slider, low and high tracks, and selection: -->
				<br><br>
				<table>
				<td class="col-xs-4" style="background: lightgreen;">I am willing to pay 0 to <span id="yes"></span> dollars </td>
				<td class="col-xs-4" style="background: lightyellow;">I might pay <span id="notSure"></span> dollars </td>
				<td class="col-xs-4" style="background: lightpink;"> I am not willing to pay <span id="no"></span> to 100 dollars</td>
				</table>
				$0<input name="price" id="ex12c" type="text" style="width:750px;">$100<br/>
				<br><br><br>
	<input type="submit" class="btn btn-info" name="submit" value="Next" style="float: right;"/>
</form>
<script>
var sliderC = new Slider("#ex12c", { id: "slider12c", min: 0, max: 100, range: true, value: [30, 70] });
$(document).ready(function () {
	console.log($( "#ex12c" ).val());

 	$("#ex12c").on("slide", function(slideEvt) {
	 	$("#yes").text(slideEvt.value[0]);
	 	$("#notSure").text(slideEvt.value[0] + " to " + slideEvt.value[1]);
	 	$("#no").text(slideEvt.value[1]);
	});
});	
 </script>
</body>
</html>