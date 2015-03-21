<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <!-- ExtJs SDK -->
	<%@ include file="/header.jsp"%>
    <title>原创图书展厅</title>
    
    <style type="text/css">
    	body{
    		padding-left: 150px;
    		padding-right: 150px;
    	}
    	.BookLogo{
    		width: 200px;
    		height: 300px;
    	}
    	.clear{
    		clear: both;
    	}
    	#bookDetailInfo{
    		padding-left: 100px;
    	}
    	
    </style>
  </head>
  
  <body>
    <div align="center">
    	<h1>Welcome to the Original Works Gallery</h1>
    	
    	<div id="bookDetails">
    		<span style="float: left;">
    			<a href="#"><img alt="译本封面图标" src="<%=basePath%>img/logo/${book.bookLogoPath}" class="BookLogo"></a>
    		</span>
    		<span style="float: left;" id="bookDetailInfo">
    			<table>
					<tbody>
						<tr><td>名称：</td><td>${book.bookName}</td></tr>
						<tr><td>作者：</td><td>${book.tauthors.authorName}</td></tr>
						<tr><td>出版时间：</td><td>${book.bookPublishDate}</td></tr>
						<tr><td>简介：</td><td>${book.bookBrief}</td></tr>
						<tr><td>下载：</td><td><a href="<%=basePath%>book/${book.bookFilePath}">点击下载</a></td></tr>
					</tbody>
				</table>
    		</span>
    		<span class="clear"></span>
    	</div>
    </div>
  </body>
</html>
