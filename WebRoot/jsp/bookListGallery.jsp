<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%
	Object booksPageNumObj = session.getAttribute("booksPageNumKey");
	if(booksPageNumObj == null){
		session.setAttribute("booksPageNumKey", 0);
	}
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <!-- ExtJs SDK -->
	<%@ include file="/header.jsp"%>
    <title>原创图书展厅</title>
    
    <script src="<%=basePath%>js/jquery/jquery-1.6.2.min.js" type=text/javascript></script>
    <script src="<%=basePath%>js/appjs/navigator.js" type=text/javascript></script>
    <script src="<%=basePath%>js/appjs/bookListGallery.js" type=text/javascript></script>
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/bookListGallery.css">
  </head>
  
  <body>
  	<%@ include file="/navigator.jsp" %>
	
    <div id="bookListShow" align="center">
    	<div>
    		<form action="<%=basePath%>app/booksGallery/getAllBooks" method="post">
    			<b>图书类别：</b>
				<select name="bookCategoryKey" title="图书类别">
					<option value="0" selected="selected">不限</option>
					<c:forEach items="${bookCategorys}" var="bookCategory">
						<option value="${bookCategory.bookcategoryId}" title="${bookCategory.bookcategoryId}">${bookCategory.bookcategoryName}</option>						
					</c:forEach>
				</select>
		    	<b>图书格式:</b>
				<select name="bookTypeKey" title="图书格式">
					<option value="0" selected="selected" label="标签" >不限</option>
					<c:forEach items="${bookTypes}" var="bookType">
						<option value="${bookType.booktypeId}" title="${bookType.booktypeId}">${bookType.booktypeName}</option>						
					</c:forEach>
				</select>
				<b>关键字：</b>
				<input name="keyWordsKey" id="keyWordsKey">
		    	<input type="submit" value="搜索"> 
		    </form>
    	</div>
    	
    	<div id="bookList">
    		<ol style="list-style: none;">
	    		<c:forEach items="${books}" var="book">
		    		<li>
		    			<a href="<%=basePath%>app/booksGallery/getBookDetailsByBookId?bookIdKey=${book.bookId}"><img alt="译本封面图标" src="<%=basePath%>img/logo/${book.bookLogoPath}" class="BookLogo"></a><br>
		    			<a href="<%=basePath%>app/booksGallery/getBookDetailsByBookId?bookIdKey=${book.bookId}">${book.bookName}[${book.tauthors.authorName}]</a>
		    		</li>
		    	</c:forEach>
	    	</ol>
	    	<div class="clear"></div>
    	</div>
    	
	    <%--
	    <div id="bookListController">
	    	<a href="<%=basePath%>app/booksGallery/getAllBooks?pageNumKey=${booksPageNumKey-1}">上一页</a>&nbsp&nbsp<a href="<%=basePath%>app/booksGallery/getAllBooks?pageNumKey=${booksPageNumKey+1}">下一页</a>
	    </div>
	    --%>
	    
	    <form action="<%=basePath%>app/booksGallery/getAllBooks" method="post">
	    	<input name="pageNumKey">
	    	<input type="submit" value="转到"> 
	    </form>
    </div>
  	
  	<hr color="#FF6100">

	<!-- 页脚区域 -->
	<div id="footer" class="border">
		
	</div>
	
  </body>
</html>
<%--
${book.tauthors.authorName}
--%>