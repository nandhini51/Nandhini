
public class Employee{
		String firstName;
		String lastName;
		double salary;
		public Employee(String fName, String lName, double sal) {
		if (fName != null) 
			firstName =fName;
		if (lName != null) 
			lastName = lName;
		if (sal > 0.0) {
		salary=sal;
		}
		else {
		salary=0.0;
		}
		}
		public String getFirstName()
		{
		return firstName;
		}
		public String getLastName()
        {
		return lastName;
		}
		public double getSalary(){
		return salary;
		}
		public void setFirstName(String fName){
			if (fName != null)
			firstName = fName;
			}
			public void setLastName(String lName){
			if (lName != null)
			lastName = lName;
			}
			public void setSalary(double sal){
			if (sal > 0.0){
			salary = sal;
			}
			else {
			salary = 0.0;
			}
			}
public static void main (String args[]){
Employee employee1=new Employee ("Mohamed", "Ali", 20000.00);
Employee employee2=new Employee ("Ahmed", "Ibrahim", 50000.00);
System.out.printf("\nNO:\t NAME\t\t\tYEARLY SALARY\n");
System.out.printf("--\t ----\t\t\t-------------\n");
System.out.printf("1:\t %s %s\t\t$%.2f\n", employee1.getFirstName(),
employee1.getLastName(), employee1.getSalary());
System.out.printf("2:\t %s %s\t\t$%.2f\n", employee2.getFirstName(),
employee2.getLastName(), employee2.getSalary());
employee1.setSalary( (.1*employee1.getSalary())+employee1.getSalary());
employee2.setSalary( (.1*employee2.getSalary())+employee2.getSalary());
System.out.printf("\n10 Percent Salary Raised!! Yoohooooo!\n");
System.out.printf("\nNO:\t NAME\t\t\tYEARLY SALARY\n");
System.out.printf("--\t ----\t\t\t-------------\n");
System.out.printf("1:\t %s %s\t\t$%.2f\n", employee1.getFirstName(),
employee1.getLastName(), employee1.getSalary());
System.out.printf("2:\t %s %s\t\t$%.2f\n", employee2.getFirstName(),
employee2.getLastName(), employee2.getSalary());
}
}
