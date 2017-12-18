package ttt;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(binaryToDecimalConverter(789));
		System.out.println(binaryToDecimalConverter(255));
		System.out.println(binaryToDecimalConverter(256));
		System.out.println(binaryToDecimalConverter(6));
	}

	
	public static String binaryToDecimalConverter(Integer number) {
		StringBuilder result = new StringBuilder();
		
		if (number == 0) {
			result.insert(0, 0);
		} else {
			Integer remainder;
			while(number > 0) {
				remainder = number % 2;
				number = number >> 1;
				result.insert(0, remainder);
				
			}
		}
				
		return result.toString();
		
	}
}
