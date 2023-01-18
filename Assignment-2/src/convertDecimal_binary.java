import java.util.Scanner;
public class convertDecimal_binary {

	public static void main(String[] args) {
		int n,x,rem;
		String b="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		x=n;
		while(n>0)
		{
			rem=n%2;
			b=rem+b;
			n=n/2;
			
		}
		System.out.println("Decimal to Binary conversion of "+x+" is :"+b);
	}

}
