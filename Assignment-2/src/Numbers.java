import java.util.Scanner;
public class Numbers {

	public static void main(String[] args)
	
	{
		
    int i,j,n;
    System.out.println("Input number of rows : ");
  Scanner in = new Scanner(System.in);
             n = in.nextInt();
    
    for(i=1;i<=n;i++)
    {
    for(j=1;j<=i;j++)
    	System.out.println(j);
    	
    System.out.println("");
    }
    	
	}

}
