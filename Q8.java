import java.util.Scanner;

public class Q8 {
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   int n1,n2,k;
	   System.out.println("Enter the first number");
	   n1=sc.nextInt();
	   System.out.println("Enter the second number");
	   n2=sc.nextInt();
	   k=n2%n1;
	   if(k==0) {
		   System.out.printf("n1 is a multiple of n2");
	   }
	   
		   else {
			   System.out.printf("n1 is not a multiple of n2");
			   
			   
		   }
	   }
	   
   }

