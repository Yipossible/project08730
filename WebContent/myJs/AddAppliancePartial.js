function startTutorial () {
    var googlechart = document.createElement('div');
    googlechart.setAttribute('id','columnchart_material');
    googlechart.setAttribute('style','width: 800px; height: 300px;');
    document.getElementById('board').removeChild(document.getElementById('tutorial'));
    
    var board = document.getElementById('board');
    board.insertBefore(googlechart, document.getElementById('tablelevel'));
    
    
}

google.charts.load('current', {packages:['corechart']});


function drawChart(arr) {
    console.log(arr);      
	var data = google.visualization.arrayToDataTable(arr);

	var options = {
	  width: 900,
	  height: 300,
	  legend: { position: 'top', maxLines: 3 },
	  bar: { groupWidth: '50%' },
	  vAxis: { gridlines: { count: 9 }, 
		  viewWindow:{
              max:200,
              min:0
            }
	  },

	  isStacked: true,
	  interpolateNulls: true,
	  seriesType: 'bars',
	  series: {8: {
	      type: "line", 
	      color: '#FF0000' 
	    }
	  }
	};
	
	  var chart = new google.visualization.ComboChart(document.getElementById('columnchart_material'));
	  chart.draw(data, options);
}
	
	
var morningList = {};
var lunchList = {};
var eveningList = {};
var nightList = {};





function getSummary() {
    var morningSummary = document.getElementById("morningConsumption").getElementsByTagName("input");
    var lunchSummary = document.getElementById("lunchConsumption").getElementsByTagName("input");
    var eveningSummary = document.getElementById("eveningConsumption").getElementsByTagName("input");
    var nightSummary = document.getElementById("nightConsumption").getElementsByTagName("input");
    
    for (i = 0; i < morningSummary.length; i++) {
        switch (morningSummary[i].id) {
            case "newmorninglargeVacuum" :  data.children[1].children[1] = morningSummary[i].value; break;
            case "newmorninglargeIron" :  data.children[1].children[2] = morningSummary[i].value; break;
            case "newmorninglargeAC" :  data.children[1].children[3] = morningSummary[i].value; break;
            case "newmorninglargeWH" :  data.children[1].children[4] = morningSummary[i].value; break;
            case "newmorningkitchenMV" :  data.children[1].children[5] = morningSummary[i].value; break;
            case "newmorningkitchenStove" :  data.children[1].children[6] = morningSummary[i].value; break;
            case "newmorningsmallTV" :  data.children[1].children[7] = morningSummary[i].value; break;
            case "newmorningsmallSpeaker" :  data.children[1].children[8] = morningSummary[i].value; break;
        }  
    }
    
        for (i = 0; i < lunchSummary.length; i++) {
        switch (morningSummary[i].id) {
            case "newlunchlargeVacuum" :  data.children[1].children[1] = lunchSummary[i].value; break;
            case "newlunchlargeIron" :  data.children[1].children[2] = lunchSummary[i].value; break;
            case "newlunchlargeAC" :  data.children[1].children[3] = lunchSummary[i].value; break;
            case "newlunchlargeWH" :  data.children[1].children[4] = lunchSummary[i].value; break;
            case "newlunchkitchenMV" :  data.children[1].children[5] = lunchSummary[i].value; break;
            case "newlunchkitchenStove" :  data.children[1].children[6] = lunchSummary[i].value; break;
            case "newlunchsmallTV" :  data.children[1].children[7] = lunchSummary[i].value; break;
            case "newlunchsmallSpeaker" :  data.children[1].children[8] = lunchSummary[i].value; break;
        }  
    }
    
        for (i = 0; i < eveningSummary.length; i++) {
        switch (morningSummary[i].id) {
            case "neweveninglargeVacuum" :  data.children[1].children[1] = eveningSummary[i].value; break;
            case "neweveninglargeIron" :  data.children[1].children[2] = eveningSummary[i].value; break;
            case "neweveninglargeAC" :  data.children[1].children[3] = eveningSummary[i].value; break;
            case "neweveninglargeWH" :  data.children[1].children[4] = eveningSummary[i].value; break;
            case "neweveningkitchenMV" :  data.children[1].children[5] = eveningSummary[i].value; break;
            case "neweveningkitchenStove" :  data.children[1].children[6] = eveningSummary[i].value; break;
            case "neweveningsmallTV" :  data.children[1].children[7] = eveningSummary[i].value; break;
            case "neweveningsmallSpeaker" :  data.children[1].children[8] = eveningSummary[i].value; break;
        }  
    }
    
        for (i = 0; i < nightSummary.length; i++) {
        switch (morningSummary[i].id) {
            case "newnightlargeVacuum" :  data.children[1].children[1] = nightSummary[i].value; break;
            case "newnightlargeIron" :  data.children[1].children[2] = nightSummary[i].value; break;
            case "newnightlargeAC" :  data.children[1].children[3] = nightSummary[i].value; break;
            case "newnightlargeWH" :  data.children[1].children[4] = nightSummary[i].value; break;
            case "newnightkitchenMV" :  data.children[1].children[5] = nightSummary[i].value; break;
            case "newnightkitchenStove" :  data.children[1].children[6] = nightSummary[i].value; break;
            case "newnightsmallTV" :  data.children[1].children[7] = nightSummary[i].value; break;
            case "newnightsmallSpeaker" :  data.children[1].children[8] = nightSummary[i].value; break;
        }  
    }
}




