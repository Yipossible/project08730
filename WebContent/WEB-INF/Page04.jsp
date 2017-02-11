<html><body>
	<h1>Part A. Information about your household</h1>
		<form action="" method="POST">
			<p>4.	Do you work from home the majority of the time? (Is your home a place both for business and living?) </p>
			<input type="radio" name="workFromHome" value="Yes"> Yes
			<input type="radio" name="workFromHome" value="No"> No
			<br>
			If yes, please explain: <br>
			<textarea name="workFromHomeExplain" rows="4" cols="50"></textarea>
			<p>5.	Are there any life-critical devices in your house that require electricity (e.g., life sustaining medical equipment that runs on electric power)? 
 </p>
			<input type="radio" name="device" value="Yes"> Yes
			<input type="radio" name="device" value="No"> No
			<br>
			If yes, do those devices have backup power? How long can they operate without electricity? Please explain: <br>
			<textarea name="deviceExplain" rows="4" cols="50"></textarea>
			<p>6.   Do you live in an apartment, attached house, or detached house? </p>
			<input type="radio" name="houseType" value="Apartment">Apartment
			<input type="radio" name="houseType" value="Attached house">Attached house
			<input type="radio" name="houseType" value="House">House
			<p>How long have you lived in your current house or apartment?</p>
			<input type="text" name="houseLiveTime">	 years
			<br>
			<input type="submit" class="btn btn-primary btn-lg active" name="submit" value="Next"/>
		</form> 
</body></html>
