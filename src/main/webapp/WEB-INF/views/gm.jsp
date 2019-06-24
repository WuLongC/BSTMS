<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>取款金额</title>
<script type="text/javascript" src="jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	$(function(){
	//按钮添加事件
	$("#gm_bt_gm").click(function(){
		
			getMoney($("#gm_bt_gm").val());
		});
})

	function getMoney(obj){
	
		var money = new Object();
		money.value = obj;
		$.post({
			url:"getMoney",
			data:money,
			success:function(data){
					alert(data.value);
				}
		})
	}
</script>
</head>
<body>
<input type="button" id="gm_bt_gm" value="100">
</body>
</html>