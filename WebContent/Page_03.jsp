<html><body>
	<h1>Part A. Information about your household</h1>
		<form action="" method="POST">
			<p>1. Where do you live?</p>
			<input type="text" name="zipcode"placeholder="Please input zip code"></td>
			<p>How long have you lived in (State, City)?</p>
			<input type="text" name="cityLiveTime"></td>	 years
			<p>2. Do you live in an apartment, attached house, or detached house? </p>
			<input type="radio" name="houseType" value="Apartment">Apartment
			<input type="radio" name="houseType" value="Attached house">Attached house
			<input type="radio" name="houseType" value="House">House
			<p>How long have you lived in your current house or apartment?</p>
			<input type="text" name="houseLiveTime"></td>	 years
			<p>3. What is your age?</p>
			<input type="text" name="age"></td>	 years old
			<p>4. How many people are there in your household in each of the following age groups:</p>
			<table>
				<tr> 
					<td>Preschool children:</td>
					<td> <input type="text" name="preschool"></td>
				</tr>
					<td>K-12 children:</td>
					<td> <input type="text" name="k12"></td>
				</tr>
				<tr> 
					<td>Adults under 30 years old:</td>
					<td> <input type="text" name="under30"></td>
				</tr>
				<tr>
					<td>30-65 years old:</td>
					<td> <input type="text" name="from30to65"></td>
				</tr>
				<tr> 
					<td>Over 65 years old:</td>
					<td> <input type="text" name="over65"></td>
				</tr>
			</table>
			<br>
			<input type="submit" class="btn btn-primary btn-lg active" name="submitCreateFund" value="Next"/>
		</form> 
</body></html>