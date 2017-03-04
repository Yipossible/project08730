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
			<input type="text" name="zipcode" placeholder="Please input zip code" class="form-control"  style="width:200px;" ></td>
			<p>How long have you lived in (State, City)?</p>
			<input type="text" name="cityLiveTime" placeholder="Please input number" class="form-control" style="width:200px;display:inline-block; margin-right:10px">years
			<p>2. What is your age?</p>
			<input type="text" name="age" placeholder="Please input number" class="form-control" style="width:200px; display:inline-block; margin-right:10px">years old	 
			<p>3. How many people are there in your household in each of the following age groups:</p>
			<table>
				<tr> 
					<td>Preschool children:</td>
					<td> <input type="text" placeholder="Please input number" name="preschool" class="form-control" ></td>
				</tr>
					<td>K-12 children:</td>
					<td> <input type="text" placeholder="Please input number" name="k12" class="form-control" ></td>
				</tr>
				<tr> 
					<td>Adults under 30 years old:</td>
					<td> <input type="text" placeholder="Please input number" name="under30" class="form-control" ></td>
				</tr>
				<tr>
					<td>30-65 years old:</td>
					<td> <input type="text" placeholder="Please input number" name="from30to65" class="form-control" ></td>
				</tr>
				<tr> 
					<td>Over 65 years old:</td>
					<td> <input type="text" placeholder="Please input number" name="over65" class="form-control" ></td>
				</tr>
			</table>
			<br>
			</div>
			
			<input type="submit" class="btn btn-info" name="submit" value="Next" style="float: right;"/>
		<input type = "text" name = "coordinates" id="demo"/>
		<input type ="text" name="address" id="address"/>
		</form> 
		<button onclick="getLocation()">Try It</button>
		
 
    <script>
    var x = document.getElementById("demo");
    var y = document.getElementById("address");

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
        
        var coordinates = {lat: parseFloat(position.coords.latitude), lng: parseFloat(position.coords.longitude)};
        var geocoder = new google.maps.Geocoder;
    	
 	   geocoder.geocode({'location': coordinates}, function(results, status) {
 	          if (status === 'OK') {
 	              y.innerHTML = results[1].formatted_address;
 	            } 
 	        });
    }

    </script>
    <script async defer
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCi8Ud-RPCQYpTX-TO-fgGzoxfv5qcgtuQ&callback=getLocation">
    </script>

</body></html>
