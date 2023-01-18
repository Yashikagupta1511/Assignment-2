import java.util.Scanner;
public class SumOddNumber {

	public static void main(String[] args) {
		int n,sum_odd=0,sum_Even=0,x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
        n=sc.nextInt();
        
        while(n>0)
        {
        	x=n%10;
        	if(x%2==0)
        		sum_Even=sum_Even+x;
        	else
        		sum_odd=sum_odd+x;
        	n=n/10;
        }
        System.out.println("Sum of even Digits of number::"+sum_Even);
        System.out.println("Sum of odd Digits of number::"+sum_odd);
	}

}
