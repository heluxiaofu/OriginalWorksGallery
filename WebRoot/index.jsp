<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>原创作品展馆</title>
    
    <script src="<%=basePath%>js/jquery/jquery-1.6.2.min.js" type=text/javascript></script>
    <script src="<%=basePath%>js/appjs/navigator.js" type=text/javascript></script>
    <script src="<%=basePath%>js/appjs/index.js" type=text/javascript></script>
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/index.css">
  </head>
  
  <body>
    <%@ include file="/navigator.jsp" %>	
	<!-- 动画展示 -->
	<div id="flashshow" align="center">
		<DIV class="absolute overflow" id=push
			style="WIDTH: 800px;">
			<DIV id=mainPush></DIV>
			<DIV id=linkPush
				style="BACKGROUND: url(img/flash/pushBg.gif); HEIGHT: 43px">
			</DIV>
		</DIV>
		<script type="text/javascript">
			/*
			 * logo动画
			 * */
			function $(x) {
				return document.getElementById(x);
			}
			rnd.today = new Date();
			rnd.seed = rnd.today.getTime();
			function rnd() {
				rnd.seed = (rnd.seed * 9301 + 49297) % 233280;
				return rnd.seed / (233280.0);
			}
			function rand(number) {
				return Math.ceil(rnd() * number) - 1;
			}
			// 标题 .title
			var pushName = ["Cataria", "Alegria", "Sara", "Lori", "Fanandou", "Miny", "Lada"];
			// 图片 .image
			var pushSrc = ["img/flash/01.jpg", "img/flash/02.jpg", "img/flash/03.jpg",
					"img/flash/04.jpg", "img/flash/05.jpg", "img/flash/06.jpg", "img/flash/07.jpg"];
			// 链接 .link
			var pushLink = ["http://www.websbook.com/#1", "http://www.websbook.com/#2",
					"http://www.websbook.com/#3", "http://www.websbook.com/#4",
					"http://www.websbook.com/#5", "http://www.websbook.com/#6",
					"http://www.websbook.com/#7"]
			var pushShow = "";
			function showPushLink(num) {
				if (!num && num != 0) {
					mainPushNum++;
					if (mainPushNum > 6)
						mainPushNum = 0;
					num = mainPushNum;
				}
				for (i = 0; i < 7; i++) {
					$("linkPush" + i).className = "";
					$("linkPush" + i).innerHTML = "<img src='img/flash/push" + i
							+ ".gif'>";
				}
				$("linkPush" + num).className = "linkPushHere";
				$("linkPush" + num).innerHTML = "<strong class='fontOrange'>"
						+ (num + 1) + ".</strong>" + pushName[num];
				$("pushImg").src = pushSrc[num];
				$("pushImgLink").href = pushLink[num];
				$("pushImg").alt = pushName[num];
			}
			// 初始化
			for (i = 0; i < 7; i++) {
				pushShow += '<a href="' + pushLink[i] + '" onmouseover="showPushLink('
						+ i + ');clearInterval(rollId)" id="linkPush' + i
						+ '" target="_blank"><img src="img/flash/push' + i + '.gif"></a>';
			}
			$("linkPush").innerHTML = pushShow;
			var mainPushNum = rand(7);
			$("linkPush" + mainPushNum).className = "linkPushHere";
			$("linkPush" + mainPushNum).innerHTML = "<strong class='fontOrange'>"
					+ (mainPushNum + 1) + ".</strong>" + pushName[mainPushNum];
			$("mainPush").innerHTML = '<a href="'
					+ pushLink[mainPushNum]
					+ '" target="_blank" id="pushImgLink" onmouseover="clearInterval(rollId)" onmouseout="showAtTime()"><img src="'
					+ pushSrc[mainPushNum]
					+ '" name="pushImg" width="800" height="500" id="pushImg" alt="'
					+ pushName[mainPushNum] + '" /></a>';
			var rollId = setInterval("showPushLink()", 5000);
			function showAtTime() {
				showPushLink();
				rollId = setInterval("showPushLink()", 5000);
			}   
	    </script>
	</div>
	
	<hr color="#FF6100">

	<!-- 页脚区域 -->
	<div id="footer" class="border">
		
	</div>
  </body>
</html>