//var threshold = 150;
//var check = document.getElementById('check');
//var gate = true;
//
//// if have reached threshold, cannot add more items.
//
//function thresholdControl() {
//	if (morningSum > threshold) {
//		check.innerHTML = "False";
//		gate = false;
//	} else {
//		check.innerHTML = "True";
//		gate = true;
//	}
//}



// set up score board as global variable
// set up click board as global variable --> click base is referred here



var dict = {"Vacuum":20,'Iron': 10, 'AC':10, 'Water Heater':20, 'Microwave':10,'Stove':20, 'TV':10, 'Speaker':10 };
var mid = ["newmorninglargeVacuum", "newmorninglargeIron", "newmorninglargeAC", "newmorninglargeWH",  "newmorningkitchenMV", "newmorningkitchenStove","newmorningsmallTV", "newmorningsmallSpeaker"];
var lid = ["newlunchlargeVacuum", "newlunchlargeIron", "newlunchlargeAC", "newlunchlargeWH",  "newlunchkitchenMV", "newlunchkitchenStove","newlunchsmallTV", "newlunchsmallSpeaker"];
var eid = ["neweveninglargeVacuum",  "neweveninglargeIron","neweveninglargeAC",  "neweveninglargeWH","neweveningkitchenMV", "neweveningkitchenStove", "neweveningsmallTV", "neweveningsmallSpeaker"];
var nid = ["newnightlargeVacuum", "newnightlargeIron", "newnightlargeAC", "newnightlargeWH", "newnightkitchenMV",  "newnightkitchenStove","newnightsmallTV", "newnightsmallSpeaker"];
var app = ['Vacuum','Iron', 'AC', 'Water Heater', 'Microwave','Stove', 'TV', 'Speaker'];
var appMap = {"largeVacuum":0, "largeIron":1, "largeAC":2, "largeWH":3,  "kitchenMV":4, "kitchenStove":5,"smallTV":6, "smallSpeaker":7};
var morningScore = [0, 0, 0, 0, 0, 0, 0, 0, 150];
var lunchScore = [0, 0, 0, 0, 0, 0, 0, 0, 150];
var eveningScore = [0, 0, 0, 0, 0, 0, 0, 0, 150];
var nightScore = [0, 0, 0, 0, 0, 0, 0, 0, 150];

var morningClick = [0, 0, 0, 0, 0, 0, 0, 0];
var lunchClick = [0, 0, 0, 0, 0, 0, 0, 0];
var eveningClick = [0, 0, 0, 0, 0, 0, 0, 0];
var nightClick = [0, 0, 0, 0, 0, 0, 0, 0];

var morningSum = 0;
var lunchSum = 0;
var eveningSum = 0;
var nightSum = 0;

var gate = true;


var clicksnewmorninglargeVacuum = morningClick[0];
var clicksnewmorninglargeIron = morningClick[1];
var clicksnewmorninglargeAC = morningClick[2];
var clicksnewmorninglargeWH = morningClick[3];
var clicksnewmorningkitchenMV = morningClick[4];
var clicksnewmorningkitchenStove = morningClick[5];
var clicksnewmorningsmallTV = morningClick[6];
var clicksnewmorningsmallSpeaker = morningClick[7];

