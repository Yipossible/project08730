
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

        var chart = new google.visualization.ColumnChart(document.getElementById('chart_div'));
        chart.draw(data, options);
      }
 