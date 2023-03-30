import java.text.DecimalFormat;
import java.util.Scanner;
public class Assignment6C {
    public static void main(String[] secret) {
        try {if (secret[0] != null) {System.out.println("[The JVM passed the following argument when executing the main method: " + secret[0] + "]");}}catch (ArrayIndexOutOfBoundsException e) {}
        Scanner sc = new Scanner(System.in);
        System.out.print("[Overloaded Surprise Function]\nWhat data type do you want to enter? ");
        String choice = sc.nextLine().toLowerCase();
        switch (choice) {
            case "integer","int" -> { //brackets on enhanced switch to limit the scope and allow me to reuse the variable names.
                System.out.print("Value #1: ");
                int x = sc.nextInt();
                System.out.print("Value #2: ");
                int y = sc.nextInt();
                System.out.println("Calling surprise_function()...\nThe result is " + surprise_function(x,y));
            }
            case "float" -> {
                DecimalFormat df = new DecimalFormat("#.#####");
                System.out.print("Value #1: ");
                float x = sc.nextFloat();
                System.out.print("Value #2: ");
                float y = sc.nextFloat();
                System.out.println("Calling surprise_function()...\nThe result is " + df.format(surprise_function(x,y)));
            }
            case "double" -> {

                System.out.print("Value #1: ");
                double x = sc.nextDouble();
                System.out.print("Value #2: ");
                double y = sc.nextDouble();
                System.out.println("Calling surprise_function()...\nThe result is " + (surprise_function(x,y)));
            }
            case "char","character" -> {
                System.out.print("Value #1: ");
                char x = sc.nextLine().charAt(0);
                System.out.print("Value #2: ");
                char y = sc.nextLine().charAt(0);
                System.out.println("Calling surprise_function()...\nThe result is " + surprise_function(x,y));
            }
            case "boolean","bool" -> {
                System.out.print("Value #1: ");
                boolean x = sc.nextBoolean();
                System.out.print("Value #2: ");
                boolean y = sc.nextBoolean();
                System.out.println("Calling surprise_function()...\nThe result is " + surprise_function(x,y));
            }
            default -> {
                System.out.println("Invalid response");
            }
        }
    }

    public static int surprise_function(int a, int b) {return a+b;}
    public static boolean surprise_function(boolean a, boolean b) {return (a&&b);}
    public static float surprise_function(float a, float b) {return a/b;}
    public static double surprise_function(double a, double b) {return a%b;}
    public static String surprise_function(char a, char b) {return a+""+b;}
}
