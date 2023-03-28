public class Assignment6A {
    static int[] array = new int[1000019];
    public static void main(String[] args) {
        fillArray();
        int target = getTarget();
        System.out.println("The target value is " + target);
        int linearLoops = linearSearch(array, target);
        int binaryGuesses = binarySearch(array,target);
        printResults(linearLoops, "Linear");
        printResults(binaryGuesses, "Binary");
        printResultsAssessment(linearLoops, "Linear", binaryGuesses, "Binary");
    }
    private static void printResultsAssessment(int resultA, String typeA, int resultB, String typeB) {
        if(resultB > resultA){ System.out.println(typeA + " Search is faster this time!"); }
        else if(resultB < resultA) { System.out.println(typeB + " Search is faster this time!"); }
        else { System.out.println("They were equally as fast this time!"); }
    }

    private static void printResults(int result, String type) {
        if(!(result < 0)) {
            System.out.println(type + " Search: " + result + " loop(s)");
        } else {System.out.println("Value not found");}
    }

    static int binarySearch(int[] x, int y) {
        if(isSorted(x)) {
            int iterations = 1;
            int low = 0;
            int mid;
            int high = x.length - 1;
            while(high >= low) {
            mid = (high + low) / 2;
            if(y == x[mid]) { return iterations;}
            else if (y < x[mid]) {high = mid - 1;}
            else {high = mid +1;}
            iterations++;
            }
            return iterations;
        } else {System.out.println("Error: Attempted to binary search an unsorted array.");}
        return -1;
    }
    static boolean isSorted(int[] x) {
        boolean inAscendingdOrder = true;
        for (int i = 0; i < x.length - 1; i++) {
            if (!(x[i] <= x[i + 1])) {
                inAscendingdOrder = false;
                break;
            }
        }
        for (int i = 0; i < x.length - 1; i++) {
                if (!(x[i] >= x[i + 1])) {
                    if (inAscendingdOrder == false) {
                        return false;
                    }
                }
        }
        return true;
    }

     static int linearSearch(int[] x, int y) {
        int iterations = 1;
        for (int i = x.length - 1; i >= 0; i--) {
            if (x[i] == y) {
                return iterations;
            }
            else {
                iterations++;
            }
        }
        return -1;
    }

    static int getTarget() {
        double x = Math.random()*(array.length - 1);
        return (int) x;
    }
    static void fillArray() {
        int fillNumber = 1000018;
        for (int i = 0; i < array.length; i++) {
          array[i] = fillNumber--;
        }
    }
}