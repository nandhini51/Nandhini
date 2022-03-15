import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter percentage marks:");
		double percentage = scan.nextDouble();
		if(percentage >= 90) {
			System.out.println("Grade O");
		}else if(percentage <90 && percentage >=80) {
			System.out.println("Grade A+");
		}else if(percentage <80 && percentage >=70) {
			System.out.println("Grade A");
		}else if(percentage <70 && percentage >=60) {
			System.out.println("Grade B");
		}else if(percentage <60 && percentage >=50) {
			System.out.println("Grade B+");
		}else {
			System.out.println("Fail");
		}
		

	}

}
