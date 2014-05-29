import java.util.Scanner;

public class _04_Longest_Increasing_Sequance {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		String userInput = scan.nextLine();
		String[] numStringArr = userInput.split(" ");
		int[] numbers = new int[numStringArr.length];

		int currentSequence = 1;
		int biggestSequence = 1;
		int numPosition = 0;

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(numStringArr[i]);
		}

		System.out.print(numbers[0]);
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > numbers[i - 1]) {
				currentSequence++;
				System.out.print(" " + numbers[i]);
			} else {
				currentSequence = 1;
				System.out.println();
				System.out.print(numbers[i]);
			}

			if (currentSequence > biggestSequence) {
				biggestSequence = currentSequence;
				numPosition = i;
			}
		}
		System.out.println();

		System.out.print("Longest: ");
		for (int i = 0; i < biggestSequence - 1; i++) {
			System.out.print(numbers[numPosition - biggestSequence + 1 + i]
					+ " ");
		}
		System.out.println(numbers[numPosition]);

	}

}
