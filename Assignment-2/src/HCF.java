import java.util.Scanner;
public class HCF {

	public static void main(String[] args) {
		int n1,n2,i,hcf=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 number s::");
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		for(i=1;i<Math.min(n1,n2);i++)
		{
			if((n1%i)==0&&(n2%i)==0)
				hcf=i;
			
		}
        System.out.println("HCF of"+n1+" & "+n2+" is::"+hcf);
	}

}
