<jsp:include page="top.jsp" />

		    <h1>Before proceeding, please make sure that you are eligible:</h1>
		</div>
		<div class="panel-body">
		<c:forEach var="error" items="${errors}">
			<h3 style="color:red"> ${error} </h3>
		</c:forEach>
			<form action="" method="POST">
			<p>I am in age 18 or older.</p>
			<div class="input-group">
			<input type="radio" name="over18" value="Yes"> Yes
			<input type="radio" name="over18" value="No"> No
			</div>
			<p>I have lived in Northeastern region for 3 years or more.</p>
			<div class="input-group">
			<input type="radio" name="livedOver3" value="Yes"> Yes
			<input type="radio" name="livedOver3" value="No"> No
			</div>
			<p>My household consists of at least 2 adults including myself.</p>
			<div class="input-group">
			<input type="radio" name="over2adult" value="Yes"> Yes
			<input type="radio" name="over2adult" value="No"> No
			</div>
			<p>I have read and understand the information.</p>
			<div class="input-group">
			<input type="radio" name="understand" value="Yes"> Yes
			<input type="radio" name="understand" value="No"> No
			</div>
			<p>I want to participate in this research and continue with the activity.</p>
			<div class="input-group">
			<input type="radio" name="participate" value="Yes"> Yes
			<input type="radio" name="participate" value="No"> No
			</div>
			<p>To receive the result, please enter your email address below.</p>
			<input type="text" name="email" class="form-control" >
		</div>
		</div>		
		    <form method="get" action="page03.do">
				<input type="submit" value="Next" class="btn btn-info" style="float: right;"/>
			</form>
		
	</div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="bootstrap_js/bootstrap.min.js"></script>
  </body>
</html>