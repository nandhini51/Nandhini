import java.util.Scanner;

public class Student1 {

	public static void main(String[] args) {
		int rollno,m1,m2,m3,total;
		String name;
		float avg;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter rno,m1,m2,m3");
	    rollno=sc.nextInt();
	    m1=sc.nextInt();
	    m2=sc.nextInt();
	    m3=sc.nextInt();
	    System.out.println("Enter name");
	    name=sc.next();
	    total=m1+m2+m3;
	    avg=total/3;
	    System.out.println("name="+name);
	    System.out.println("rollno="+rollno);
	    System.out.println("m1="+m1+"m2"+m2+"m3"+m3);
	    System.out.println("total="+total);
	    System.out.println("avg="+avg);	    
	    
	}

}
