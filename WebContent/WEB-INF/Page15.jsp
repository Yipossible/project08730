<jsp:include page="top5.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		    <h1>Part A. Information about your household</h1>
		</div>
		<div class="panel-body">
		<c:forEach var="error" items="${errors}">
			<h3 style="color:red"> ${error} </h3>
		</c:forEach>
<p>
Please use the calculator below to estimate the value of the food you have, and would need to replace if the power went out for one to two weeks.
</p>
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
	<!--  <p style="font-size:medium; color:red">
  ${errors}
	</p> -->
<style type="text/css">
    .extra {
        border: 0px; 
    }
</style>

<form method="POST" id="15form" action="page15.do">
<table align="center" border = "1" style="margin: 5px auto;">
	<tr>
		<td width = "600px"></td>
		<td width = "150px">Your best guess of the value of food that is in your refrigerator:</td>
		<td width = "150px">Your best guess of the value of food that will go bad and need to be replaced:</td>
		<td class="extra"></td>
	</tr>
	<tr>
		<td width = "600px">1. Meat, Poultry, Seafood</td>
		<td></td>
		<td></td>
		<td class="extra"></td>

	</tr>
	<tr>
		<td width = "600px">Raw or leftover cooked meat, Thawing meat or poultry, Salads: meat, tuna, shrimp, Chicken, or egg salad, 
Gravy, stuffing, broth, Lunchmeats, hot dogs, bacon, sausage, dried beef, Pizza – with any topping,
Canned hams labeled ‘keep refrigerated’, Opened canned meats and fish,
Casseroles, soups, stews</td>
		<td>$
			 <input class = "target" type="text" size = "15" name="page_15_1_guessall" id = "page15_1_guessall" value="">
		</td>
		<td>$
			 <input class = "target" type="text" size = "15" name="page_15_1_guessbad" id = "page15_1_guessbad" value="">
		</td>
		<td class="extra" id="page_15_1"></td>
		
		<script>
		
		$('.target').on('input',function(e){
			var bad1= document.getElementById("page15_1_guessbad").value;
			var total1 = document.getElementById("page15_1_guessall").value;
			if( bad1 > total1) {
				document.getElementById("page_15_1").innerHTML = "The value of Perished Food should be no more than Total Value";
				document.getElementById("page_15_1").style.color = "red";
				
			} else {
				document.getElementById("page_15_1").innerHTML = "";
			}
			});
		
		</script>
	</tr>
	
	<tr>
		<td>2. Dairy</td>
		<td></td>
		<td></td>
		<td class="extra"></td>
	</tr>
	<tr>
		<td width = "600px">Milk, cream, sour cream, Buttermilk, evaporated milk, 
Yogurt, eggnog, soy milk,Open baby formula</td>
		<td>$
			 <input class = "target" type="text" size = "15" name="page_15_2_guessall" id = "page15_2_guessall" value="">
		</td>
		<td>$
			 <input class = "target" type="text"  size = "15"name="page_15_2_guessbad" id = "page15_2_guessbad" value="">
		</td>
		<td class="extra" id="page_15_2"></td>
		
				<script>
		
		$('.target').on('input',function(e){
			var bad1= document.getElementById("page15_2_guessbad").value;
			var total1 = document.getElementById("page15_2_guessall").value;
			if( bad1 > total1) {
				document.getElementById("page_15_2").innerHTML = "The value of Perished Food should be no more than Total Value";
				document.getElementById("page_15_2").style.color = "red";
				
			} else {
				document.getElementById("page_15_2").innerHTML = "";
			}
			});
		
		</script>
	</tr>
	
	<tr>
		<td>3. Eggs</td>
		<td></td>
		<td></td>
		<td class="extra"></td>
	</tr>
	<tr>
		<td width = "600px">Fresh eggs, hard-cooked in shell Custards and puddings, quiche</td>
		<td>$
			 <input class = "target" type="text" size = "15" name="page_15_3_guessall" id = "page15_3_guessall" value="">
		</td>
		<td>$
			 <input class = "target" type="text" size = "15" name="page_15_3_guessbad" id = "page15_3_guessbad" value="">
		</td>
		<td class="extra" id="page_15_3"></td>
				<script>
		
		$('.target').on('input',function(e){
			var bad1= document.getElementById("page15_3_guessbad").value;
			var total1 = document.getElementById("page15_3_guessall").value;
			if( bad1 > total1) {
				document.getElementById("page_15_3").innerHTML = "The value of Perished Food should be no more than Total Value";
				document.getElementById("page_15_3").style.color = "red";
				
			} else {
				document.getElementById("page_15_3").innerHTML = "";
			}
			});
		
		</script>
	</tr>

	<tr>
		<td>4. Fruits</td>
		<td></td>
		<td></td>
		<td class="extra"></td>
	</tr>
	<tr>
		<td>Opened canned fruits and juices</td>
		<td>$
			 <input class = "target" type="text" size = "15" name="page_15_4_guessall" id = "page15_4_guessall" value="">
		</td>
		<td>$
			 <input class = "target" type="text" size = "15" name="page_15_4_guessbad" id = "page15_4_guessbad" value="">
		</td>
		<td class="extra" id="page_15_4"></td>
		
				<script>
		
		$('.target').on('input',function(e){
			var bad1= document.getElementById("page15_4_guessbad").value;
			var total1 = document.getElementById("page15_4_guessall").value;
			if( bad1 > total1) {
				document.getElementById("page_15_4").innerHTML = "The value of Perished Food should be no more than Total Value";
				document.getElementById("page_15_4").style.color = "red";
				
			} else {
				document.getElementById("page_15_4").innerHTML = "";
			}
			});
		
		</script>
	</tr>
	
	<tr>
		<td>5.Sauces</td>
		<td></td>
		<td></td>
		<td class="extra"></td>
	</tr>
	<tr>
		<td width = "600px">Opened mayonnaise, Tartar sauce, Horseradish,Fish sauces, oyster sauce
