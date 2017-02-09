function sum () {
	var input_1_all = document.getElementById("page18_1_guessall").value;
	var input_2_all = document.getElementById("page18_2_guessall").value;
	var input_3_all = document.getElementById("page18_3_guessall").value;
	var input_4_all = document.getElementById("page18_4_guessall").value;
	var input_5_all = document.getElementById("page18_5_guessall").value;
	var input_6_all = document.getElementById("page18_6_guessall").value;
	var input_7_all = document.getElementById("page18_7_guessall").value;
	var input_8_all = document.getElementById("page18_8_guessall").value;
	var input_9_all = document.getElementById("page18_9_guessall").value;
	
	var input_1_bad = document.getElementById("page18_1_guessbad").value;
	var input_2_bad = document.getElementById("page18_2_guessbad").value;
	var input_3_bad = document.getElementById("page18_3_guessbad").value;
	var input_4_bad = document.getElementById("page18_4_guessbad").value;
	var input_5_bad = document.getElementById("page18_5_guessbad").value;
	var input_6_bad = document.getElementById("page18_6_guessbad").value;
	var input_7_bad = document.getElementById("page18_7_guessbad").value;
	var input_8_bad = document.getElementById("page18_8_guessbad").value;
	var input_9_bad = document.getElementById("page18_9_guessbad").value;	
	
	var value_1_all = parseInt(input_1_all,10);
	var value_2_all = parseInt(input_2_all,10);
	var value_3_all = parseInt(input_3_all,10);
	var value_4_all = parseInt(input_4_all,10);
	var value_5_all = parseInt(input_5_all,10);
	var value_6_all = parseInt(input_6_all,10);
	var value_7_all = parseInt(input_7_all,10);
	var value_8_all = parseInt(input_8_all,10);
	var value_9_all = parseInt(input_9_all,10);

	var value_1_bad = parseInt(input_1_bad,10);
	var value_2_bad = parseInt(input_2_bad,10);
	var value_3_bad = parseInt(input_3_bad,10);
	var value_4_bad = parseInt(input_4_bad,10);
	var value_5_bad = parseInt(input_5_bad,10);
	var value_6_bad = parseInt(input_6_bad,10);
	var value_7_bad = parseInt(input_7_bad,10);
	var value_8_bad = parseInt(input_8_bad,10);
	var value_9_bad = parseInt(input_9_bad,10);


	var totalAll = value_1_all + value_2_all + value_3_all + value_4_all + value_5_all + value_6_all + value_7_all + value_8_all + value_9_all;
	var totalBad = value_1_bad + value_2_bad + value_3_bad + value_4_bad + value_5_bad + value_6_bad + value_7_bad + value_8_bad + value_9_bad;
	
	document.getElementById("page18_10_totalguessall").value = totalAll;
	document.getElementById("page18_10_totalguessbad").value = totalBad;
}