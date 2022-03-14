import java.util.Scanner;

public class sphere {
	public static double sphereVolume (double radius) {
		return(4/3)*Math.PI *Math.pow(radius , 3);
	}

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 double radius,volume;
		 System.out.printf("Enter the radius:");
		 radius=sc.nextInt();
		 System.out.printf("Volume = %3f", sphereVolume(radius));
			
		}

	}


