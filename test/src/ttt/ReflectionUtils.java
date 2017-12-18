package ttt;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Vector;

public class ReflectionUtils {

	
	
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		
		/*String fullClassName = "ttt.Assignment1";
		
		Class<?> clazz = Class.forName(fullClassName);
		Method[] methods = clazz.getDeclaredMethods();
		
		Field[] fileds = clazz.getDeclaredFields();
		
		for(Method method : methods) {
			// System.out.println(field.getName());
			
			System.out.println(method.getName());
			
			System.out.println(method.getGenericReturnType());
			
			
			System.out.println();
		}*/
		
		
		
		/*for(Field field : fileds) {
			// System.out.println(field.getName());
			System.out.println(field.getType().getSimpleName());
			System.out.println(field.getType().getName());
			System.out.println(field.getType().getCanonicalName());
			System.out.println();
			
			System.out.println(field.getType().getSimpleName());
			System.out.println(field.getType().getName());
			System.out.println(field.getGenericType());
			
			
			System.out.println();
		}*/
		
		Field f = ClassLoader.class.getDeclaredField("classes");
		f.setAccessible(true);

		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		Vector<Class> classes =  (Vector<Class>) f.get(classLoader);
		   for (Iterator iter = classes.iterator(); iter.hasNext();) {
	            System.out.println("   Loaded " + iter.next());
	        }
		System.out.println(classes);
		
		
	}

}
