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
<form method = "post" action ="page11.do">
	<h3>
	Before we continue, I would like to ask you a question to make sure that you understand the scenario:
	</h3>
	<p id="page11-1">
	1. Will any of your neighbors or friends in the affected region have power from the power company? 
	</p>
		<input type="radio" name="page_11_1" value="Yes">Yes<br>
		<input type="radio" name="page_11_1" value="No">No<br>
	
	<p id="page11-2">
	2. Will your laptop work if it was charged overnight?
	</p>
		<input type="radio" name="page_11_2" value="Yes">Yes<br>
		<input type="radio" name="page_11_2" value="No">No<br>
	
	<p id="page11-3">
	3. Could you use the internet with your laptop?
	</p>
		<input type="radio" name="page_11_3" value="Yes">Yes<br>
		<input type="radio" name="page_11_3" value="No">No<br>
	
	<p id="page11-4">
	4. Could you use a cell phone to call the police in an emergency (assuming that your phone is charged enough)
	</p>
		<input type="radio" name="page_11_4" value="Yes">Yes<br>
		<input type="radio" name="page_11_4" value="No">No<br>
	
	<p id="page11-5">
	5. Could you spend the day in a heated shopping mall or restaurants?
	</p>
		<input type="radio" name="page_11_5" value="Yes">Yes<br>
		<input type="radio" name="page_11_5" value="No">No<br>
	
	<input type="submit" class="btn btn-info" action="page23.do" name="submit" value="Next" style="float: right;"/>
</form>

















</body>
</html>