import java.util.Arrays;
import java.util.Scanner;
public class Lab9A {
    public static int[] inputArray = new int[10];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        getValuesFromUser();
        searchArrayForANumber();
    }

    private static void searchArrayForANumber() {
        System.out.print("What is the target number: ");
        int target = sc.nextInt();
        System.out.println();
        boolean found = false;
        for (int i = 0; i < inputArray.length; i++) {
            if (target == inputArray[i]) {
                System.out.println("The target is in the set.");
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("The target is not in the set.");
        }
    }

    private static void getValuesFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            inputArray[i] = sc.nextInt();
        }
        System.out.println();
    }
}