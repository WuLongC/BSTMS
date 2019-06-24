<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	$(function(){
	//按钮添加事件
	$("#main_bt_gm").click(function(){
			getMoney();
		});
})

	function getMoney(){
		<!--alert($("#main_bt_gm").val())-->
		window.location.href="gm";
		}
</script>
</head>
<body>
<input type="button" id="main_bt_gm" value="取款">
</body>
</html>