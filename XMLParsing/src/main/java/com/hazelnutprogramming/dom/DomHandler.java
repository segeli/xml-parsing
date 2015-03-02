package com.hazelnutprogramming.dom;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomHandler {

	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(new File("employee.xml"));

			Element rootElement = document.getDocumentElement();
			NodeList empElements = rootElement.getElementsByTagName("employee");
			for (int i = 0; i < empElements.getLength(); i++) {
				// student --> i
				Node node = empElements.item(i);

				// id attr
				NamedNodeMap nodeMap = node.getAttributes();
				Node idAttr = nodeMap.getNamedItem("id");
				System.out.println(idAttr.getNodeName() + ":"
						+ idAttr.getTextContent());

				// name and number
				NodeList children = node.getChildNodes();

				for (int j = 0; j < children.getLength(); j++) {
					Node current = children.item(j);
					if (current.getNodeType() != Node.TEXT_NODE) {
						System.out.println(current.getNodeName() + ":"
								+ current.getTextContent());
					}
				}
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
