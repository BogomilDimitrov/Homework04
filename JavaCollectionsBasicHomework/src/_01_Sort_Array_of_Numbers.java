import java.util.Arrays;
import java.util.Scanner;


public class _01_Sort_Array_of_Numbers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] numbers = new int[n];
		
		for (int i = 0; i < n; i++) {
			numbers[i] = scan.nextInt();
		}
		
		Arrays.sort(numbers);
		String output = "";
		for (int i = 0; i < numbers.length; i++) {
			output += numbers[i] + " ";
		}
		
		System.out.println(output.trim());

	}

}
