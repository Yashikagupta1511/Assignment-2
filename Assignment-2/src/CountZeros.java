import java.util.Scanner;
public class CountZeros {

	public static void main(String[] args) {
		int n,i,c_pos=0,c_neg=0,c_zero=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers till user wants to enter");
		int ch=sc.nextInt();
		for(i=1;i<=ch;i++)
		{
			n=sc.nextInt();
			if(n>0)
				c_pos++;
			else if(n<0)
				c_neg++;
			else if(n==0)
				c_zero++;
		}
		System.out.println("Positive numbers entered::"+c_pos);
		System.out.println("Negative numbers entered::"+c_neg);
		System.out.println("Zeros entered::"+c_zero);
	}

}
