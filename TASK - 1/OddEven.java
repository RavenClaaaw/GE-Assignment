import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER NUMBER: ");
        int N = scanner.nextInt();
        scanner.close();

        if(N % 2 == 0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }    
}
