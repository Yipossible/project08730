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
	<h4>Also, please fill out the follow questions Information about yourself and your experiences from outages.</h4>
		<form action="page23.do" method="POST">
			<p>1. How would you categorize yourself in terms of race or ethnicity?</p>
			<input type="radio" name="race" value="Caucasian">Caucasian
			<input type="radio" name="race" value="Hispanic">Hispanic
			<input type="radio" name="race" value="Black">Black
			<input type="radio" name="race" value="Asian">Asian
			<input type="radio" name="race" value="Other">Other
			<p>2. What was your total household income last year?</p>
			<input type="radio" name="income" value="Under $10,000">Under $10,000
			<input type="radio" name="income" value="$10,001 to $30,000">$10,001 to $30,000
			<input type="radio" name="income" value="$30,001 to $50,000">$30,001 to $50,000
			<input type="radio" name="income" value="$50,001 to $100,000">$50,001 to $100,000
			<input type="radio" name="income" value="Above $100,000"> Above $100,000
			<p>3. Who pays for your electricity?</p>
			<input type="radio" name="payer" value="You">You
			<input type="radio" name="payer" value="Another household member">Another household member
			<input type="radio" name="payer" value="Landlord">Landlord
			<br>
			<p>Can you estimate how much electricity does your household use per day?</p>
			<input type="text" name="estimate_kWh">(kWh) or<input type="text" name="estimate_amps">(Amps) 
			<br>
			<input type="submit" class="btn btn-info" action="page24.do" name="submit" value="Next" style="float: right;"/>
		</form> 
</body></html>
