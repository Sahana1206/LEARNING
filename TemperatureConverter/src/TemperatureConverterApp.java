import java.util.Scanner;
public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temperature in fahrenheit");
		double fahrenheit = scan.nextDouble();
		
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		double c= temperatureConverter.convertFarhrenheitToCelsius(fahrenheit);
		System.out.println(c);
		

	}

}
