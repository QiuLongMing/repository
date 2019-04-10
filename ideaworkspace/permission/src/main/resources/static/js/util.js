
/*获取当前时间工具*/
setInterval(function aa() {
	var date = new Date();
	var year = date.getFullYear();
	var month = date.getMonth() + 1;
	var $timespan = $("#timespan");
	if(month < 10) {
		month = "0" + month;
	}
	var day = date.getDate();
	if(day < 10) {
		day = "0" + day;
	}
	var hours = date.getHours();
	if(hours < 10) {
		hours = "0" + hours;
	}
	var mi = date.getMinutes();
	if(mi < 10) {
		mi = "0" + hours;
	}
	var ss = date.getSeconds();
	if(ss < 10) {
		ss = "0" + ss;
	}

	var time = year + "/" + month + "/" + day + "   " + hours + ":" + mi + ":" + ss;
	$timespan.text("当前时间:" + time);
}, 1000);