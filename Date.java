import java.util.Scanner;

public class Date {
	private static final int MyYear = 0;
	private int month;
	private int day;
	private int year;
	public Date(int myMonth, int myDay, int myYear) {
		month= myMonth;
		day= myDay;
		year= myYear;
		}
		public void setMonthDate(int myMonth) {
			month = myMonth;
			}
			public int getMonthDate() {
			return month;
			}
			public void setDayDate(int myDay) {
			day = myDay;
			}
			public int getDayDate() {
			return month;
			}
			public void setYearDate(int myYear) {
			year = myYear;
			}
			public int getYearDate() {
			return year;
			}
			public void displayDate() {
			System.out.printf("%d/%d/%d", month,day,year);
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Date myDate=new Date(30, 10, 2000);
		System.out.println("Enter the month");
		int Mymonth=sc.nextInt();
		myDate.setMonthDate(Mymonth);
		System.out.println("Enter the Day");
		int MyDay=sc.nextInt();
		myDate.setDayDate(MyDay);
		System.out.println("Enter the Date");
		int MyDate=sc.nextInt();
		myDate.setMonthDate(MyYear);
		myDate.displayDate();
		

	}

}
