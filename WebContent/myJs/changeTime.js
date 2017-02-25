function changeTime(e) {
    var reference = document.getElementById("reference").innerHTML;
    reference = document.getElementById(e.id).innerHTML + "Time";
    document.getElementById("reference").innerHTML = document.getElementById(e.id).innerHTML + "Time";

    if (reference == "MorningTime") {
    document.getElementById("banner").src = "images/Normal-morning-thumb.png";
    document.getElementById("morningConsumption").style.backgroundColor = "#ffffff";
    document.getElementById("lunchConsumption").style.backgroundColor = "#cccccc";
    document.getElementById("eveningConsumption").style.backgroundColor = "#cccccc";
    document.getElementById("nightConsumption").style.backgroundColor = "#cccccc";
    }
    if (reference == "LunchTime") {
    document.getElementById("banner").src = "images/Normal-lunch-thumb.png";
    document.getElementById("morningConsumption").style.backgroundColor = "#cccccc";
    document.getElementById("lunchConsumption").style.backgroundColor = "#ffffff";
    document.getElementById("eveningConsumption").style.backgroundColor = "#cccccc";
    document.getElementById("nightConsumption").style.backgroundColor = "#cccccc";
    }
    if (reference == "EveningTime") {
    document.getElementById("banner").src = "images/Normal-evening-thumb.png";
    document.getElementById("morningConsumption").style.backgroundColor = "#cccccc";
    document.getElementById("lunchConsumption").style.backgroundColor = "#cccccc";
    document.getElementById("eveningConsumption").style.backgroundColor = "#ffffff";
    document.getElementById("nightConsumption").style.backgroundColor = "#cccccc";
    }
    if (reference == "NightTime") {
    document.getElementById("banner").src = "images/Normal-night-thumb.png";
    document.getElementById("morningConsumption").style.backgroundColor = "#cccccc";
    document.getElementById("lunchConsumption").style.backgroundColor = "#cccccc";
    document.getElementById("eveningConsumption").style.backgroundColor = "#cccccc";
    document.getElementById("nightConsumption").style.backgroundColor = "#ffffff";
    }
    


}