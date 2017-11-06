<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/easyui.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/icon.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/demo.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript">
	 //在页面加载完毕后，重新加载JS代码
	  $(function(){
	       $("#tt").tree({
	         url:"${pageContext.request.contextPath}/con/cat",
	         state:"closed",
	         lines:true,
	         
	       // onClick:function(node){
	        // $("#cen").panel("open").panel("refresh",open.url)
	         //}
	       }); 
	   });
	   
	</script>
  </head>
 <body class="easyui-layout">
    <div data-options="region:'north',border:false,split:false"
    style="overflow: hidden; height: 50px; background:#87CEEB repeat-x center 50%; line-height: 20px; color: #f000000; font-family:华文中宋">
    <span style="padding-left: 40px;  font-size: 25px; float: left;padding-top: 10px;color:blue;font-weight:bold;letter-spacing:10px;font-style:italic">持明法州后台管理系统</span></div>   
    <div data-options="region:'west',title:'菜单功能',split:true" style="width:160px">
       <ul id="tt" class="easyui-tree"></ul>
    </div>   
    <div data-options="region:'center',title:'详情显示'" style="padding:5px;background:#eee;"></div>   
 </body>
</html>
