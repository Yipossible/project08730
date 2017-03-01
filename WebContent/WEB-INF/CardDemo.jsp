<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript" src="myJs/GoogleChart.js"></script>  
    <script type="text/javascript" src="myJs/changeTime.js"></script>
    <script type="text/javascript" src="myJs/AddAppliance.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script type="text/javascript" src="myJs/startPage.js"></script>
    
	<script type="text/javascript">
	var dict = {"Vacuum":20,'Iron': 10, 'AC':10, 'Water Heater':20, 'Microwave':10,
	          'Stove':20, 'TV':10, 'Speaker':10 };
	var mid = ["newmorninglargeVacuum", "newmorninglargeWH", "newmorninglargeAC", "newmorninglargeIron", "newmorningkitchenStove", "newmorningkitchenMV", "newmorningsmallTV", "newmorningsmallSpeaker"];
	var lid = ["newlunchlargeVacuum", "newlunchlargeWH", "newlunchlargeAC", "newlunchlargeIron", "newlunchkitchenStove", "newlunchkitchenMV", "newlunchsmallTV", "newlunchsmallSpeaker"];
	var eid = ["newEveninglargeVacuum", "newEveninglargeWH", "newEveninglargeAC", "newEveninglargeIron", "newEveningkitchenStove", "newEveningkitchenMV", "newEveningsmallTV", "newEveningsmallSpeaker"];
	var nid = ["newnightlargeVacuum", "newnightlargeWH", "newnightlargeAC", "newnightlargeIron", "newnightkitchenStove", "newnightkitchenMV", "newnightsmallTV", "newnightsmallSpeaker"];
	var app = ['Vacuum','Iron', 'AC', 'Water Heater', 'Microwave','Stove', 'TV', 'Speaker'];
	var morning = [0, 0, 0, 0, 0, 0, 0, 0];
	var lunch = [0, 0, 0, 0, 0, 0, 0, 0];
	var evening = [0, 0, 0, 0, 0, 0, 0, 0];
	var night = [0, 0, 0, 0, 0, 0, 0, 0];
	$(document).ready(function() {
		$('.trigger').click(function(){  
			for (i = 0; i < 8; i++) {
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
			console.log(morning);
		      var arr =	[['a', 'Vacuum', 'Iron', 'AC', 'Water Healer', 'Microwave', 'Stove', 'TV', 'Speaker'],
		    	 ['Morning'].concat(morning),
		         ['Lunch'].concat(lunch),
		         ['Evening'].concat(evening),
		         ['Night'].concat(night)
		      ];
		      console.log(arr);
			google.charts.setOnLoadCallback(drawChart(arr));
		});
     });
	</script>
</head>
<body>
    <!--This is for Appliance List-->
    <div class="level1" style="width:300px;">
        <p id = "reference">startTime</p>
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
             <div id="tutorial" style="width: 800px; height: 300px;">
            <img src="images/tutorial.png" id = 'tutorialimage' onclick="startTutorial()">
        	</div>
            
        <!--  <div id="chart_div" style="width: 800px; height: 300px;"></div> -->
    
            <!--This is for the four periods boxes-->
        <div class="level2">
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
        <input type="button" value="Next" id="trigger">
    </div>
    
    
    
    
</body>
    
</html>