import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _12_Cards_Frequencies {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();
		Pattern pat = Pattern.compile("\\w+");
		Matcher match = pat.matcher(input);

		ArrayList<String> cards = new ArrayList<>();

		while (match.find()) {
			cards.add(match.group());
		}

		Map<String, Integer> output = new LinkedHashMap<>();

		for (String card : cards) {
			Integer count = output.get(card);
			if (count == null) {
				count = 0;
			}
			output.put(card, count + 1);
		}

		
		for (String card : output.keySet()) {
			double percent = (double)output.get(card)*100.00/(double)cards.size();
			System.out.printf("%s -> %.2f%%", card, percent);
			System.out.println();
		}
	}
}