var clicksnewlunchlargeVacuum = lunchClick[0];
var clicksnewlunchlargeIron = lunchClick[1];
var clicksnewlunchlargeAC = lunchClick[2];
var clicksnewlunchlargeWH = lunchClick[3];
var clicksnewlunchkitchenMV = lunchClick[4];
var clicksnewlunchkitchenStove = lunchClick[5];
var clicksnewlunchsmallTV = lunchClick[6];
var clicksnewlunchsmallSpeaker = lunchClick[7];

var clicksneweveninglargeVacuum = eveningClick[0];
var clicksneweveninglargeIron = eveningClick[1];
var clicksneweveninglargeAC = eveningClick[2];
var clicksneweveninglargeWH = eveningClick[3];
var clicksneweveningkitchenMV = eveningClick[4];
var clicksneweveningkitchenStove = eveningClick[5];
var clicksneweveningsmallTV = eveningClick[6];
var clicksneweveningsmallSpeaker = eveningClick[7];

var clicksnewnightlargeVacuum = nightClick[0];
var clicksnewnightlargeIron = nightClick[1];
var clicksnewnightlargeAC = nightClick[2];
var clicksnewnightlargeWH = nightClick[3];
var clicksnewnightkitchenMV = nightClick[4];
var clicksnewnightkitchenStove = nightClick[5];
var clicksnewnightsmallTV = nightClick[6];
var clicksnewnightsmallSpeaker = nightClick[7];

function generateArr() {

	var dict = {"Vacuum":20,'Iron': 10, 'AC':10, 'Water Heater':20, 'Microwave':10,'Stove':20, 'TV':10, 'Speaker':10 };
	var mid = ["newmorninglargeVacuum", "newmorninglargeIron", "newmorninglargeAC", "newmorninglargeWH",  "newmorningkitchenMV", "newmorningkitchenStove","newmorningsmallTV", "newmorningsmallSpeaker"];
	var lid = ["newlunchlargeVacuum", "newlunchlargeIron", "newlunchlargeAC", "newlunchlargeWH",  "newlunchkitchenMV", "newlunchkitchenStove","newlunchsmallTV", "newlunchsmallSpeaker"];
	var eid = ["neweveninglargeVacuum",  "neweveninglargeIron","neweveninglargeAC",  "neweveninglargeWH","neweveningkitchenMV", "neweveningkitchenStove", "neweveningsmallTV", "neweveningsmallSpeaker"];
	var nid = ["newnightlargeVacuum", "newnightlargeIron", "newnightlargeAC", "newnightlargeWH", "newnightkitchenMV",  "newnightkitchenStove","newnightsmallTV", "newnightsmallSpeaker"];
	var app = ['Vacuum','Iron', 'AC', 'Water Heater', 'Microwave','Stove', 'TV', 'Speaker'];
	
//	console.log ("lunch" + lunchSum);
//	console.log ("evening" + eveningSum);
//	console.log ("night" + nightSum);
//	
	
	for (var i = 0; i < 8; i++){
		var tmp = morningClick[i];
		if (typeof tmp === 'undefined' || !tmp) {
		} else {
			morningSum = morningSum + tmp * dict[app[i]];
			if (morningSum > 150) {
				gate = false;
				console.log (gate);
				alert("You have reached consumption threshold, cannot add more!");
				tmp--;
				morningClick[i] = tmp;
			} else {
				morningScore[i] = tmp * dict[app[i]];
				gate = true;
				console.log (gate);
			}

		}
		
		
	}
	 morningSum = 0;
	
	
	
	
	/*for (i = 0; i < 8; i++) {
		var tmp = morningClick[i];
		if (typeof tmp === 'undefined' || !tmp) {
		} else {
			
			if ((morningSum + dict[app[i]]) < 151) {
				console.log ("morning" + morningSum);
				gate = true;
				console.log (gate);
				morningScore[i] = tmp * dict[app[i]];
				morningSum = morningSum + dict[app[i]];
			
			} else {
				gate = false;
				console.log (gate);
				tmp--;
				morningClick[i] = tmp;
				//morning[i] = tmp * dict[app[i]];
				alert("You have reached consumption threshold, cannot add more!");
			}
		}*/
		
		
		
		
//		var tmp = document.getElementById(lid[i]);
//		if (typeof tmp === 'undefined' || !tmp) {
//		} else {
//			lunch[i] = tmp.value * dict[app[i]];
//		}
//		var tmp = document.getElementById(eid[i]);
//		if (typeof tmp === 'undefined' || !tmp) {
//		} else {
//			evening[i] = tmp.value * dict[app[i]];
//		}
//		var tmp = document.getElementById(nid[i]);
//		if (typeof tmp === 'undefined' || !tmp) {
//		} else {
//			night[i] = tmp.value * dict[app[i]];
//		}
	
	
      var arr =	[['a', 'Vacuum', 'Iron', 'AC', 'Water Healer', 'Microwave', 'Stove', 'TV', 'Speaker', 'Threshold'],
    	 ['Morning'].concat(morningScore),
         //['Lunch'].concat(lunchScore),
         //['Evening'].concat(eveningScore),
         //['Night'].concat(nightScore)
      ];
	return arr;
	console.log ("morningSum in js:" + morningSum);
    console.log(arr);
}











