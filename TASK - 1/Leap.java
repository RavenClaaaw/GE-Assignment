import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        System.out.println("ENTER YEAR: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();

        // Condition:
        // If not divisible by 4 then not a leap year.
        // If divisible by 100 but not by 400 then still not a leap year.
        if(year % 4 != 0){
            System.out.println("NOT LEAP YEAR");
        } 
        
        else{
            if(year % 100 == 0 && year % 400 != 0){
                System.out.println("NOT LEAP YEAR");
            }
            else{
                System.out.println("LEAP YEAR");
            }
        }
    }
}
