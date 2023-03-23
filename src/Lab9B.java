import java.util.Arrays;
import java.util.Scanner;

public class Lab9B {
    static int[] inputArray = new int[11];

    public static void main(String[] args) {
        getValuesFromUser();
        bubbleSortArray();
        System.out.println(searchArrayForANumber());
    }

    private static void printArray() {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
    }

    private static String searchArrayForANumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the target number: ");
        int target = sc.nextInt();
        System.out.println();
        System.out.print("The sorted set is: ");
        printArray();
        System.out.println("\n");
        int low = 0;
        int high = inputArray.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            System.out.println("Low is " + low + "\n");
            System.out.println("Mid is " + mid + "\n");
            System.out.println("High is " + high + "\n");
            System.out.println("Searching\n");
            if (target < inputArray[mid])
            {
                high = mid - 1;
            }
            else if (target == inputArray[mid]) {
                return "The target is in the set.";
            }
            else
            {
                low = mid + 1;
            }
        }
        return "The target is not in the set.";
    }

    private static void bubbleSortArray() {
        for (int j = 0; j < inputArray.length; j++) {
            for (int i = 0; i < inputArray.length - j; i++) {
                if (i == inputArray.length - 1) {
                    continue;
                }
                if (inputArray[i] > inputArray[i + 1]) {
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = temp;
                }
            }
        }
    }

    private static void getValuesFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 11 numbers: ");
        for (int i = 0; i < 11; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            inputArray[i] = sc.nextInt();
        }
        System.out.println();
    }
}
