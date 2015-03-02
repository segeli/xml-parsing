package com.hazelnutprogramming.dom;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.xml.sax.SAXException;

public class DomManipulate {

	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(new File("employee.xml"));

			Element rootElement = document.getDocumentElement();
			
			Element element = document.createElement("employee");
			
			NamedNodeMap attrs = element.getAttributes();
			Attr attrID = document.createAttribute("id");
			attrID.setTextContent("5");
			attrs.setNamedItem(attrID);
			
			Element age = document.createElement("age");
			age.setTextContent("33");
			Element name = document.createElement("name");
			name.setTextContent("Eray Ýnce");
			Element gender = document.createElement("gender");
			gender.setTextContent("Male");
			Element role = document.createElement("role");
			role.setTextContent("Senior Java Developer");
			
			element.appendChild(age);
			element.appendChild(name);
			element.appendChild(gender);
			element.appendChild(role);
			rootElement.appendChild(element);
			
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			
			StreamResult result = new StreamResult(new File("employee.xml"));
			DOMSource source = new DOMSource(document);
			transformer.transform(source, result);
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerFactoryConfigurationError e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
	}

}
