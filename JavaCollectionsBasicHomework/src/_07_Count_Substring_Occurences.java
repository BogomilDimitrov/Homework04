import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _07_Count_Substring_Occurences {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		String userInput = scan.nextLine().toLowerCase();
		String substrCheck = scan.next().toLowerCase();
		int count = 0;

		// First solution:

		Pattern pat = Pattern.compile(substrCheck);
		Matcher match = pat.matcher(userInput);
		while (match.find()) {
			count++;
		}
		System.out.println(count);

		// Second Solution:

		// int lastIndex = 0;
		//
		// while (lastIndex != -1) {
		// lastIndex = userInput.indexOf(substrCheck, lastIndex);
		// if (lastIndex != -1) {
		// count++;
		// lastIndex += substrCheck.length();
		// }
		// }
		//
		//
		// System.out.println(count);
	}

}
