import java.util.Scanner;
public class CountNumber {

	public static void main(String[] args) {
		int n,c=0,x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a whose digits is to be counted");
		n=sc.nextInt();
		x=n;
		while(n>0)
		{
			c++;
			n=n/10;
		}
		System.out.println("Number of Digits in "+x+" =="+c);
	}

}
