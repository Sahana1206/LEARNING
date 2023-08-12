import java.util.Scanner;
public class IfConditional {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int marks = scan.nextInt();
	    System.out.println("Welcome to Kodnest");
	    Check c1 = new Check();
	    c1.checkEligibility(marks);
	}

}
