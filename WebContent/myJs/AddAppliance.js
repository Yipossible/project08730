function startTutorial () {
    var googlechart = document.createElement('div');
    googlechart.setAttribute('id','columnchart_material');
    googlechart.setAttribute('style','width: 800px; height: 300px;');
    document.getElementById('board').removeChild(document.getElementById('tutorial'));
    var board = document.getElementById('board');
    board.insertBefore(googlechart, document.getElementById('tablelevel'));
    
}


google.charts.load('current', {'packages':['corechart']});


function drawChart(arr) {
var data = google.visualization.arrayToDataTable(arr);
var options = {
  width: 900,
  height: 300,
  legend: { position: 'top', maxLines: 3 },
  bar: { groupWidth: '50%' },
  vAxis: { gridlines: { count: 4 } },
  isStacked: true,
};

  var chart = new google.visualization.ColumnChart(document.getElementById('columnchart_material'));
  chart.draw(data, options);
}



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
	      var arr =	[['a', 'Vacuum', 'Iron', 'AC', 'Water Healer', 'Microwave', 'Stove', 'TV', 'Speaker'],
	    	 ['Morning'].concat(morning),
	         ['Lunch'].concat(lunch),
	         ['Evening'].concat(evening),
	         ['Night'].concat(night)
	      ];
	      




var morningList = {};
var lunchList = {};
var eveningList = {};
var nightList = {};


var clicks = 0;
//var data = google.visualization.arrayToDataTable([
//        ['Vacuum', 'Iron', 'AC', 'Water Healer', 'Microwave','Stove', 'TV', 'Speaker',{ role: 'annotation' } ],
//        ['Morning', 10, 24, 20, 32, 18, 5,'',''],
//        ['Lunch', 16, 22, 23, 30, 16, 9,'',''],
//        ['Evening', 28, 19, 29, 30, 12, 13,'',''],
//        ['Night', 28, 19, 29, 30, 12, 13, '','']
//      ])

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




function clickplus (e) {    
	console.log(e);
    clicks++;
    document.getElementById(e).value = clicks;
     google.charts.setOnLoadCallback(drawChart(arr));

}

function clickminus(e) {
	console.log(e);
    clicks--; 
    document.getElementById(e).value = clicks;
ogle.charts.setOnLoadCallback(drawChart(arr));
    if (clicks < 0) {
        clicks = 0;
        remove(e);
    }

}

