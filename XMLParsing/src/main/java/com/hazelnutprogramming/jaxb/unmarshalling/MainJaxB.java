package com.hazelnutprogramming.jaxb.unmarshalling;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.hazelnutprogramming.objects.StudentType;
import com.hazelnutprogramming.objects.StudentsType;

public class MainJaxB {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			JAXBContext context = JAXBContext
					.newInstance("com.hazelnutprogramming.objects");

			Unmarshaller unmarshaller = context.createUnmarshaller();
			JAXBElement<StudentsType> stusElement = (JAXBElement<StudentsType>) unmarshaller
					.unmarshal(new File("student.xml"));

			StudentsType studentsRoot = stusElement.getValue();
			List<StudentType> students = studentsRoot.getStudent();
			
			for (StudentType student : students) {
				System.out.println(student.getId());
				System.out.println(student.getName());
			}
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
