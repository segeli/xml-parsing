package com.hazelnutprogramming.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler{

	@Override
	public void startDocument() throws SAXException {
		System.out.println("--START DOCUMENT--");
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		String textData = new String(ch,start,length);
		if (textData.equals("")) return;
		if (textData.contains("\t")) return;
		if (textData.contains("\n")) return;
		System.out.println(textData);
	}
	
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if(qName.equals("Employee")){
			System.out.println("-------------");
		}
	}
	
	@Override
	public void endDocument() throws SAXException {
		System.out.println("--END DOCUMENT--");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		System.out.println(qName + ":");
		
		if (attributes != null) {
			for (int i = 0; i < attributes.getLength(); i++) {
				String attr = attributes.getQName(i);
				System.out.println(attr + ":" + attributes.getValue(i));
			}
		}
	}
}
