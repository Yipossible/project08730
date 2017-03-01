<jsp:include page="top2.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		    <h1>Part A. Information about your household</h1>
		</div>
		<div class="panel-body">
		<c:forEach var="error" items="${errors}">
			<h3 style="color:red"> ${error} </h3>
		</c:forEach>
		<form action="" method="POST">
			<p>1. Where do you live? Please input your zip code.</p>
			<input type="text" name="zipcode"placeholder="Please input zip code" class="form-control" ></td>
			<p>How long have you lived in (State, City)?</p>
			<input type="text" name="cityLiveTime" class="form-control" ></td>	 years
			<p>2. What is your age?</p>
			<input type="text" name="age" class="form-control" ></td>	 years old
			<p>3. How many people are there in your household in each of the following age groups:</p>
			<table>
				<tr> 
					<td>Preschool children:</td>
					<td> <input type="text" name="preschool" class="form-control" ></td>
				</tr>
					<td>K-12 children:</td>
					<td> <input type="text" name="k12" class="form-control" ></td>
				</tr>
				<tr> 
					<td>Adults under 30 years old:</td>
					<td> <input type="text" name="under30" class="form-control" ></td>
				</tr>
				<tr>
					<td>30-65 years old:</td>
					<td> <input type="text" name="from30to65" class="form-control" ></td>
				</tr>
				<tr> 
					<td>Over 65 years old:</td>
					<td> <input type="text" name="over65" class="form-control" ></td>
				</tr>
			</table>
			<br>
			</div>
			<input type="submit" class="btn btn-info" name="submit" value="Next" style="float: right;"/>
		</form> 
		<button onclick="getLocation()">Try It</button>
		<p id="demo"></p>
		<script>
var x = document.getElementById("demo");

function getLocation() {
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(showPosition);
    } else { 
        x.innerHTML = "Geolocation is not supported by this browser.";
    }
}

function showPosition(position) {
    x.innerHTML = "Latitude: " + position.coords.latitude + 
    "<br>Longitude: " + position.coords.longitude;
}
</script>
</body></html>
