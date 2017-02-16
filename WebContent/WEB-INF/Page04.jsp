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
		<form action="" method="POST">
			<p>4.	Do you work from home the majority of the time? (Is your home a place both for business and living?) </p>
			<div class="input-group">
			<input type="radio" name="workFromHome" value="Yes"> Yes
			<input type="radio" name="workFromHome" value="No"> No
			</div>
			<br>
			If yes, please explain: <br>
			<textarea name="workFromHomeExplain" rows="4" cols="50" class="form-control"></textarea>
			<p>5.	Are there any life-critical devices in your house that require electricity (e.g., life sustaining medical equipment that runs on electric power)? 
 </p>
			<div class="input-group">
			<input type="radio" name="workFromHome" value="Yes"> Yes
			<input type="radio" name="workFromHome" value="No"> No
			</div>
			If yes, do those devices have backup power? How long can they operate without electricity? Please explain: <br>
			<textarea name="deviceExplain" rows="4" cols="50" class="form-control" ></textarea>
			<p>6.   Do you live in an apartment, attached house, or detached house? </p>
			<input type="radio" name="houseType" value="Apartment">Apartment
			<input type="radio" name="houseType" value="Attached house">Attached house
			<input type="radio" name="houseType" value="House">House
			<p>How many years have you lived in your current house or apartment?</p>
			<input type="text" name="houseLiveTime" class="form-control">	 
			<br>
			<input type="submit" class="btn btn-info" name="submit" value="Next" style="float: right;"/>
		</form> 
</body></html>
