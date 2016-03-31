<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style type="text/css">
#errMsg{
	color:red;
}
</style>
</head>
<body>
	<s:url id="url" action="downloadFileAction" namespace="/fileUpload" >
		<s:param name="fileName">冬天的照片.jpg</s:param>
	</s:url>
	<s:a href="%{url}">download</s:a>
	<img alt="picture" src="/J2EE_12_layer/upload/冬天的照片.jpg">
	
</body>
</html>