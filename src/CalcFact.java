import java.util.Scanner;

class CalcFact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Factorial of?: ");
        int num = scanner.nextInt();

        FactImplementation obj = new FactImplementation();
        int result = obj.CalculateFact(num);
        System.out.println(result);

        scanner.close();
    }
}

interface Fact {
    int CalculateFact(int n);
}

class FactImplementation implements Fact {
    public int CalculateFact(int n) {
        if (n >= 1)
            return n * CalculateFact(n - 1);
        else
            return 1;
    }
}