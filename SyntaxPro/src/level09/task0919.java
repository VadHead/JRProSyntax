package level09;

public class task0919 {
	public static void main(String[] args) {
		String string = "Ходит кот задом наперед";
		System.out.println(string);
		System.out.println(reverseString(string));
	}
	
	public static String reverseString(String string) {
		StringBuilder result = new StringBuilder(string);
		return result.reverse().toString();
	}
	
}
