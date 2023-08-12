import java.util.Scanner;
public class Doublethenumbers {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		System.out.println(doubleTheNumbers(num));

	}
	
	public static int doubleTheNumbers(int num) {
		return num*2;
	}

}
