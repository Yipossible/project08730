<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript" src="myJs/GoogleChart.js"></script>  
    <script type="text/javascript" src="myJs/changeTime.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	    <script type="text/javascript" src="myJs/startPage.js"></script>
    
	<script type="text/javascript">
	var i = 1;
	var dict = {"Vacuum":20,'Iron': 10, 'AC':10, 'Water Healer':20, 'Microwave':10,
	          'Stove':20, 'TV':10, 'Speaker':1 };
	$(document).ready(function() {
		$('.trigger').click(function(){  
		      var arr =	[['Vacuum', 'Iron', 'AC', 'Water Healer', 'Microwave',
		          'Stove', 'TV', 'Speaker',{ role: 'annotation' } ],
		         ['Morning', i, 24, 20, 32, 18, 5,0,0],
		         ['Lunch', 16, 22, 23, 30, 16, 9,0,0],
		         ['Evening', 28, 19, 29, 30, 12, 13,0,0],
		         ['Night', 28, 19, 29, 30, 12, 13, 0,0]
		      ];
		      i = i + 1;
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
                <img src="images/Microwave.png"  id="kitchenMV" width="58" height="90" onclick = "addtoPanel(this);">
                <img src="images/stove.png" id="kitchenStove" width="58" height="90" onclick = "addtoPanel(this);">
                </td>
            </tr>
             <tr>
                <td  class="table"> Small Appliances
                </td>
            </tr>
            <tr>
                <td  class="table"> 
                <img src="images/TV.png"  id="smallTV" width="58" height="90" onclick = "addtoPanel(this);">
                <img src="images/Speaker.png"  id="smallSpeaker" width="58" height="90" onclick = "addtoPanel(this);">

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
                <div id="morningConsumption"></div>
            </div>
            <div class="level3" >
                <button id = "lunchTime" onclick="changeTime(this)">Lunch</button>
                <div id="lunchConsumption"></div>
            </div>
            <div class="level3" > 
                <button id = "eveningTime" onclick="changeTime(this)">Evening</button>
                <div id="eveningConsumption"></div>
            </div>
            <div class="level3" >
                <button id = "nightTime" onclick="changeTime(this)">Night</button>
                <div id="nightConsumption"></div>
            </div>
        </div>
    
    </div>
    <!--This is for the button-->
    <div class="bottom">
        <input type="button" value="Next" id="trigger">
    </div>
    
    
    
    
</body>
    
</html>