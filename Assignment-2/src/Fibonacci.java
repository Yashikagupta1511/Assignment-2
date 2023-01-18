import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		int n, i, sum = 0, x1 = 0, x2 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms in fibonacci series");
		n = sc.nextInt();
		System.out.println("Fibonacci Series ::" + x1 + " " + x2 + " ");
		for(i=1;i<=n;i++) {
			sum = x1 + x2;
			System.out.println(sum+" ");
			x1 = x2;
			x2 = sum;
		}

	}

}
