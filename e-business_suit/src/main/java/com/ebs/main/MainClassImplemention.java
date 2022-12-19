package com.ebs.main;

import java.io.OutputStream;
import java.io.Writer;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class MainClassImplemention implements MainClass{

	@Override
	public void processStyleSheet(String xsl_file, Writer out) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processStyleSheet(String xsl_file, OutputStream out) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String checkSession(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map getParametersMap(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Element makeElement(String name, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void appendNodeToApplicationInfo(Node node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setApplicationInfo(String root_name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSessionUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Document getDocument() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Document getDocument(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
