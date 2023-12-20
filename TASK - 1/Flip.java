import java.util.Random;
import java.util.Scanner;

public class Flip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER N: ");
        int flips = scanner.nextInt();
        scanner.close();
        
        int counthead = 0;
        int counttail = 0;
        
        Random random = new Random();
        for(int i=0; i<flips; i++){
            double value = random.nextDouble(1);
        
            // HEAD OR TAILS:
            if(value >= 0.5){
                counthead += 1;
            }
            else{
                counttail += 1;
            }
        }

        System.out.println("HEAD: " + counthead + "\nTAIL: " + counttail);

    }
}
