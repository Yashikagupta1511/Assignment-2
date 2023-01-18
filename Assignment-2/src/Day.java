import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in = new Scanner(System.in);
    System.out.println("Enter day");
    int d = in.nextInt();
	}
	static void printDay(int day)
	{
		if(day==1)
		{
			System.out.println("Sunday");
		}
		else if(day==2)
		{
			System.out.println("Monday");
		}
		else if(day==3)
		{
			System.out.println("Tuesday");
		}
		else if(day==4)
		{
			System.out.println("Wedneday");
		}
		else if(day==5)
		{
			System.out.println("Thursday");
		}
		else if(day==6)
		{
			System.out.println("Friday");
		}
		else if(day==7)
		{
			System.out.println("Saturday");
		}
		else {
			System.out.println("Wrong day");
		}
	}

}
