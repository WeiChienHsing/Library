package ttt;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ValidateUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> paramMap = new HashMap<String, String>();
		
		
		paramMap.put("userId", "u0001");
		paramMap.put("userName", "WeiCheinHsing");
		paramMap.put("userString", "");
		
		System.out.println(max(paramMap, "userId", 4));//false
		System.out.println(max(paramMap, "userId", 10));//true
		System.out.println(notNull(paramMap, "userId"));//true
		System.out.println(notNull(paramMap, "userString"));//false
		System.out.println(notNull(paramMap, "userBirthday"));//false
		System.out.println(max(paramMap, "userBirthday", 500));//true

	}
	
	public static boolean max(Map<String, String> param, String paramKey, Integer num) {
		return getObjectFromMap(param, paramKey).map(String::length)
												.map(length -> length <= num ? true : false)
												.orElse(true);
	}
	
	public static boolean notNull(Map<String, String> param, String paramKey) {
		
		return getObjectFromMap(param, paramKey).map(String::length)
				                                .map(length -> length > 0 ? true : false)
				                                .orElse(false);
	}
	
	private static Optional<String> getObjectFromMap(Map<String, String> param, String paramKey) {
		
		return Optional.ofNullable(param.get(paramKey)).map(String::trim);
	}

}
