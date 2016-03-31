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

<s:form action="uploadFileAction" method="post" package="/fileUpload" theme="simple" enctype="multipart/form-data" >
	<table align="center" width="50%" border="1">
		<tr>
			<td>please select file:</td>
			<td id="more">
				<s:file name="files"></s:file>
				<s:file name="files"></s:file>
				<s:file name="files"></s:file>
			</td>
		</tr>
		<tr>
			<td><s:submit type="button" value="submit" /></td>
			<td><s:reset type="button" value="reset" /></td>
		</tr>
	</table>	
</s:form>

</body>
</html>