package org.reads;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Read {
	
	private static void m1() throws JAXBException {
		JAXBContext ni = JAXBContext.newInstance(Employee.class);
        Marshaller un = ni.createMarshaller();
        File f = new File("C:\\Users\\Elangovan\\eclipse-workspace\\ApiRead\\src\\test\\resources\\student.xml");
	    
	    Employee e = new Employee();
	    e.setId(1411155);
	    e.setName("Boopathi");
	    un.marshal(e, f);
	
	
	}
	public static void main(String[] args) throws JAXBException {
		m1();
	}

}
