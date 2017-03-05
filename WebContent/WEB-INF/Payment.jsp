<jsp:include page="top7.jsp" />

		    <h1>Survey completed!</h1>
		</div>
		<div class="panel-body">
			<p> Survey completed! Thanks very much for your participation in this study. 
If you have questions or concerns, feel free to contact Sunhee Baik, sunheeb@andrew.cmu.edu.
<br>
For your reward, please enter your Amazon account so that I can send the reward to you:

		</p>
		<form method ="post" action="payment.do">
		<input type="text" name="amazonAccount" placeholder="Please input your Amazon Account" class="form-control" ></td>
		<br>
		<input type="submit" class="btn btn-info" name="submit" value="Submit" style="float: right;"/>
		</div>
		</div>		
			
		
	</div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="bootstrap_js/bootstrap.min.js"></script>
  </body>
</html>