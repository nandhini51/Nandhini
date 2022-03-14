import java.util.Scanner;

public class Celsius {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double celsius;
		double Fahrenheit = 0.0;
		celsius=(Fahrenheit - 32) * 5 / 9;
		System.out.printf("The celsius value is %10.2f is %2.2f",  Fahrenheit, celsius);

	}

}