function clickplus (e) {    
	

	for (var i = 0 ; i < 8; i++) {
 		if (e == mid[i]) {
 			var temp = morningClick[i];
 			temp++;
 			morningClick[i] = temp;
 		}
	}
    
  
    arr = generateArr();
    google.charts.setOnLoadCallback(drawChart(arr)); 
}

function clickminus(e) {



	for (var i = 0 ; i < 8; i++) {
 		if (e == mid[i]) {
 			var temp = morningClick[i];
 			temp--;
 			morningClick[i] = temp;
 		}
 	   if (morningClick[i] < 0 || morningClick[i] == 0) {
 	    	morningClick[i] = 0;
 	    	remove(e);
 	        console.log("item removed");
 	     }
 	       
	}
   
                    
  
    
    
  
        arr = generateArr();
        google.charts.setOnLoadCallback(drawChart(arr)); 


}

function remove(e) {
	console.log(e);
    var section = e.substring(3) + 'table';
    if (e == 'newmorninglargeVacuum') {
        document.getElementById('morningConsumption').removeChild(document.getElementById(section));
        delete morningList[e];
    }
        if (e == 'newmorninglargeIron') {
        	document.getElementById('morningConsumption').removeChild(document.getElementById(section));
        	delete morningList[e];
    }
        if (e == 'newmorninglargeAC') {
        	document.getElementById('morningConsumption').removeChild(document.getElementById(section));
        delete morningList[e];
    }
        if (e == 'newmorninglargeWH') {
        	document.getElementById('morningConsumption').removeChild(document.getElementById(section));
            delete morningList[e];
    }
        if (e == 'newmorningkitchenMV') {
        	document.getElementById('morningConsumption').removeChild(document.getElementById(section));
        delete morningList[e];
    }
        if (e == 'newmorningkitchenStove') {
        	document.getElementById('morningConsumption').removeChild(document.getElementById(section));
        delete morningList[e];
    }
        if (e == 'newmorningsmallTV') {
        	document.getElementById('morningConsumption').removeChild(document.getElementById(section));
        delete morningList[e];
    }
        if (e == 'newmorningsmallSpeaker') {
        	document.getElementById('morningConsumption').removeChild(document.getElementById(section));
        delete morningList[e];
    }
    
        if (e == 'newlunchlargeVacuum') {
        	document.getElementById('lunchConsumption').removeChild(document.getElementById(section));
            delete lunchList[e];
        }
            if (e == 'newlunchlargeIron') {
            	document.getElementById('lunchConsumption').removeChild(document.getElementById(section));
            delete lunchList[e];
        }
            if (e == 'newlunchlargeAC') {
            	document.getElementById('lunchConsumption').removeChild(document.getElementById(section));
                delete lunchList[e];
        }
            if (e == 'newlunchlargeWH') {
            	document.getElementById('lunchConsumption').removeChild(document.getElementById(section));
                delete morningList[e];
        }
            if (e == 'newlunchkitchenMV') {
            	document.getElementById('lunchConsumption').removeChild(document.getElementById(section));
            delete lunchList[e];
        }
            if (e == 'newlunchkitchenStove') {
            	document.getElementById('lunchConsumption').removeChild(document.getElementById(section));
            delete lunchList[e];
        }
            if (e == 'newlunchsmallTV') {
            	document.getElementById('lunchConsumption').removeChild(document.getElementById(section));
            delete lunchList[e];
        }
            if (e == 'newlunchsmallSpeaker') {
            	document.getElementById('lunchConsumption').removeChild(document.getElementById(section));
            delete lunchList[e];
        }
            if (e == 'neweveninglargeVacuum') {
            	document.getElementById('eveningConsumption').removeChild(document.getElementById(section));
                delete eveningList[e];
            }
                if (e == 'neweveninglargeIron') {
                document.getElementById('eveningConsumption').removeChild(document.getElementById(section));
                delete eveningList[e];
            }
                if (e == 'neweveninglargeAC') {
                	document.getElementById('eveningConsumption').removeChild(document.getElementById(section));
                delete eveningList[e];
            }
                if (e == 'neweveninglargeWH') {
                	document.getElementById('eveningConsumption').removeChild(document.getElementById(section));
                    delete morningList[e];
            }
                if (e == 'neweveningkitchenMV') {
                	document.getElementById('eveningConsumption').removeChild(document.getElementById(section));
                delete eveningList[e];
            }
                if (e == 'neweveningkitchenStove') {
                	document.getElementById('eveningConsumption').removeChild(document.getElementById(section));
                delete eveningList[e];
            }
                if (e == 'neweveningsmallTV') {
                	document.getElementById('eveningConsumption').removeChild(document.getElementById(section));
                delete eveningList[e];
            }
                if (e == 'neweveningsmallSpeaker') {
                	document.getElementById('eveningConsumption').removeChild(document.getElementById(section));
                delete eveningList[e];
            }
                if (e == 'newnightlargeVacuum') {
                	document.getElementById('nightConsumption').removeChild(document.getElementById(section));
                	 delete nightList[e];
                }
                    if (e == 'newnightlargeIron') {
                    	document.getElementById('nightConsumption').removeChild(document.getElementById(section));
                    delete nightList[e];
                }
                    if (e == 'newnightlargeAC') {
                    	document.getElementById('nightConsumption').removeChild(document.getElementById(section));
                    	delete nightList[e];
                }
                    if (e == 'newnightkitchenMV') {
                    	document.getElementById('nightConsumption').removeChild(document.getElementById(section));
                    	delete nightList[e];
                }
                    if (e == 'newnightlargeWH') {
                    	document.getElementById('nightConsumption').removeChild(document.getElementById(section));
                    	delete morningList[e];
                }
                    if (e == 'newnightkitchenStove') {
                    	document.getElementById('nightConsumption').removeChild(document.getElementById(section));
                    	delete nightList[e];
                }
                    if (e == 'newnightsmallTV') {
                    	document.getElementById('nightConsumption').removeChild(document.getElementById(section));
                    	delete nightList[e];
                }
                    if (e == 'newnightsmallSpeaker') {
                    	document.getElementById('nightConsumption').removeChild(document.getElementById(section));
                    	delete nightList[e];
                }
}

