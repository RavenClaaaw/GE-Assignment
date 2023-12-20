import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER A: ");
        int A = scanner.nextInt();
        System.out.println("ENTER B: ");
        int B = scanner.nextInt();
        scanner.close();
        
        A = A + B;
        B = A - B;
        A = A - B;

        System.out.println("A: " + A + "\nB: " + B );
    }    
}