function remove(e) {
	console.log(e);
    var button1 = e.substring(3) + 'plus';
    var button2 = e.substring(3) + 'minus';
    if (e == 'newmorninglargeVacuum') {
        document.getElementById('morningConsumption').removeChild(document.getElementById(e.substring(3)));
        document.getElementById('morningConsumption').removeChild(document.getElementById(button1));
        document.getElementById('morningConsumption').removeChild(document.getElementById(e));
        document.getElementById('morningConsumption').removeChild(document.getElementById(button2));
        delete morningList[e];
    }
        if (e == 'newmorninglargeIron') {
        document.getElementById('morningConsumption').removeChild(document.getElementById(e.substring(3)));
        document.getElementById('morningConsumption').removeChild(document.getElementById(button1));
        document.getElementById('morningConsumption').removeChild(document.getElementById(e));
        document.getElementById('morningConsumption').removeChild(document.getElementById(button2));
        delete morningList[e];
    }
        if (e == 'newmorninglargeAC') {
        document.getElementById('morningConsumption').removeChild(document.getElementById(e.substring(3)));
        document.getElementById('morningConsumption').removeChild(document.getElementById(button1));
        document.getElementById('morningConsumption').removeChild(document.getElementById(e));
        document.getElementById('morningConsumption').removeChild(document.getElementById(button2));
        delete morningList[e];
    }
        if (e == 'newmorningkitchenMV') {
        document.getElementById('morningConsumption').removeChild(document.getElementById(e.substring(3)));
        document.getElementById('morningConsumption').removeChild(document.getElementById(button1));
        document.getElementById('morningConsumption').removeChild(document.getElementById(e));
        document.getElementById('morningConsumption').removeChild(document.getElementById(button2));
        delete morningList[e];
    }
        if (e == 'newmorningkitchenStove') {
        document.getElementById('morningConsumption').removeChild(document.getElementById(e.substring(3)));
        document.getElementById('morningConsumption').removeChild(document.getElementById(button1));
        document.getElementById('morningConsumption').removeChild(document.getElementById(e));
        document.getElementById('morningConsumption').removeChild(document.getElementById(button2));
        delete morningList[e];
    }
        if (e == 'newmorningsmallTV') {
        document.getElementById('morningConsumption').removeChild(document.getElementById(e.substring(3)));
        document.getElementById('morningConsumption').removeChild(document.getElementById(button1));
        document.getElementById('morningConsumption').removeChild(document.getElementById(e));
        document.getElementById('morningConsumption').removeChild(document.getElementById(button2));
        delete morningList[e];
    }
        if (e == 'newmorningsmallSpeaker') {
        document.getElementById('morningConsumption').removeChild(document.getElementById(e.substring(3)));
        document.getElementById('morningConsumption').removeChild(document.getElementById(button1));
        document.getElementById('morningConsumption').removeChild(document.getElementById(e));
        document.getElementById('morningConsumption').removeChild(document.getElementById(button2));
        delete morningList[e];
    }
    
        if (e == 'newlunchlargeVacuum') {
            document.getElementById('lunchConsumption').removeChild(document.getElementById(e.substring(3)));
            document.getElementById('lunchConsumption').removeChild(document.getElementById(button1));
            document.getElementById('lunchConsumption').removeChild(document.getElementById(e));
            document.getElementById('lunchConsumption').removeChild(document.getElementById(button2));
            delete lunchList[e];
        }
            if (e == 'newlunchlargeIron') {
            document.getElementById('lunchConsumption').removeChild(document.getElementById(e.substring(3)));
            document.getElementById('lunchConsumption').removeChild(document.getElementById(button1));
            document.getElementById('lunchConsumption').removeChild(document.getElementById(e));
            document.getElementById('lunchConsumption').removeChild(document.getElementById(button2));
            delete lunchList[e];
        }
            if (e == 'newlunchlargeAC') {
            document.getElementById('lunchConsumption').removeChild(document.getElementById(e.substring(3)));
            document.getElementById('lunchConsumption').removeChild(document.getElementById(button1));
            document.getElementById('lunchConsumption').removeChild(document.getElementById(e));
            document.getElementById('lunchConsumption').removeChild(document.getElementById(button2));
            delete lunchList[e];
        }
            if (e == 'newlunchkitchenMV') {
            document.getElementById('lunchConsumption').removeChild(document.getElementById(e.substring(3)));
            document.getElementById('lunchConsumption').removeChild(document.getElementById(button1));
            document.getElementById('lunchConsumption').removeChild(document.getElementById(e));
            document.getElementById('lunchConsumption').removeChild(document.getElementById(button2));
            delete lunchList[e];
        }
            if (e == 'newlunchkitchenStove') {
            document.getElementById('lunchConsumption').removeChild(document.getElementById(e.substring(3)));
            document.getElementById('lunchConsumption').removeChild(document.getElementById(button1));
            document.getElementById('lunchConsumption').removeChild(document.getElementById(e));
            document.getElementById('lunchConsumption').removeChild(document.getElementById(button2));
            delete lunchList[e];
        }
            if (e == 'newlunchsmallTV') {
            document.getElementById('lunchConsumption').removeChild(document.getElementById(e.substring(3)));
            document.getElementById('lunchConsumption').removeChild(document.getElementById(button1));
            document.getElementById('lunchConsumption').removeChild(document.getElementById(e));
            document.getElementById('lunchConsumption').removeChild(document.getElementById(button2));
            delete lunchList[e];
        }
            if (e == 'newlunchsmallSpeaker') {
            document.getElementById('lunchConsumption').removeChild(document.getElementById(e.substring(3)));
            document.getElementById('lunchConsumption').removeChild(document.getElementById(button1));
            document.getElementById('lunchConsumption').removeChild(document.getElementById(e));
            document.getElementById('lunchConsumption').removeChild(document.getElementById(button2));
            delete lunchList[e];
        }
            if (e == 'neweveninglargeVacuum') {
                document.getElementById('eveningConsumption').removeChild(document.getElementById(e.substring(3)));
                document.getElementById('eveningConsumption').removeChild(document.getElementById(button1));
                document.getElementById('eveningConsumption').removeChild(document.getElementById(e));
                document.getElementById('eveningConsumption').removeChild(document.getElementById(button2));
                delete eveningList[e];
            }
                if (e == 'neweveninglargeIron') {
                document.getElementById('eveningConsumption').removeChild(document.getElementById(e.substring(3)));
                document.getElementById('eveningConsumption').removeChild(document.getElementById(button1));
                document.getElementById('eveningConsumption').removeChild(document.getElementById(e));
                document.getElementById('eveningConsumption').removeChild(document.getElementById(button2));
                delete eveningList[e];
            }
                if (e == 'neweveninglargeAC') {
                document.getElementById('eveningConsumption').removeChild(document.getElementById(e.substring(3)));
                document.getElementById('eveningConsumption').removeChild(document.getElementById(button1));
                document.getElementById('eveningConsumption').removeChild(document.getElementById(e));
                document.getElementById('eveningConsumption').removeChild(document.getElementById(button2));
                delete eveningList[e];
            }
                if (e == 'neweveningkitchenMV') {
                document.getElementById('eveningConsumption').removeChild(document.getElementById(e.substring(3)));
                document.getElementById('eveningConsumption').removeChild(document.getElementById(button1));
                document.getElementById('eveningConsumption').removeChild(document.getElementById(e));
                document.getElementById('eveningConsumption').removeChild(document.getElementById(button2));
                delete eveningList[e];
            }
                if (e == 'neweveningkitchenStove') {
                document.getElementById('eveningConsumption').removeChild(document.getElementById(e.substring(3)));
                document.getElementById('eveningConsumption').removeChild(document.getElementById(button1));
                document.getElementById('eveningConsumption').removeChild(document.getElementById(e));
                document.getElementById('eveningConsumption').removeChild(document.getElementById(button2));
                delete eveningList[e];
            }
                if (e == 'neweveningsmallTV') {
                document.getElementById('eveningConsumption').removeChild(document.getElementById(e.substring(3)));
                document.getElementById('eveningConsumption').removeChild(document.getElementById(button1));
                document.getElementById('eveningConsumption').removeChild(document.getElementById(e));
                document.getElementById('eveningConsumption').removeChild(document.getElementById(button2));
                delete eveningList[e];
            }
                if (e == 'neweveningsmallSpeaker') {
                document.getElementById('eveningConsumption').removeChild(document.getElementById(e.substring(3)));
                document.getElementById('eveningConsumption').removeChild(document.getElementById(button1));
                document.getElementById('eveningConsumption').removeChild(document.getElementById(e));
                document.getElementById('eveningConsumption').removeChild(document.getElementById(button2));
                delete eveningList[e];
            }
                if (e == 'newnightlargeVacuum') {
                    document.getElementById('nightConsumption').removeChild(document.getElementById(e.substring(3)));
                    document.getElementById('nightConsumption').removeChild(document.getElementById(button1));
                    document.getElementById('nightConsumption').removeChild(document.getElementById(e));
                    document.getElementById('nightConsumption').removeChild(document.getElementById(button2));
                    delete nightList[e];
                }
                    if (e == 'newnightlargeIron') {
                    document.getElementById('nightConsumption').removeChild(document.getElementById(e.substring(3)));
                    document.getElementById('nightConsumption').removeChild(document.getElementById(button1));
                    document.getElementById('nightConsumption').removeChild(document.getElementById(e));
                    document.getElementById('nightConsumption').removeChild(document.getElementById(button2));
                    delete nightList[e];
                }
                    if (e == 'newnightlargeAC') {
                    document.getElementById('nightConsumption').removeChild(document.getElementById(e.substring(3)));
                    document.getElementById('nightConsumption').removeChild(document.getElementById(button1));
                    document.getElementById('nightConsumption').removeChild(document.getElementById(e));
                    document.getElementById('nightConsumption').removeChild(document.getElementById(button2));
                    delete nightList[e];
                }
                    if (e == 'newnightkitchenMV') {
                    document.getElementById('nightConsumption').removeChild(document.getElementById(e.substring(3)));
                    document.getElementById('nightConsumption').removeChild(document.getElementById(button1));
                    document.getElementById('nightConsumption').removeChild(document.getElementById(e));
                    document.getElementById('nightConsumption').removeChild(document.getElementById(button2));
                    delete nightList[e];
                }
                    if (e == 'newnightkitchenStove') {
                    document.getElementById('nightConsumption').removeChild(document.getElementById(e.substring(3)));
                    document.getElementById('nightConsumption').removeChild(document.getElementById(button1));
                    document.getElementById('nightConsumption').removeChild(document.getElementById(e));
                    document.getElementById('nightConsumption').removeChild(document.getElementById(button2));
                    delete nightList[e];
                }
                    if (e == 'newnightsmallTV') {
                    document.getElementById('nightConsumption').removeChild(document.getElementById(e.substring(3)));
                    document.getElementById('nightConsumption').removeChild(document.getElementById(button1));
                    document.getElementById('nightConsumption').removeChild(document.getElementById(e));
                    document.getElementById('nightConsumption').removeChild(document.getElementById(button2));
                    delete nightList[e];
                }
                    if (e == 'newnightsmallSpeaker') {
                    document.getElementById('nightConsumption').removeChild(document.getElementById(e.substring(3)));
                    document.getElementById('nightConsumption').removeChild(document.getElementById(button1));
                    document.getElementById('nightConsumption').removeChild(document.getElementById(e));
                    document.getElementById('nightConsumption').removeChild(document.getElementById(button2));
                    delete nightList[e];
                }
}

