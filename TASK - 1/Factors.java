import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER NUMBER: ");
        int N = scanner.nextInt();
        scanner.close();
        
        int value = N;
        for(int i=2; i*i<=N; i++){
            while(value%i==0){
                System.out.print(i + " ");
                value /= i;
            }
        }
    }
}
