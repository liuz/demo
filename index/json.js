function sendJSON() {
	var xhr = new XMLHttpRequest();
	var url = "http://localhost:8080/billingcycle/payload";
	xhr.open("GET", url, true);
	xhr.setRequestHeader("Content-type", "application/json");
	xhr.setRequestHeader("Access-Control-Allow-Origin", "*");
	xhr.onreadystatechange = function () { 
		if (xhr.readyState == 4 && xhr.status == 200) {
			var json = JSON.parse(xhr.responseText);
			console.log(json);
		}
	}
	var data = JSON.stringify({ 
					   "results":{ 
							  "headers":[ 
								 "UTIL_DEVICE_ID",
								 "MAC_ID",
								 "BILLING_CYCLE_NUM"
							  ],
							  "rows":[ 
								 "261011492 D 372974100 0001 S",
								 "DEADBEEF000003FD",
								 "0"
							  ]
						   }
						});
	xhr.send(data);
}