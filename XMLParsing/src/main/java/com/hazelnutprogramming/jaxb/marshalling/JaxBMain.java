package com.hazelnutprogramming.jaxb.marshalling;

import java.io.File;
import java.math.BigInteger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.hazelnutprogramming.objects.ObjectFactory;
import com.hazelnutprogramming.objects.StudentType;
import com.hazelnutprogramming.objects.StudentsType;

public class JaxBMain {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			JAXBContext context = JAXBContext
					.newInstance("com.hazelnutprogramming.objects");

			Unmarshaller unmarshaller = context.createUnmarshaller();
			JAXBElement<StudentsType> stusElement = (JAXBElement<StudentsType>) unmarshaller
					.unmarshal(new File("student.xml"));

			StudentsType studentsRoot = stusElement.getValue();

			ObjectFactory factory = new ObjectFactory();
			StudentType stu = factory.createStudentType();
			stu.setId("A111");
			stu.setName("Onurcan Donmez");
			stu.setNumber(new BigInteger("21354"));

			//stusElement.getValue().getStudent().add(stu);
			studentsRoot.getStudent().add(stu);
			
			Marshaller writer = context.createMarshaller();
			writer.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, new Boolean(true));
			writer.marshal(stusElement, new File("student.xml"));

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
