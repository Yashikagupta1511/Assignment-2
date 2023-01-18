import java.util.Scanner;

public class Pascals {
    
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of row in your pascal triangle: "); 
        int triangleRows = scanner.nextInt();
        int spaces = triangleRows;
        int number = 1;
        
        for(int i=0; i<triangleRows; i++) {
            for(int j=0; j<spaces; j++) {
                System.out.print(" ");
            }
            
            number = 1;
            
            for(int k=0; k<=i; k++) {
                System.out.print(number + " ");
                number = number * (i-k)/(k+1);
            }
            
            spaces = spaces - 1;
            System.out.println();
        }
    }
}