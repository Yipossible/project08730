<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript" src="myJs/GoogleChart.js"></script>  
    <script type="text/javascript" src="myJs/changeTime.js"></script>
    <script type="text/javascript" src="myJs/AddAppliancePartial.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<style>
	.overlay {
		width: 850px;
		height: 10px;
		position: absolute;
		top: 100px;
		left: 50px;
	}
	
	</style>


    
<!-- 	<script type="text/javascript">
	var dict = {"Vacuum":20,'Iron': 10, 'AC':10, 'Water Heater':20, 'Microwave':10,
	          'Stove':20, 'TV':10, 'Speaker':10 };
	var mid = ["newmorninglargeVacuum", "newmorninglargeIron", "newmorninglargeAC", "newmorninglargeWH",  "newmorningkitchenMV", "newmorningkitchenStove","newmorningsmallTV", "newmorningsmallSpeaker"];
	var lid = ["newlunchlargeVacuum", "newlunchlargeIron", "newlunchlargeAC", "newlunchlargeWH",  "newlunchkitchenMV", "newlunchkitchenStove","newlunchsmallTV", "newlunchsmallSpeaker"];
	var eid = ["neweveninglargeVacuum",  "neweveninglargeIron","neweveninglargeAC",  "neweveninglargeWH","neweveningkitchenMV", "neweveningkitchenStove", "neweveningsmallTV", "neweveningsmallSpeaker"];
	var nid = ["newnightlargeVacuum", "newnightlargeIron", "newnightlargeAC", "newnightlargeWH", "newnightkitchenMV",  "newnightkitchenStove","newnightsmallTV", "newnightsmallSpeaker"];
	var app = ['Vacuum','Iron', 'AC', 'Water Heater', 'Microwave','Stove', 'TV', 'Speaker'];
	var morning = [0, 0, 0, 0, 0, 0, 0, 0,150];
	var lunch = [0, 0, 0, 0, 0, 0, 0, 0,150];
	var evening = [0, 0, 0, 0, 0, 0, 0, 0,150];
	var night = [0, 0, 0, 0, 0, 0, 0, 0,150];
	var morningSum = 0;
	var lunchSum = 0;
	var eveningSum = 0;
	var nightSum = 0;
	
	var check = document.getElementById('check');
	
	if (check.innerHTML == "True") {
	
	$(document).ready(function() {
		$('.trigger').click(function(){  
			for (i = 0; i < 9; i++) {
				var tmp = document.getElementById(mid[i]);
				if (typeof tmp === 'undefined' || !tmp) {
				} else {
					morning[i] = tmp.value * dict[app[i]];
				}
				var tmp = document.getElementById(lid[i]);
				if (typeof tmp === 'undefined' || !tmp) {
				} else {
					lunch[i] = tmp.value * dict[app[i]];
				}
				var tmp = document.getElementById(eid[i]);
				if (typeof tmp === 'undefined' || !tmp) {
				} else {
					evening[i] = tmp.value * dict[app[i]];
				}
				var tmp = document.getElementById(nid[i]);
				if (typeof tmp === 'undefined' || !tmp) {
				} else {
					night[i] = tmp.value * dict[app[i]];
				}
			}
			
		      var arr =	[['a', 'Vacuum', 'Iron', 'AC', 'Water Healer', 'Microwave', 'Stove', 'TV', 'Speaker', 'threshold'],
		    	 ['Morning'].concat(morning),
		         ['Lunch'].concat(lunch),
		         ['Evening'].concat(evening),
		         ['Night'].concat(night)
		      ];
		      console.log ("morningSum in html:" + morningSum);
		      console.log(arr);
		      
			google.charts.setOnLoadCallback(drawChart(arr));
		});
     });
	} else {
		alert ("You cannot add items!");
	}
	</script>  -->
</head>
<body>
    <!--This is for Appliance List-->
    <div class="level1" style="width:300px;">
        <p id = "reference">startTime</p>
       
		<p id = "check">True</p>
		
        <table class="table">
            <tr >
                <td class="table"> Your Appliances
                </td>
            </tr>
            <tr >
                <td class="table"> Large Appliances
                </td>
            </tr>
            <tr >
                <td class="table"> 
                <img src="images/vacuum.png" class="trigger" id="largeVacuum" width="58" height="90" onclick = "addtoPanel(this);">
                <img src="images/Iron.png"  class="trigger" id="largeIron" width="58" height="90" onclick = "addtoPanel(this);">
                <img src="images/AC.png" class="trigger" id="largeAC" width="58" height=90 onclick = "addtoPanel(this);">
                <img src="images/WaterHealer.png"  class="trigger" id="largeWH" width="58" height="90" onclick = "addtoPanel(this);">
                </td>
            </tr>
             <tr >
                <td class="table"> Kitchen Appliances
                </td>
            </tr>
            <tr>
                <td  class="table"> 
                <img src="images/Microwave.png"  class="trigger" id="kitchenMV" width="58" height="90" onclick = "addtoPanel(this);">
                <img src="images/stove.png" class="trigger" id="kitchenStove" width="58" height="90" onclick = "addtoPanel(this);">
                </td>
            </tr>
             <tr>
                <td  class="table"> Small Appliances
                </td>
            </tr>
            <tr>
                <td  class="table"> 
                <img src="images/TV.png"  class="trigger" id="smallTV" width="58" height="90" onclick = "addtoPanel(this);">
                <img src="images/Speaker.png"  class="trigger" id="smallSpeaker" width="58" height="90" onclick = "addtoPanel(this);">

                </td>
            </tr>
            
        </table>
        

        
    </div >
    <!--This is for the action board-->
    <div class="level1" id = 'board' style="width:900px;">
            <!--This is for the scenario description-->
        <div class="level2">
            <img src="images/Normal-morning-thumb.png" id = "banner" width="800" height="120">
        </div>
    
            <!--This is for the visualized graph-->
       <div class = "level2" id="tutorial" style="width: 800px; height: 300px;">
            <img src="images/tutorial.png" id = 'tutorialimage' onclick="startTutorial()">
        </div>
            
        <!--  <div id="chart_div" style="width: 800px; height: 300px;"></div> -->
    
            <!--This is for the four periods boxes-->
        
        <div class="level2" id ="tablelevel">
        <div>
        	<p id= "result"></p>
        </div>
            <div class="level3" >
                <button id = "morningTime" onclick="changeTime(this)">Morning</button>
                <div id="morningConsumption" style="background-color: rgb(204, 204, 204);"></div>
            </div>
            <div class="level3" >
                <button id = "lunchTime" onclick="changeTime(this)">Lunch</button>
                <div id="lunchConsumption" style="background-color: rgb(204, 204, 204);"></div>
            </div>
            <div class="level3" > 
                <button id = "eveningTime" onclick="changeTime(this)">Evening</button>
                <div id="eveningConsumption" style="background-color: rgb(204, 204, 204);"></div>
            </div>
            <div class="level3" >
                <button id = "nightTime" onclick="changeTime(this)">Night</button>
                <div id="nightConsumption" style="background-color: rgb(204, 204, 204);"></div>
            </div>
        </div>
    
    </div>
    <!--This is for the button-->
    
    <div class="bottom">
        <form method = "get" action = "page14.do">
        <input type="submit" name = "submit" value="Next">
        </form>
    </div>
    
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="bootstrap_js/bootstrap.min.js"></script>  
    
    
</body>
    
</html>