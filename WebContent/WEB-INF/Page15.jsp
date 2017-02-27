<jsp:include page="top.jsp" />

		    <h1>Part A. Information about your household</h1>
		</div>
		<div class="panel-body">
<p>
Please use the calculator below to estimate the value of the food you have, and would need to replace if the power went out for one to two weeks.
</p>



<form method="POST" id="15form" action="page15.do">
<table align="center" style="margin: 0px auto;">
	<tr>
		<td style="overflow:hidden; width:400px;"></td>
		<td width = "80px">Your best guess of the value of food that is in your refrigerator:</td>
		<td width = "80px">Your best guess of the value of food that will go bad and need to be replaced:</td>
		<td></td>
	</tr>
	<tr>
		<td style="overflow:hidden; width:400px;">Meat, Poultry, Seafood</td>
		<td></td>
		<td></td>
		<td></td>

	</tr>
	<tr>
		<td style="overflow:hidden; width:400px;">Raw or leftover cooked meat, Thawing meat or poultry, Salads: meat, tuna, shrimp, Chicken, or egg salad, 
Gravy, stuffing, broth, Lunchmeats, hot dogs, bacon, sausage, dried beef, Pizza – with any topping,
Canned hams labeled ‘keep refrigerated’, Opened canned meats and fish,
Casseroles, soups, stews</td>
		<td>$
			 <input type="text" size = "15" name="page_15_1_guessall" id = "page15_1_guessall" value="">
		</td>
		<td>$
			 <input type="text" size = "15" name="page_15_1_guessbad" id = "page15_1_guessbad" value="">
		</td>
		<td id="page_15_1"></td>
		
		<script>
		if(document.getElementById("page_15_1_guessbad").value > document.getElementById("page_15_1_guessall").value) {
			document.getElementById("page_15_1").innerHTML = "The value of Perished Food should be no more than Total Value";
		}
		</script>
	</tr>
	
	<tr>
		<td>Dairy</td>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td style="overflow:hidden; width:400px;">Milk, cream, sour cream, Buttermilk, evaporated milk, 
Yogurt, eggnog, soy milk,Open baby formula</td>
		<td>$
			 <input type="text" size = "15" name="page_15_2_guessall" id = "page15_2_guessall" value="">
		</td>
		<td>$
			 <input type="text"  size = "15"name="page_15_2_guessbad" id = "page15_2_guessbad" value="">
		</td>
		<td id="page_15_2"></td>
	</tr>
	
	<tr>
		<td>Eggs</td>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td style="overflow:hidden; width:400px;">Fresh eggs, hard-cooked in shell Custards and puddings, quiche</td>
		<td>$
			 <input type="text" size = "15" name="page_15_3_guessall" id = "page15_3_guessall" value="">
		</td>
		<td>$
			 <input type="text" size = "15" name="page_15_3_guessbad" id = "page15_3_guessbad" value="">
		</td>
		<td id="page_15_3"></td>
	</tr>

	<tr>
		<td>Fruits</td>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td>Opened canned fruits and juices</td>
		<td>$
			 <input type="text" size = "15" name="page_15_4_guessall" id = "page15_4_guessall" value="">
		</td>
		<td>$
			 <input type="text" size = "15" name="page_15_4_guessbad" id = "page15_4_guessbad" value="">
		</td>
		<td id="page_15_4"></td>
	</tr>
	
	<tr>
		<td>Sauces</td>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td style="overflow:hidden; width:400px;">Opened mayonnaise, Tartar sauce, Horseradish,Fish sauces, oyster sauce
Opened creamy-based dressings Spaghetti sauce, opened jar</td>
		<td>$
			 <input type="text" size = "15" name="page_15_5_guessall" id = "page15_5_guessall" value="">
		</td>
		<td>$
			 <input type="text"  size = "15" name="page_15_5_guessbad" id = "page15_5_guessbad" value="">
		</td>
		<td id="page_15_5"></td>
	</tr>
	
	<tr>
		<td>Bread, Cakes, Cookies, Pasta, etc.</td>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td style="overflow:hidden; width:400px;">Refrigerator biscuits, rolls, cookie dough, Cooked pasta, rice, potatoes,
Pasta salads with mayonnaise or vinaigrette,Fresh pasta, Cheesecake</td>
		<td>$
			 <input type="text" size = "15" name="page_15_6_guessall" id = "page15_6_guessall" value="">
		</td>
		<td>$
			 <input type="text" size = "15" name="page_15_6_guessbad" id = "page15_6_guessbad" value="">
		</td>
		<td id="page_15_6"></td>
	</tr>
	
	<tr>
		<td>Perishable Pies and Pastry</td>
		<td>$
			 <input type="text" size = "15"  name="page_15_7_guessall" id = "page15_7_guessall" value="">
		</td>
		<td>$
			 <input type="text" size = "15" name="page_15_7_guessbad" id = "page15_7_guessbad" value="">
		</td>
		<td id="page_15_7"></td>
	</tr>
	
	<tr>
		<td>Perishable Vegetables (except raw vegetables)</td>
		<td>$
			 <input type="text" size = "15" name="page_15_8_guessall" id = "page15_8_guessall" value="">
		</td>
		<td>$
			 <input type="text" size = "15" name="page_15_8_guessbad" id = "page15_8_guessbad" value="">
		</td>
		<td id="page_15_8"></td>
	</tr>
	
	<tr>
		<td>Soft Cheese</td>
		<td>$
			 <input type="text" size = "15" name="page_15_9_guessall" id = "page15_9_guessall" value="">
		</td>
		<td>$
			 <input type="text" size = "15" name="page_15_9_guessbad" id = "page15_9_guessbad" value="">
		</td>
		<td id="page_15_9"></td>
	</tr>
	
		<tr>
		<td></td>
		<td>$
			 <input type="text" size = "25" value="">
		</td>
		<td>$
			 <input type="text" size = "25" value="">
		</td>
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