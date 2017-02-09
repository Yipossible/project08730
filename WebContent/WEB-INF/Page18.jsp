<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Survey Page-18</title>
</head>
<body>
<p>
Please use the calculator below to estimate the value of the food you have, and would need to replace if the power went out for one to two weeks.
</p>

<form method="post" action="page18Caculator.do">
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
			 <input type="text" name="page18_1_guessall" value="">
		</td>
		<td>$
			 <input type="text" name="page18_1_guessbad" value="">
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
			 <input type="text" name="page18_2_guessall" value="">
		</td>
		<td>$
			 <input type="text" name="page18_2_guessbad" value="">
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
			 <input type="text" name="page18_3_guessall" value="">
		</td>
		<td>$
			 <input type="text" name="page18_3_guessbad" value="">
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
			 <input type="text" name="page18_4_guessall" value="">
		</td>
		<td>$
			 <input type="text" name="page18_4_guessbad" value="">
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
			 <input type="text" name="page18_5_guessall" value="">
		</td>
		<td>$
			 <input type="text" name="page18_5_guessbad" value="">
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
			 <input type="text" name="page18_6_guessall" value="">
		</td>
		<td>$
			 <input type="text" name="page18_6_guessbad" value="">
		</td>
	</tr>
	
	<tr>
		<td>Perishable Pies and Pastry</td>
		<td>$
			 <input type="text" name="page18_7_guessall" value="">
		</td>
		<td>$
			 <input type="text" name="page18_7_guessbad" value="">
		</td>
	</tr>
	
	<tr>
		<td>Perishable Vegetables (except raw vegetables)</td>
		<td>$
			 <input type="text" name="page18_8_guessall" value="">
		</td>
		<td>$
			 <input type="text" name="page18_8_guessbad" value="">
		</td>
	</tr>
	
	<tr>
		<td>Soft Cheese</td>
		<td>$
			 <input type="text" name="page18_9_guessall" value="">
		</td>
		<td>$
			 <input type="text" name="page18_9_guessbad" value="">
		</td>
	</tr>
	<button type="submit">Calculate</button>
</table>
</form>


<table>
	<tr>
		<td>Best Guess Total</td>
		<td>$
		${totalGuess}
		</td>
		<td>$
		${totalGuessBad}
		</td>
	</tr>
</table>


<br>
<p>
Losing all the perishable food in your refrigerator may not be the only economic loss you would experience if the
 power goes out during a very chilly and windy winter, especially if you work from home or own a 
 home-business. Please explain and estimate any other economic losses you and others in your household
  might experience in the few weeks power outage.

</p>


<form method="get" action="Page18.do">
	<button type="submit">Next Page</button>
</form>






</body>
</html>