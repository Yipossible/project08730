<jsp:include page="top.jsp" />

		</div>
		<div class="panel-body">

<br>

<form method ="post" action="page24.do">
	<p>4. Please describe your experience with power outages in your lifetime:</p>
	<input type="radio" name="experience" value=" I have experienced more than one outage."> I have experienced more than one outage.
	<input type="radio" name="experience" value=" I have experienced one outage."> I have experienced one outage. 
	<input type="radio" name="experience" value="I have never experienced an outage.">I have never experienced an outage.
	
	<p>5. Please tell me about whether you have the following items available to you in the case of a blackout :</p>
	<input type="checkbox" name="available_1" value="  Flashlights in easy-to-find places">  Flashlights in easy-to-find places
	<br><input type="checkbox" name="available_2" value="  Wind up or crank operated radio">  Wind up or crank operated radio 
	<br><input type="checkbox" name="available_3" value="  Wind up or crank cell phone charger">   Wind up or crank cell phone charger
	<br><input type="checkbox" name="available_4" value="  Camping lantern">    Camping lantern
	<br><input type="checkbox" name="available_5" value="  Camping cook stove">     Camping cook stove 
	<br><input type="checkbox" name="available_6" value="  Solar energy storage">       Solar energy storage
	<br><input type="checkbox" name="available_7" value="  Portable generator.">     Portable generator.
	<br><input type="checkbox" name="available_8" value="  Stand-by generator.">     Stand-by generator.
	<br><input type="checkbox" name="available_9" value="  Other non-generator.">    Other non-generator. 
	
	<br><br><input type="submit" class="btn btn-info" name="submit" value="Next" style="float: right;"/>
</form>
</body>
</html>