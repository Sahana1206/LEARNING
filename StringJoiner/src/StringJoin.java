import java.util.Scanner;
public class StringJoin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your firstname and lastname");
		String firstName = scan.next();
		String lastName=scan.next();
		System.out.println(joinStrings(firstName,lastName));
	}
	public static String joinStrings(String str1, String str2) {
	return str1 + str2;
	
	}

}
