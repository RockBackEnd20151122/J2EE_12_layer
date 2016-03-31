package com.upload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {
	
	private List<File> files;
	private List<String> filesFileName;
	private List<String> fileContentType;
	
	private String fileName;
	private String nasPath = "/Users/dihwang/workspace-sts-3.7.2.RELEASE/java/J2EE_12_layer/WebContent/fileUpload/upload";
	
	public String uploadFile() throws Exception{
		InputStream inputStream;
		File destFile;
		OutputStream os;
		for(int i=0; i<files.size(); i++){
			inputStream = new FileInputStream(files.get(i));
			destFile = new File(nasPath, this.getFilesFileName().get(i) );
			os = new FileOutputStream(destFile);
			byte[] buffer = new byte[1024 * 2];
			int length =0;
			
			while( (length=inputStream.read(buffer))>0 ){
				os.write(buffer, 0, length);
			}
			
			inputStream.close();
			os.close(); 
		}
		return "success";
	}
	
	public String downloadFile(){
		return "success";
	}
	
	public InputStream getDownloadFile() throws Exception{
		System.out.println(this.fileName);
		System.out.println(this.getFileName());
		Logger.getLogger("stdout").warn("asdfasdfasdfasdfasdf"+ this.getFileName());
		
		InputStream inputStream = new FileInputStream( this.nasPath + "/" + this.fileName );
		
		return inputStream;
	}
	
	public List<File> getFiles() {
		return files;
	}
	public void setFiles(List<File> files) {
		this.files = files;
	}
	public List<String> getFilesFileName() {
		return filesFileName;
	}
	public void setFilesFileName(List<String> filesFileName) {
		this.filesFileName = filesFileName;
	}
	public List<String> getFileContentType() {
		return fileContentType;
	}
	public void setFileContentType(List<String> fileContentType) {
		this.fileContentType = fileContentType;
	}
	public String getFileName() throws UnsupportedEncodingException {
		return java.net.URLEncoder.encode(this.fileName, "UTF-8");
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getNasPath() {
		return nasPath;
	}
	public void setNasPath(String nasPath) {
		this.nasPath = nasPath;
	}
	

}
