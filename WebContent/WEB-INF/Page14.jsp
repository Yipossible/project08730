<jsp:include page="top5.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<h1>4)	Value of perishable food</h1>
		</div>
		<div class="panel-body">
		<c:forEach var="error" items="${errors}">
			<h3 style="color:red"> ${error} </h3>
		</c:forEach>

<p>
<b>

</b>
</p>

<p>
Next, let's focus on one specific inconvenience: spoiled food. Below we have 
provided you a picture of the contents of a typical refrigerator/freezer to help 
you think about the food you have:
</p>

<p>
<strong>
	<img src="${initParam.page14_img}">
</strong>
</p>

<p>
The US Department of Agriculture (USDA) says that a perishable food is stored in
 a refrigerator but held above 40 °F for more than 2 hours and started to thawed 
 or a food stored in full freezer longer than 48 hours without power and does not
  contain ice crystals or held above 40 °F should be discarded. The consumer’s guide 
  may be too conservative, but if the power is out for at least several days, you 
  will definitely lose some of the food in your refrigerator and freezer. Note that
   you cannot keep your food outside, such as in ice or snow, because it attracts 
   wild animals or could thaw when the sun comes out.  
</p>

<p id= "hidden">
Please describe how you feel about the food safety information from USDA and how
 you would actually respond to the recommendation (e.g., are you going to throw 
 out all the food after the outage?).
</p>

<textarea rows="10" cols="110" name="text" form="14form">Please write your feelings here. </textarea>
<br>
<form id ="14form">


	<input type="submit" class="btn btn-info"  name="submit" value="Next" style="float: right;"/>
</form>

</body>
</html>