function addtoPanel(e) {

	console.log(e);
    var reference = document.getElementById("reference").innerHTML;
    
    var newImage = document.getElementById(e.id).cloneNode(true);
    
    var button1 = document.createElement('img');
        button1.setAttribute('type', 'button');
        button1.setAttribute('class', 'trigger');
        button1.setAttribute('height',"20");
        button1.setAttribute('width',"20");
        button1.setAttribute('src',"images/upbutton.png");
        
    
    
    var input = document.createElement('p');
        input.setAttribute('class', 'input');
        input.setAttribute('hidden', 'true');

        
        
    var button2 = document.createElement('img');
        button2.setAttribute('type', 'button');
        button2.setAttribute('class', 'trigger');
        button2.setAttribute('height',"20");
        button2.setAttribute('width',"20");
        button2.setAttribute('src',"images/downbutton.png");
    
    var container = document.createElement('div');
    	container.setAttribute('style','float: left;');
    
    if (reference == "MorningTime") {
        var table = document.getElementById("morningConsumption");
        var imageid = "morning" + newImage.id;
        var inputid = "newmorning" + newImage.id;
        var button1id = "morning" + newImage.id + "plus";
        var button2id = "morning" + newImage.id + "minus";
        var containerid = "morning" + newImage.id + "table";
        var mapid = newImage.id;
        newImage.setAttribute("id", imageid);
        newImage.removeAttribute('onclick');
        input.setAttribute('id', inputid);
        //input.setAttribute('value', 1);
        button1.setAttribute('onclick','clickplus("' + inputid + '")');
        button1.setAttribute('id',button1id);
        button2.setAttribute('id',button2id);
        button2.setAttribute('onclick','clickminus("' + inputid + '")');
        container.setAttribute('id', containerid);
        
        if (!morningList.hasOwnProperty(inputid)){
        	table.appendChild(container);
        	container.appendChild(button1);
        	container.appendChild(newImage);
        	container.appendChild(button2);
        	container.appendChild(input);
        morningList[inputid] = 1;
        morningClick[appMap[mapid]] = 1;
        console.log("new item key" + appMap[mapid]);
;        }
    }
    
        if (reference == "LunchTime") {
        var table = document.getElementById("lunchConsumption");
        var imageid = "lunch" + newImage.id;
        var inputid = "newlunch" + newImage.id;
        var button1id = "lunch" + newImage.id + "plus";
        var button2id = "lunch" + newImage.id + "minus";
        var containerid = "lunch" + newImage.id + "table";
        newImage.setAttribute("id", imageid);
        newImage.removeAttribute('onclick');
        input.setAttribute('id', inputid);
        //input.setAttribute('value', 1);
        button1.setAttribute('onclick','clickplus("' + inputid + '")');
        button1.setAttribute('id',button1id);
        button2.setAttribute('id',button2id);
        button2.setAttribute('onclick','clickminus("' + inputid + '")');
        container.setAttribute('id', containerid);
        
        if (!lunchList.hasOwnProperty(inputid)){
        	table.appendChild(container);
        	container.appendChild(button1);
        	container.appendChild(newImage);
        	container.appendChild(button2);
        	container.appendChild(input);
        lunchList[inputid] = 1;
        
        }
        
    }
    
        if (reference == "EveningTime") {
        var table = document.getElementById("eveningConsumption");
        var imageid = "evening" + newImage.id;
        var inputid = "newevening" + newImage.id;
        var button1id = "evening" + newImage.id + "plus";
        var button2id = "evening" + newImage.id + "minus";
        var containerid = "evening" + newImage.id + "table";
        newImage.setAttribute("id", imageid);
        newImage.removeAttribute('onclick');
        input.setAttribute('id', inputid);
        //input.setAttribute('value', 1);
        button1.setAttribute('onclick','clickplus("' + inputid + '")');
        button1.setAttribute('id',button1id);
        button2.setAttribute('id',button2id);
        button2.setAttribute('onclick','clickminus("' + inputid + '")');
        container.setAttribute('id', containerid);
        
        if (!eveningList.hasOwnProperty(inputid)){
        	table.appendChild(container);
        	container.appendChild(button1);
        	container.appendChild(newImage);
        	container.appendChild(button2);
        	container.appendChild(input);
        eveningList[inputid] = 1;
       
        }
    }
    
        if (reference == "NightTime") {
        var table = document.getElementById("nightConsumption");
        var imageid = "night" + newImage.id;
        var inputid = "newnight" + newImage.id;
        var button1id = "night" + newImage.id + "plus";
        var button2id = "night" + newImage.id + "minus";
        var containerid = "night" + newImage.id + "table";
        newImage.setAttribute("id", imageid);
        newImage.removeAttribute('onclick');
        input.setAttribute('id', inputid);
        //input.setAttribute('value', 1);
        button1.setAttribute('onclick','clickplus("' + inputid + '")');
        button1.setAttribute('id',button1id);
        button2.setAttribute('id',button2id);
        button2.setAttribute('onclick','clickminus("' + inputid + '")');
        container.setAttribute('id', containerid);
        
        if (!nightList.hasOwnProperty(inputid)){
        	table.appendChild(container);
        	container.appendChild(button1);
        	container.appendChild(newImage);
        	container.appendChild(button2);
        	container.appendChild(input);
        nightList[inputid] = 1;
        
        }
    }

}



