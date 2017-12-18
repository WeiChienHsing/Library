package ttt;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Assignment1 {
	
	private String[] test;
	
	private List<Map<String, Object>> test1;
	public static List<Map<String, Object>>  tttt (String[] args) throws IOException {
		return null;
	}
	public static void main(String[] args) throws IOException {
		
		String[] ids = "1,2,3".split(",");
		
		
		for(String id : ids) {
			
			System.out.println(id);
		}
	}
}