import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _10_Extract_All_Unique_Words {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine().toLowerCase();
		Pattern regex = Pattern.compile("\\w+");
		Matcher matcher = regex.matcher(input);
		
		Set<String> arrangedWords = new TreeSet<>();
		while (matcher.find()) {
			arrangedWords.add(matcher.group());
		}
		
		for (String string : arrangedWords) {
			System.out.print(string + " ");
		}
	}

}
