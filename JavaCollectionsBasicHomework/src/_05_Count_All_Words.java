import java.util.Scanner;


public class _05_Count_All_Words {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		String userInput = scan.nextLine();
		String[] wordsCount = userInput.split("\\W+");
		System.out.println(wordsCount.length);

	}

}
