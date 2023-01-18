import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		int n,c = 0, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbers::");
        n=sc.nextInt();
        for(i=2;i<=(int)(Math.sqrt(n));i++)
        {
	       if (n%i == 0)
		   c++;
        }
        if(c==0)
        	System.out.println("Number is A Prime Number");
        else
        	System.out.println("Number is Non-Prime");
	}

}
