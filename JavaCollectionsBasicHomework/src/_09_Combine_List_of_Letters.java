import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _09_Combine_List_of_Letters {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		String line1 = scan.nextLine();
		String line2 = scan.nextLine();

		ArrayList<String> firstLine = new ArrayList<String>(Arrays.asList(line1
				.split(" ")));
		ArrayList<String> secondLine = new ArrayList<String>(
				Arrays.asList(line2.split(" ")));

		ArrayList<String> output = new ArrayList<>();
		output.addAll(firstLine);
		boolean exists = false;
		for (int i = 0; i < secondLine.size(); i++) {
			for (int j = 0; j < firstLine.size(); j++) {
				if (secondLine.get(i).equals(firstLine.get(j))) {
					exists = true;
				}
			}
			if (!exists) {
				output.add(secondLine.get(i));
			}
			exists = false;
		}

		for (String string : output) {
			System.out.print(string + " ");
		}
	}

}
