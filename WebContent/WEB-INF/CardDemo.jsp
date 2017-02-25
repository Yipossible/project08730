<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript" src="myJs/GoogleChart.js"></script>  
    <script type="text/javascript" src="myJs/AddAppliance.js"></script>
    <script type="text/javascript" src="myJs/changeTime.js"></script>

    

</head>
<body>
    <!--This is for Appliance List-->
    <div class="level1" style="width:300px;">
        <p id = "reference">MorningTime</p>
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
                <img src="images/vacuum.png" id="largeVacuum" width="58" height="90" onclick = "addtoPanel(this);">
                <img src="images/Iron.png"  id="largeIron" width="58" height="90" onclick = "addtoPanel(this);">
                <img src="images/AC.png" id="largeAC" width="58" height=90 onclick = "addtoPanel(this);">
                <img src="images/WaterHealer.png"  id="largeWH" width="58" height="90" onclick = "addtoPanel(this);">
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
    <div class="level1" style="width:900px;">
            <!--This is for the scenario description-->
        <div class="level2">
            <img src="images/Normal-morning-thumb.png" id = "banner" width="800" height="120">
        </div>
    
            <!--This is for the visualized graph-->
        <div id="columnchart_material" style="width: 800px; height: 300px;"></div>
    
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
        <input type="button" value="Next">
    </div>
    
    
    
    
</body>
    
</html>