<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Survey Page-15</title>
</head>
<body>
<p>
Please use the calculator below to estimate the value of the food you have, and would need to replace if the power went out for one to two weeks.
</p>

<p style="font-size:large; color:red">
                        ${errors}
                    </p>


<form method="POST" action="page15.do">
<table>
	<tr>
		<td></td>
		<td>Your best guess of the value of food that is in your refrigerator:</td>
		<td>Your best guess of the value of food that will go bad and need to be replaced:</td>
	</tr>
	<tr>
		<td>Meat, Poultry, Seafood</td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td>Raw or leftover cooked meat, Thawing meat or poultry, Salads: meat, tuna, shrimp, Chicken, or egg salad, 
Gravy, stuffing, broth, Lunchmeats, hot dogs, bacon, sausage, dried beef, Pizza – with any topping,
Canned hams labeled ‘keep refrigerated’, Opened canned meats and fish,
Casseroles, soups, stews</td>
		<td>$
			 <input type="text" name="page_15_1_guessall" id = "page15_1_guessall" value="">
		</td>
		<td>$
			 <input type="text" name="page_15_1_guessbad" id = "page15_1_guessbad" value="">
		</td>
	</tr>
	
	<tr>
		<td>Dairy</td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td>Milk, cream, sour cream, Buttermilk, evaporated milk, 
Yogurt, eggnog, soy milk,Open baby formula</td>
		<td>$
			 <input type="text" name="page_15_2_guessall" id = "page15_2_guessall" value="">
		</td>
		<td>$
			 <input type="text" name="page_15_2_guessbad" id = "page15_2_guessbad" value="">
		</td>
	</tr>
	
	<tr>
		<td>Eggs</td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td>Fresh eggs, hard-cooked in shell Custards and puddings, quiche</td>
		<td>$
			 <input type="text" name="page_15_3_guessall" id = "page15_3_guessall" value="">
		</td>
		<td>$
			 <input type="text" name="page_15_3_guessbad" id = "page15_3_guessbad" value="">
		</td>
	</tr>

	<tr>
		<td>Fruits</td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td>Opened canned fruits and juices</td>
		<td>$
			 <input type="text" name="page_15_4_guessall" id = "page15_4_guessall" value="">
		</td>
		<td>$
			 <input type="text" name="page_15_4_guessbad" id = "page15_4_guessbad" value="">
		</td>
	</tr>
	
	<tr>
		<td>Sauces</td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td>Opened mayonnaise, Tartar sauce, Horseradish,Fish sauces, oyster sauce
Opened creamy-based dressings Spaghetti sauce, opened jar</td>
		<td>$
			 <input type="text" name="page_15_5_guessall" id = "page15_5_guessall" value="">
		</td>
		<td>$
			 <input type="text" name="page_15_5_guessbad" id = "page15_5_guessbad" value="">
		</td>
	</tr>
	
	<tr>
		<td>Bread, Cakes, Cookies, Pasta, etc.</td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td>Refrigerator biscuits, rolls, cookie dough, Cooked pasta, rice, potatoes,
Pasta salads with mayonnaise or vinaigrette,Fresh pasta, Cheesecake</td>
		<td>$
			 <input type="text" name="page_15_6_guessall" id = "page15_6_guessall" value="">
		</td>
		<td>$
			 <input type="text" name="page_15_6_guessbad" id = "page15_6_guessbad" value="">
		</td>
	</tr>
	
	<tr>
		<td>Perishable Pies and Pastry</td>
		<td>$
			 <input type="text" name="page_15_7_guessall" id = "page15_7_guessall" value="">
		</td>
		<td>$
			 <input type="text" name="page_15_7_guessbad" id = "page15_7_guessbad" value="">
		</td>
	</tr>
	
	<tr>
		<td>Perishable Vegetables (except raw vegetables)</td>
		<td>$
			 <input type="text" name="page_15_8_guessall" id = "page15_8_guessall" value="">
		</td>
		<td>$
			 <input type="text" name="page_15_8_guessbad" id = "page15_8_guessbad" value="">
		</td>
	</tr>
	
	<tr>
		<td>Soft Cheese</td>
		<td>$
			 <input type="text" name="page_15_9_guessall" id = "page15_9_guessall" value="">
		</td>
		<td>$
			 <input type="text" name="page_15_9_guessbad" id = "page15_9_guessbad" value="">
		</td>
	</tr>
	


</table>





	<input type="submit" value="Next" action="">
</form>






</body>
</html>