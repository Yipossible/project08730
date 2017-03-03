<jsp:include page="top4.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h3>
	Before we continue, I would like to ask you a question to make sure that you understand the scenario:
	</h3>
		</div>
		<div class="panel-body">
		<c:forEach var="error" items="${errors}">
			<h3 style="color:red"> ${error} </h3>
		</c:forEach>
<form method = "post" action ="page11.do">
	
	<p id="page11-1">
	1. Will any of your neighbors or friends in the affected region have power from the power company? 
	</p>
		<input class = "target" type="radio" name="page_11_1" id="page_11_1_yes" value="Yes"  style="margin-right:10px">Yes<br>
		<input class = "target" type="radio" name="page_11_1" id="page_11_1_no" value="No"  style="margin-right:10px">No<br>
	<p id="page11-1-answer"></p>
	<script>
		
		$('.target').on('change',function(e){
			var checked= document.getElementById("page_11_1_yes").checked;
			
			if(checked == true ) {
				document.getElementById("page11-1-answer").innerHTML = "Because the entire region suffers the blackout, "
				+ "nobody will receive electric services from power companies until they restore the system.";
				document.getElementById("page11-1-answer").style.color = "red";
				
			} else {
				document.getElementById("page11-1-answer").innerHTML = "";
			}
			});
		
		</script>
	
	<p id="page11-2">
	2. Will your laptop work if it was charged overnight?
	</p>
		<input class = "target" type="radio" name="page_11_2" id="page_11_2_yes" value="Yes" style="margin-right:10px">Yes<br>
		<input class = "target" type="radio" name="page_11_2" id="page_11_2_no" value="No" style="margin-right:10px">No<br>
	<p id="page11-2-answer"></p>
	<script>
		
		$('.target').on('change',function(e){
			var checked= document.getElementById("page_11_2_no").checked;
			
			if(checked == true ) {
				document.getElementById("page11-2-answer").innerHTML = "Since your laptop is already charged, you can "
				+"use your laptop. However, you might not be able to access Internet.";
				document.getElementById("page11-2-answer").style.color = "red";
				
			} else {
				document.getElementById("page11-2-answer").innerHTML = "";
			}
			});
		
		</script>
	
	<p id="page11-3">
	3. Could you use the internet with your laptop?
	</p>
		<input class = "target" type="radio" name="page_11_3" id="page_11_3_yes" value="Yes" style="margin-right:10px">Yes<br>
		<input class = "target" type="radio" name="page_11_3" id="page_11_3_no" value="No" style="margin-right:10px">No<br>
	<p id="page11-3-answer"></p>
	<script>
		
		$('.target').on('change',function(e){
			var checked= document.getElementById("page_11_3_yes").checked;
			
			if(checked == true ) {
				document.getElementById("page11-3-answer").innerHTML = "In most cases, your modem and internet companies "
				+"do not have any backup power; thus, you might not be able to use the Internet with your laptop. In case "
				+"of your cell phone, you might be able to access the Internet for few hours, but later, cell tower may run "
				+ "out of backup power so you will not be able to access Internet using your cell phone also.";
				document.getElementById("page11-3-answer").style.color = "red";
				
			} else {
				document.getElementById("page11-3-answer").innerHTML = "";
			}
			});
		
		</script>
	
	<p id="page11-4">
	4. Could you use a cell phone to call the police in an emergency (assuming that your phone is charged enough)
	</p>
		<input class = "target" type="radio" name="page_11_4" id="page_11_4_yes" value="Yes" style="margin-right:10px">Yes<br>
		<input class = "target" type="radio" name="page_11_4" id="page_11_4_no" value="No" style="margin-right:10px">No<br>
	<p id="page11-4-answer"></p>
	<script>
		
		$('.target').on('change',function(e){
			var checked= document.getElementById("page_11_4_no").checked;
			
			if(checked == true ) {
				document.getElementById("page11-4-answer").innerHTML = "Most of the social critical services such as hospital, "
				+ "police office, and Fire bureau station have backup power. Thus, as far as your cell phone alive, you can call "
				+ "and use the social critical services.";
				document.getElementById("page11-4-answer").style.color = "red";
				
			} else {
				document.getElementById("page11-4-answer").innerHTML = "";
			}
			});
		
		</script>
		
	<p id="page11-5">
	5. Could you spend the day in a heated shopping mall or restaurants?
	</p>
		<input class = "target" type="radio" name="page_11_5" id="page_11_5_yes" value="Yes" style="margin-right:10px">Yes<br>
		<input class = "target" type="radio" name="page_11_5" id="page_11_5_no" value="No" style="margin-right:10px">No<br>
	<p id="page11-5-answer"></p>
	<script>
		
		$('.target').on('change',function(e){
			var checked= document.getElementById("page_11_5_yes").checked;
			console.log("checked:" + checked);
			if(checked) {
				console.log("here to change innerHTML");
				document.getElementById("page11-5-answer").innerHTML = "Most shopping malls or restaurants do not have any "
				+ "backup power. Thus, most shopping malls or restaurants might be closed during the blackout.)";
				document.getElementById("page11-5-answer").style.color = "red";
				
			} else {
				document.getElementById("page11-5-answer").innerHTML = "";
			}
			});
		
		</script>
		
	<input type="submit" class="btn btn-info"  name="submit" value="Next" style="float: right;"/>
</form>

















</body>
</html>