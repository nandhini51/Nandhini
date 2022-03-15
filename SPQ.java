import java.util.Scanner;

public class SPQ {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n1,n2;
		System.out.printf("Enter First Number :\t ");
		n1=sc.nextInt();
		System.out.printf("Enter Second Number :\t ");
		n2=sc.nextInt();
		System.out.printf("\tSum =\t\t %d\n",n1+n2);
		System.out.printf("\tProduct =\t %d\n",n1*n2);
		System.out.printf("\tDifference =\t %d\n",n1-n2);
		System.out.printf("\tQuotient =\t %d\n",n1/n2);

	}

}
