package com.app;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class UnmarshallingTest 
{
	public static void main(String[] args) throws JAXBException 
	{
		File file=new File("d:/employee.xsd");
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Unmarshaller unmarshaller=context.createUnmarshaller();
		Object ob=unmarshaller.unmarshal(file);
		Employee e= (Employee)ob;
		System.out.println("id :"+e.getId());
		System.out.println("name :"+e.getName());
		System.out.println(" Unmarshalling complted");
		
		

		
	}
}
