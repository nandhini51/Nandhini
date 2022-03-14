import java.util.Scanner;

public class Large {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		int bigger;
		System.out.println("Enter the first number: ");
		n1=sc.nextInt();
		System.out.println("Enter the second number: ");
		n2=sc.nextInt();
		if(n1>n2) {
			bigger=n1;
			System.out.println(" n1 is larger");
		}
		else if(n1<n2) {
			bigger=n2;
			System.out.println(" n2 is larger");
		}
		else {
			System.out.println("The numbers are equal");
		}
	}
}
			
			
		
	