function addtoPanel(e) {

	console.log(e);
    var reference = document.getElementById("reference").innerHTML;
    
    var newImage = document.getElementById(e.id).cloneNode(true);
    
    var button1 = document.createElement('button');
        button1.setAttribute('type', 'button');
        button1.setAttribute('class', 'trigger');
        button1.setAttribute('data-type',"plus");
        button1.innerHTML = '+';
    
    
    var input = document.createElement('input');
        input.setAttribute('type', 'number');
        input.setAttribute('class', 'input');
        input.setAttribute('value', '1');
        input.setAttribute('size', '3');
        
        
    var button2 = document.createElement('button');
        button2.setAttribute('type', 'button');
        button2.setAttribute('class', 'trigger');
        button2.setAttribute('data-type',"minus");
        button2.setAttribute('min','1');
        button2.innerHTML = '-';
    
    
    if (reference == "MorningTime") {
        var table = document.getElementById("morningConsumption");
        var imageid = "morning" + newImage.id;
        var inputid = "newmorning" + newImage.id;
        var button1id = "morning" + newImage.id + "plus";
        var button2id = "morning" + newImage.id + "minus";
        newImage.setAttribute("id", imageid);
        newImage.removeAttribute('onclick');
        input.setAttribute('id', inputid);
        button1.setAttribute('onclick','clickplus("' + inputid + '")');
        button1.setAttribute('id',button1id);
        button2.setAttribute('id',button2id);
        button2.setAttribute('onclick','clickminus("' + inputid + '")');
        
        if (!morningList.hasOwnProperty(inputid)){
        table.appendChild(newImage);
        table.appendChild(button1);
        table.appendChild(input);
        table.appendChild(button2);
        morningList[inputid] = 1;
        }
    }
    
        if (reference == "LunchTime") {
        var table = document.getElementById("lunchConsumption");
        var imageid = "lunch" + newImage.id;
        var inputid = "newlunch" + newImage.id;
        var button1id = "morning" + newImage.id + "plus";
        var button2id = "morning" + newImage.id + "minus";
        newImage.setAttribute("id", imageid);
        newImage.removeAttribute('onclick');
        input.setAttribute('id', inputid);
        button1.setAttribute('onclick','clickplus("' + inputid + '")');
        button1.setAttribute('id',button1id);
        button2.setAttribute('id',button2id);
        button2.setAttribute('onclick','clickminus("' + inputid + '")');
        
        if (!lunchList.hasOwnProperty(inputid)){
        table.appendChild(newImage);
        table.appendChild(button1);
        table.appendChild(input);
        table.appendChild(button2);
        lunchList[inputid] = 1;
        }
        
    }
    
        if (reference == "EveningTime") {
        var table = document.getElementById("eveningConsumption");
        var imageid = "Evening" + newImage.id;
        var inputid = "newEvening" + newImage.id;
        var button1id = "morning" + newImage.id + "plus";
        var button2id = "morning" + newImage.id + "minus";
        newImage.setAttribute("id", imageid);
        newImage.removeAttribute('onclick');
        input.setAttribute('id', inputid);
        button1.setAttribute('onclick','clickplus("' + inputid + '")');
        button1.setAttribute('id',button1id);
        button2.setAttribute('id',button2id);
        button2.setAttribute('onclick','clickminus("' + inputid + '")');
        
        if (!eveningList.hasOwnProperty(inputid)){
        table.appendChild(newImage);
        table.appendChild(button1);
        table.appendChild(input);
        table.appendChild(button2);
        eveningList[inputid] = 1;
        }
    }
    
        if (reference == "NightTime") {
        var table = document.getElementById("nightConsumption");
        var imageid = "night" + newImage.id;
        var inputid = "newnight" + newImage.id;
        var button1id = "morning" + newImage.id + "plus";
        var button2id = "morning" + newImage.id + "minus";
        newImage.setAttribute("id", imageid);
        newImage.removeAttribute('onclick');
        input.setAttribute('id', inputid);
        button1.setAttribute('onclick','clickplus("' + inputid + '")');
        button1.setAttribute('id',button1id);
        button2.setAttribute('id',button2id);
        button2.setAttribute('onclick','clickminus("' + inputid + '")');
        
        if (!nightList.hasOwnProperty(inputid)){
        table.appendChild(newImage);
        table.appendChild(button1);
        table.appendChild(input);
        table.appendChild(button2);
        nightList[inputid] = 1;
        }
    }

}



