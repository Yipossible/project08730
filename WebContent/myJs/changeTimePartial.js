function changeTime(e) {
    var reference = document.getElementById("reference").innerHTML;
    reference = document.getElementById(e.id).innerHTML + "Time";
    document.getElementById("reference").innerHTML = document.getElementById(e.id).innerHTML + "Time";

    if (reference == 'startTime') {
    document.getElementById("banner").src = "images/Limited-morning-thumb.png";
        //add class attribute to images to disable click;
    document.getElementById("morningConsumption").style.backgroundColor = "red";
    document.getElementById("lunchConsumption").style.backgroundColor = "red";
    document.getElementById("eveningConsumption").style.backgroundColor = "red";
    document.getElementById("nightConsumption").style.backgroundColor = "red";
    }
    if (reference == "MorningTime") {
    document.getElementById("banner").src = "images/Limited-morning-thumb.png";
    document.getElementById("morningConsumption").style.backgroundColor = "#ffffff";
    document.getElementById("lunchConsumption").style.backgroundColor = "#cccccc";
    document.getElementById("eveningConsumption").style.backgroundColor = "#cccccc";
    document.getElementById("nightConsumption").style.backgroundColor = "#cccccc";
    }
    if (reference == "LunchTime") {
    document.getElementById("banner").src = "images/Limited-lunch-thumb.png";
    document.getElementById("morningConsumption").style.backgroundColor = "#cccccc";
    document.getElementById("lunchConsumption").style.backgroundColor = "#ffffff";
    document.getElementById("eveningConsumption").style.backgroundColor = "#cccccc";
    document.getElementById("nightConsumption").style.backgroundColor = "#cccccc";
    }
    if (reference == "EveningTime") {
    document.getElementById("banner").src = "images/Limited-evening-thumb.png";
    document.getElementById("morningConsumption").style.backgroundColor = "#cccccc";
    document.getElementById("lunchConsumption").style.backgroundColor = "#cccccc";
    document.getElementById("eveningConsumption").style.backgroundColor = "#ffffff";
    document.getElementById("nightConsumption").style.backgroundColor = "#cccccc";
    }
    if (reference == "NightTime") {
    document.getElementById("banner").src = "images/Limited-night-thumb.png";
    document.getElementById("morningConsumption").style.backgroundColor = "#cccccc";
    document.getElementById("lunchConsumption").style.backgroundColor = "#cccccc";
    document.getElementById("eveningConsumption").style.backgroundColor = "#cccccc";
    document.getElementById("nightConsumption").style.backgroundColor = "#ffffff";
    }
    


}