package level05;

public class task0504 {
	public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
	public static int[] resultArray;
	
	public static void main(String[] args) {
		int length = firstArray.length + secondArray.length;
		resultArray = new int[length];
		for (int i = 0; i < firstArray.length; i++) {
			resultArray[i] = firstArray[i];
		}
		for (int i = 0; i < secondArray.length; i++) {
			resultArray[i + firstArray.length] = secondArray[i];
		}
		for (int i = 0; i < resultArray.length; i++) {
			System.out.print(resultArray[i] + ", ");
		}
	}
}
