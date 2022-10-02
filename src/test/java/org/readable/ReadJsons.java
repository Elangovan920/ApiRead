package org.readable;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class ReadJsons {
	private static void m1() throws IOException, ParseException {
		JSONParser j = new JSONParser();
		
	
		FileReader f = new FileReader("C:\\Users\\Elangovan\\eclipse-workspace\\ApiRead\\src\\test\\resources\\JSON\\sample.json");
		Object obj = j.parse(f);
		
		JSONObject jo=(JSONObject)obj;
				System.out.println(jo.get("name").toString());
				System.out.println(jo.get("education").toString());
				System.out.println(jo.get("address").toString());
				System.out.println(jo.get("mail").toString());
				System.out.println(jo.get("phno").toString());
		
		
		
	}
	public static void main(String[] args) throws IOException, ParseException {
		m1();
	}

}
