import java.util.Scanner;

public class SAP {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3,smaller,bigger;
		System.out.println("Enter the first number:\t\t ");
		n1=sc.nextInt();
		System.out.println("Enter the second number:\t ");
		n2=sc.nextInt();
		System.out.println("Enter the third number:\t ");
		n3=sc.nextInt();
		bigger=n1>n2?n1:n2;
		bigger=bigger>n3?bigger:n3;
		smaller=n1<n2?n1:n2;
		smaller=smaller<n3?smaller:n3;
		System.out.printf("\t\t\tSum =\t\t %d\n", n1+n2+n3);
		System.out.printf("\t\t\tAverage =\t %d\n", (n1+n2+n3)/3);
		System.out.printf("\t\t\tProduct =\t %d\n", n1*n2*n3);
		System.out.printf("\t\t\tBiggest =\t %d\n", bigger);
		System.out.printf("\t\t\tSmaller =\t %d\n", smaller);
		
		
	}

}
