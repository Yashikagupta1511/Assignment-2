import java.util.Scanner;
public class Pallindrome {

	public static void main(String[] args) {
		String Wd,rev="";
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word:");
        Wd=sc.next();
        for(i=Wd.length()-1;i>=0;i--)
        	rev=rev+Wd.charAt(i);
        if(rev.equals(Wd)==true)
        	System.out.println("Yes,Word Is Pallindrome");
        else
        	System.out.println("No,Word Is Not Pallindrome");
	}

}
