import java.util.Scanner;
public class JourneyCalculatorApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the speed and time to calculate the distance");
		double speed = scan.nextDouble();
		double time = scan.nextDouble();
		JourneyCalculator journeyCalculator = new JourneyCalculator();
		double distance = journeyCalculator.calculateDistance(speed,time);
		System.out.println(distance);

	}

}
