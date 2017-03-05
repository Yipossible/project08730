				<!-- Range slider, low and high tracks, and selection: -->
				<br><br>
				<table style="width:780px;">
				<td id="r1" style="width:30%; background: lightgreen; margin-right:10px">I am willing to pay $0 to $<span id="yes"></span> dollars </td>
				<td id="r2" style="width:40%; background: lightyellow; margin-right:10px">I might pay <span id="notSure"></span> dollars </td>
				<td id="r3" style="width:30%; background: lightpink; margin-right:10px"> I am not willing to pay <span id="no"></span> to $100 dollars</td>
				</table>
				$0<input name="price" id="ex12c" type="text" style="width:750px;">$100<br/>
				<br><br><br>
	<input type="submit" class="btn btn-info" name="submit" value="Next" style="float: right;" data-slider-step="10" />
</form>
<script>
var sliderC = new Slider("#ex12c", { id: "slider12c", min: 0, max: 10, range: true, value: [3, 7] });
$(document).ready(function () {
	console.log($( "#ex12c" ).val());

 	$("#ex12c").on("slide", function(slideEvt) {
 		document.getElementById('r1').style.width = (slideEvt.value[0] * 10).toString() + "%";
 		document.getElementById('r2').style.width = (slideEvt.value[1] * 10 - slideEvt.value[0] * 10).toString() + "%";
 		document.getElementById('r3').style.width = (slideEvt.value[1] * 10).toString() + "%";
 		$("#yes").text(slideEvt.value[0] * 10 - 0.01);
	 	$("#notSure").text("$" + (slideEvt.value[0] * 10) + " to $" + (slideEvt.value[1] * 10 - 0.01));
	 	$("#no").text("$" + slideEvt.value[1] * 10);
	});
});	
 </script>
</body>
</html>