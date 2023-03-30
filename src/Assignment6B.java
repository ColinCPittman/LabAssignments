public class Assignment6B {
    public static void main(String[] args) {
        int[] array = new int[17];
        int counter = 0;
        fillArrayRandom(array);
        do {
            System.out.println("Printing array...");
            print(array);
            if((check_if_sorted(array))) {
                break;
            }
            System.out.println("Not sorted yet!\n\nShuffling array...\n");
            shuffleArray(array);
            counter++;
        } while (true);
        printResults(counter);
    }

    private static void printResults(int counter) {
        if (counter > 0) {
            System.out.println("Hooray, it’s sorted! And it only took " + counter + " attempts!");
        } else {
            System.out.println("The array was... already sorted? Wow, lucky you!");
        }
    }

    static void print(int[] x) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x.length; i++) {
            if (i != x.length - 1) {
                sb.append(x[i] + ", ");
            } else {
                sb.append(x[i]);
            }
        }
        System.out.println(sb.toString());
        //return sb.toString(); I originally wrote it return to return string, hence the inexplicable StringBuilder approach.
    }

    static void shuffleArray(int[] x) {
        int temp;
        int pointerRand;
        for (int i = 0; i < x.length; i++) {
            pointerRand = (int) (Math.random() * x.length);
            temp = x[i];
            x[i] = x[pointerRand];
            x[pointerRand] = temp;
        }
    }

    static boolean check_if_sorted(int[] x) { // I am deeply bothered about having to have snake case and camel case methods in the same program -.-
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

    static void fillArrayRandom(int[] x) {
        ;
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * 360.0);
        }
    }
}
