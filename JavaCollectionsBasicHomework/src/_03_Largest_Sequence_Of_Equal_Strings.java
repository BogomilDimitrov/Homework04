import java.util.Scanner;


public class _03_Largest_Sequence_Of_Equal_Strings {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		
		String userInput = scan.nextLine();
		String[] words = userInput.split(" ");
		int countTemp = 1;
		int count = 1;
		int wordPosition = 0;
		
		
		for (int i = 1; i < words.length; i++) {
			if (words[i].equals(words[i-1])) {
				countTemp++;
			}else{
				countTemp = 1;
			}
			
			if (countTemp>count) {
				count = countTemp;
				wordPosition = i;
			}
		}
		
		for (int i = 0; i < count-1; i++) {
			System.out.print(words[wordPosition] + " ");
		}
		
		System.out.println(words[wordPosition]);

	}

}
