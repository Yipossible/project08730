
      google.charts.load('current', {'packages':['corechart','bar']});
      google.charts.setOnLoadCallback(drawChart);
      function drawChart() {
      var data = google.visualization.arrayToDataTable([
        ['Vacuum', 'Iron', 'AC', 'Water Healer', 'Microwave',
         'Stove', 'TV', 'Speaker',{ role: 'annotation' } ],
        ['Morning', 10, 24, 20, 32, 18, 5,'',''],
        ['Lunch', 16, 22, 23, 30, 16, 9,'',''],
        ['Evening', 28, 19, 29, 30, 12, 13,'',''],
        ['Night', 28, 19, 29, 30, 12, 13, '','']
      ]);

      var options = {
        width: 900,
        height: 300,
        legend: { position: 'top', maxLines: 3 },
        bar: { groupWidth: '75%' },
        isStacked: true,
      };

        var chart = new google.charts.Bar(document.getElementById('columnchart_material'));

        chart.draw(data, options);
      }
 