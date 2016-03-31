copy from 20151206

change 

add 





###############################
new functionalities added:
1. file upload configuration:

- in /Users/dihwang/workspace-sts-3.7.2.RELEASE/java/J2EE_12_layer/src/config/struts.xml， 
	add：
	<include file="file.xml"></include>
  in /Users/dihwang/workspace-sts-3.7.2.RELEASE/java/J2EE_12_layer/WebContent/fileUpload/upload.jsp add：
	<s:form action="uploadFileAction" method="post" package="/fileUpload" theme="simple" enctype="multipart/form-data" >
  uploadFileAction 对应：
	/Users/dihwang/workspace-sts-3.7.2.RELEASE/java/J2EE_12_layer/src/config/file.xml

2.file download configuration：

- server.xml:
	<Context docBase="/Users/dihwang/workspace-sts-3.7.2.RELEASE/java/J2EE_12_layer/WebContent/fileUpload/upload" path="/J2EE_12_layer/upload"/>
	/J2EE_12_layer/upload 对应到download.jsp 内  	<img alt="picture" src="/J2EE_12_layer/upload/冬天的照片.jpg">。实际图片的地址是：
	/Users/dihwang/workspace-sts-3.7.2.RELEASE/java/J2EE_12_layer/WebContent/fileUpload/upload/冬天的照片.jpg

- 在： /Users/dihwang/workspace-sts-3.7.2.RELEASE/java/J2EE_12_layer/src/java/com/upload/FileUploadAction.java 里面：先有：
	public String downloadFile(){
		return "success";
	}
	对应到 /Users/dihwang/workspace-sts-3.7.2.RELEASE/java/J2EE_12_layer/src/config/file.xml 里面：
	<action name="downloadFileAction" class="com.upload.FileUploadAction" method="downloadFile">  的method名
	
	然后，file.xml 里面：
	<param name="inputName">downloadFile</param>
	downloadFile 自动转换为 /Users/dihwang/workspace-sts-3.7.2.RELEASE/java/J2EE_12_layer/src/java/com/upload/FileUploadAction.java 里面的：
	public InputStream getDownloadFile() throws Exception{
	




