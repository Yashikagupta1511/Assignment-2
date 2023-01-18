import java.util.Scanner;
public class IncreasingDecreasingOrder {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b&&b>c)
			System.out.println("Numbers are in decreasing order::"+a+","+b+","+c);
		else if(a<b&&b<c)
			System.out.println("Numbers are in increasing order::"+a+","+b+","+c);
		else
			System.out.println("Numbers entered are in Random Order::"+a+","+b+","+c);
	}

}
