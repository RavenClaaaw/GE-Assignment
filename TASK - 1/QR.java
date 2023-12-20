import java.util.Scanner;

public class QR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER A: ");
        int A = scanner.nextInt();
        System.out.println("ENTER B: ");
        int B = scanner.nextInt();
        scanner.close();

        if(B != 0){
            System.out.println("QUOTIENT: " + (A/B));
            System.out.println("REMAINDER: " + (A%B));
        }
    }
}
