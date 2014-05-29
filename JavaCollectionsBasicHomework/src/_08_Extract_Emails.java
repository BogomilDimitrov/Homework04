import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _08_Extract_Emails {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		String userInput = scan.nextLine();
		Pattern email = Pattern.compile("[\\w0-9._%-]+@[\\w0-9.-]+\\.[\\w]{2,4}");
		Matcher matchEmail = email.matcher(userInput);
		while (matchEmail.find()) {
			System.out.println(matchEmail.group());
		}
		
	}

}
