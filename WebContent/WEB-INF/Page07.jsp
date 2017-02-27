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
				I am willing to pay 0 to <span id="yes" style="background: lightgreen;"></span> dollars <br>
				I might pay <span id="notSure" style="background: lightyellow;"></span> dollars <br>
				I am not willing to pay <span id="no" style="background: lightpink;"></span> to 100 dollars<br><br>
				0<input id="ex12c" type="text" style="width:700px;">100<br/>
				<br><br><br>
	<input type="submit" class="btn btn-info" name="submit" value="Next" style="float: right;"/>
</form>
<script>
var sliderC = new Slider("#ex12c", { id: "slider12c", min: 0, max: 100, range: true, value: [30, 70] });
$(document).ready(function () {
	console.log($( "#ex12c" ).val());
	/* var x = $( "#ex12c" ).val().split(',')[0];
	document.getElementById("yes").innerHTML = " " + x + " ";
	document.getElementById("yes2").innerHTML = " " + x + " ";
	var y = $( "#ex12c" ).val().split(',')[1];
	document.getElementById("no").innerHTML = " " + y + " ";
	document.getElementById("no2").innerHTML = " " + y + " ";
 */	$("#ex12c").on("slide", function(slideEvt) {
	 	$("#yes").text(slideEvt.value[0]);
	 	$("#notSure").text(slideEvt.value);
	 	$("#no").text(slideEvt.value[1]);
	});
});	
 </script>
</body>
</html>