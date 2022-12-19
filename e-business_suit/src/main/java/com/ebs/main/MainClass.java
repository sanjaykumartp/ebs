package com.ebs.main;

import java.io.OutputStream;
import java.io.Writer;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public interface MainClass {

	
	void processStyleSheet(String xsl_file,Writer out);
	
	void processStyleSheet(String xsl_file,OutputStream out);
	
	String checkSession(HttpServletRequest request);
	
	Map getParametersMap(HttpServletRequest request);
	
	Element makeElement(String name,String value);
	
	void appendNodeToApplicationInfo(Node node);
	
	void setApplicationInfo(String root_name);
	
	void setSessionUser();
	
	Document getDocument();
	 
	Document getDocument(String name); 
}
