import java.lang.Math;
import java.util.Scanner;

class ExpHandlingDemo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 44 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("\nFinally block.");
        }

        Exceptions obj = new Exceptions();
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nSquare root of? : ");
        double input = scanner.nextDouble();
        obj.root(input);

        System.out.print("\nm is? : ");
        double m = scanner.nextDouble();
        System.out.print("\nn is? : ");
        double n = scanner.nextDouble();

        Throws throwObj = new Throws();
        try {
            throwObj.div(m, n);
        } catch (ArithmeticException e) {
            System.out.println(e.toString()); // x / 0 - will give infinity for double > https://stackoverflow.com/questions/18542536/why-is-number-divided-by-zero-infinity-in-java
        }
        scanner.close();
    }
}

class Exceptions {
    void root(double num) {
        if (num < 0)
            throw new ArithmeticException("\nNegative number.");
        else
            System.out.println("Square root of " + num + " is: " + Math.sqrt(num));
    }
}

class Throws {
    void div(double m, double n) throws ArithmeticException {
        System.out.println("\n" + m + " / " + n + " is " + m / n);
    }
}