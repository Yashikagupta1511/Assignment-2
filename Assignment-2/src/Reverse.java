import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		int n,rev=0,rem,x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		x=n;
		while(n>0)
		{
			rem=n%10;
			rev=rem+rev*10;
			n=n/10;
		}
		System.out.println("Reverse of "+x+"=="+rev);
	}

}
