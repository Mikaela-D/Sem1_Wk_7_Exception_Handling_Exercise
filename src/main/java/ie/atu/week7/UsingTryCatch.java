package ie.atu.week7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {
        System.out.println("Please enter a number between 0 - 9 : ");
        Scanner myscan = new Scanner(System.in);
        char Y = 0;
        while (Y == 0) {
            try {
                int myNum = myscan.nextInt();
                if (myNum <= 9 && myNum > 0) {
                    System.out.println("You entered " + myNum);
                    break;
                } else {
                    System.out.println("Not a valid number");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error caught\n");
                System.out.println(e);
                System.out.println("Please enter a number between 0 - 9 : ");
                myscan.next();
            }
        }
    }
}
