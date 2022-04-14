package com.example.studentJson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
//@SpringBootApplication
public class StudentJsonApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(StudentJsonApplication.class, args);
//	}
//
//}
/**
 * @author Crunchify.com
 * How to write JSON object to File in Java?
 */
	private static FileWriter file;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// JSON object. Key value pairs are unordered. JSONObject supports java.util.Map interface.
		JSONObject obj = new JSONObject();
		obj.put("Name", "Khanh");
		obj.put("Class", "TT32h2");

		JSONArray subject = new JSONArray();
		subject.add("subject: Python co ban");
		subject.add("subject: Java co ban");
		subject.add("subject: Lap trinh .NET");
		obj.put("subject List", subject);
		try {

			// Constructs a FileWriter given a file name, using the platform's default charset
			file = new FileWriter("data.json");
			file.write(obj.toJSONString());
			CrunchifyLog("Ghi thành công vào file");
			CrunchifyLog("\nĐối tượng JSON: " + obj);

		} catch (IOException e) {
			e.printStackTrace();

		} finally {

			try {
				file.flush();
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	static public void CrunchifyLog(String str) {
		System.out.println("OKE RỒI !");
	}

}
