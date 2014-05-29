import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _11_Most_Frequent_Word {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine().toLowerCase();
		Pattern regex = Pattern.compile("\\w+");
		Matcher match = regex.matcher(input);
		ArrayList<String> words = new ArrayList<>();
		
		while (match.find()) {
			words.add(match.group()); 
		}
		
		Map<String, Integer> output = new TreeMap<>();
		
		for (String word : words) {
			Integer count = output.get(word);
			if (count == null) {
				count = 0;
			}
			output.put(word, count+1);
		}
		
		int mostFrequent = 0;
		for (String word : output.keySet()) {
			int count = output.get(word);
			if (count > mostFrequent) {
				mostFrequent = count;
			}
		}
		
		for (String word : output.keySet()) {
			int count = output.get(word);
			if (count == mostFrequent) {
				System.out.printf("%s -> %d times \n", word, count);
			}
		}

	}

}
