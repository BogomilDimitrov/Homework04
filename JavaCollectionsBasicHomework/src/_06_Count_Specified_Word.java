import java.util.Scanner;


public class _06_Count_Specified_Word {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		String userInput = scan.nextLine().toLowerCase();
		String wordCheck = scan.next().toLowerCase();
		String[] wordsCount = userInput.split("\\W+");
		int count = 0;
		for (int i = 0; i < wordsCount.length; i++) {
			if (wordCheck.equals(wordsCount[i])) {
				count++;
			}
		}
		System.out.println(count);

	}

}
