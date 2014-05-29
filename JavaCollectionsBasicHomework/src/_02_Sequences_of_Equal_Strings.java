import java.util.Scanner;


public class _02_Sequences_of_Equal_Strings {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String userInput = scan.nextLine();
		String[] words = userInput.split(" ");
		
		for (int i = 0; i < words.length-1; i++) {
			System.out.print(words[i] + " ");
			if (!words[i].equals(words[i+1])) {
				System.out.println();
			}
		}
		System.out.print(words[words.length-1]);
	}

}
