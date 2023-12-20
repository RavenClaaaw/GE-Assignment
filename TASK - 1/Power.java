import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER N: ");
        int n = scanner.nextInt();
        scanner.close();

        int value = 1;
        for(int i=0; i<n; i++){
            System.out.println("2^" + i + " - " + value);
            value *= 2;
        }
    }
}