Opened creamy-based dressings Spaghetti sauce, opened jar</td>
		<td>$
			 <input class = "target" type="text" size = "15" name="page_15_5_guessall" id = "page15_5_guessall" value="">
		</td>
		<td>$
			 <input class = "target" type="text"  size = "15" name="page_15_5_guessbad" id = "page15_5_guessbad" value="">
		</td>
		<td class="extra" id="page_15_5"></td>
		
				<script>
		
		$('.target').on('input',function(e){
			var bad1= document.getElementById("page15_5_guessbad").value;
			var total1 = document.getElementById("page15_5_guessall").value;
			if( bad1 > total1) {
				document.getElementById("page_15_5").innerHTML = "The value of Perished Food should be no more than Total Value";
				document.getElementById("page_15_5").style.color = "red";
				
			} else {
				document.getElementById("page_15_5").innerHTML = "";
			}
			});
		
		</script>
	</tr>
	
	<tr>
		<td>6. Bread, Cakes, Cookies, Pasta, etc.</td>
		<td></td>
		<td></td>
		<td class="extra"></td>
	</tr>
	<tr>
		<td width = "600px">Refrigerator biscuits, rolls, cookie dough, Cooked pasta, rice, potatoes,
Pasta salads with mayonnaise or vinaigrette,Fresh pasta, Cheesecake</td>
		<td>$
			 <input class = "target" type="text" size = "15" name="page_15_6_guessall" id = "page15_6_guessall" value="">
		</td>
		<td>$
			 <input class = "target" type="text" size = "15" name="page_15_6_guessbad" id = "page15_6_guessbad" value="">
		</td>
		<td class="extra" id="page_15_6"></td>
		
				<script>
		
		$('.target').on('input',function(e){
			var bad1= document.getElementById("page15_6_guessbad").value;
			var total1 = document.getElementById("page15_6_guessall").value;
			if( bad1 > total1) {
				document.getElementById("page_15_6").innerHTML = "The value of Perished Food should be no more than Total Value";
				document.getElementById("page_15_6").style.color = "red";
				
			} else {
				document.getElementById("page_15_6").innerHTML = "";
			}
			});
		
		</script>
	</tr>
	
	<tr>
		<td>7. Perishable Pies and Pastry</td>
		<td>$
			 <input class = "target" type="text" size = "15"  name="page_15_7_guessall" id = "page15_7_guessall" value="">
		</td>
		<td>$
			 <input class = "target" type="text" size = "15" name="page_15_7_guessbad" id = "page15_7_guessbad" value="">
		</td>
		<td class="extra" id="page_15_7"></td>
		
				<script>
		
		$('.target').on('input',function(e){
			var bad1= document.getElementById("page15_7_guessbad").value;
			var total1 = document.getElementById("page15_7_guessall").value;
			if( bad1 > total1) {
				document.getElementById("page_15_7").innerHTML = "The value of Perished Food should be no more than Total Value";
				document.getElementById("page_15_7").style.color = "red";
				
			} else {
				document.getElementById("page_15_7").innerHTML = "";
			}
			});
		
		</script>
	</tr>
	
	<tr>
		<td>Perishable Vegetables (except raw vegetables)</td>
		<td>$
			 <input class = "target" type="text" size = "15" name="page_15_8_guessall" id = "page15_8_guessall" value="">
		</td>
		<td>$
			 <input class = "target" type="text" size = "15" name="page_15_8_guessbad" id = "page15_8_guessbad" value="">
		</td>
		<td class="extra" id="page_15_8"></td>
		
				<script>
		
		$('.target').on('input',function(e){
			var bad1= document.getElementById("page15_8_guessbad").value;
			var total1 = document.getElementById("page15_8_guessall").value;
			if( bad1 > total1) {
				document.getElementById("page_15_8").innerHTML = "The value of Perished Food should be no more than Total Value";
				document.getElementById("page_15_8").style.color = "red";
				
			} else {
				document.getElementById("page_15_8").innerHTML = "";
			}
			});
		
		</script>
	</tr>
	
	<tr>
		<td>8. Soft Cheese</td>
		<td>$
			 <input class = "target" type="text" size = "15" name="page_15_9_guessall" id = "page15_9_guessall" value="">
		</td>
		<td>$
			 <input class = "target" type="text" size = "15" name="page_15_9_guessbad" id = "page15_9_guessbad" value="">
		</td>
		<td class="extra" id="page_15_9"></td>
				<script>
		
		$('.target').on('input',function(e){
			var bad1= document.getElementById("page15_9_guessbad").value;
			var total1 = document.getElementById("page15_9_guessall").value;
			if( bad1 > total1) {
				document.getElementById("page_15_9").innerHTML = "The value of Perished Food should be no more than Total Value";
				document.getElementById("page_15_9").style.color = "red";
				
			}  else {
				document.getElementById("page_15_9").innerHTML = "";
			}
			});
		
		</script>
	</tr>
	
		
	
	


</table>

<br>

<p>Losing all the perishable food in your refrigerator may not be the only economic loss you would experience 
if the power goes out during a very chilly and windy winter, especially if you work from home or own a 
home-business. Please explain and estimate any other economic losses you and others in your household might
 experience in the few weeks power outage.</p>
 <br>
<textarea rows="10" cols="140" name="text" form="15form"> </textarea>
<br>





	<input type="submit" class="btn btn-info" name="submit" value="Next" style="float: right;"/>
</form>






</body>
</html>