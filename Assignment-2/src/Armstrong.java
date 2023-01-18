import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		int n,i,x,sum,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the final limit of 'n'");
		n=sc.nextInt();
		System.out.println("Armstrong number from 1 to 'n' are::");
        for(i=1;i<=n;i++)
        {
        	x=i;
        	sum=0;
        	while (x>0)
        	{
        		rem=x%10;
        		sum=sum+(rem*rem*rem);
        		x=x/10;
        	}
        	if(sum==i)
        		System.out.println(i+",");
        }
	}

}
