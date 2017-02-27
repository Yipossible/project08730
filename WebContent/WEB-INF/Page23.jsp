<jsp:include page="top.jsp" />

		</div>
		<div class="panel-body">
	<h4>Also, please fill out the follow questions Information about yourself and your experiences from outages.</h4>
		<form action="page23.do" method="POST">
			<p>1. How would you categorize yourself in terms of race or ethnicity?</p>
			<input type="radio" name="race" value="Caucasian" style="margin-right:10px;"> Caucasian
			<input type="radio" name="race" value="Hispanic"  style="margin-right:10px;">Hispanic
			<input type="radio" name="race" value="Black" style="margin-right:10px;">Black
			<input type="radio" name="race" value="Asian" style="margin-right:10px;">Asian
			<input type="radio" name="race" value="Other" style="margin-right:10px;">Other
			<p>2. What was your total household income last year?</p>
			<input type="radio" name="income" value="Under $10,000" style="margin-right:10px;">Under $10,000
			<input type="radio" name="income" value="$10,001 to $30,000" style="margin-right:10px;">$10,001 to $30,000
			<input type="radio" name="income" value="$30,001 to $50,000" style="margin-right:10px;">$30,001 to $50,000
			<input type="radio" name="income" value="$50,001 to $100,000" style="margin-right:10px;">$50,001 to $100,000
			<input type="radio" name="income" value="Above $100,000" style="margin-right:10px;"> Above $100,000
			<p>3. Who pays for your electricity?</p>
			<input type="radio" name="payer" value="You"  style="margin-right:10px;">You
			<input type="radio" name="payer" value="Another household member"  style="margin-right:10px;">Another household member
			<input type="radio" name="payer" value="Landlord"  style="margin-right:10px;">Landlord
			<br>
			<p>Can you estimate how much electricity does your household use per day?</p>
			<input type="text" name="estimate_kWh">(kWh) or<input type="text" name="estimate_amps">(Amps) 
			<br>
			<input type="submit" class="btn btn-info" action="page24.do" name="submit" value="Next" style="float: right;"/>
		</form> 
</body></html>
