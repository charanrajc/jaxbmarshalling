package com.app;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Test 
{
	public static void main(String[] args) throws JAXBException 
	{
		Employee emp=new Employee();
		emp.setId(10);
		emp.setName("charan");
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Marshaller marshaller = context.createMarshaller();
		File file=new File("d:/employee.xsd");
		marshaller.marshal(emp, file);
		System.out.println("JAXB Marshaller sucessfully done");
	}
}
