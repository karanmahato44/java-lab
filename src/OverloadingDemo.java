class OverloadingDemo {
    String name;
    int dob;
    int number1;
    int number2;

    public OverloadingDemo(String name, int dob) {
        this.name = name;
        this.dob = dob;
    }

    public OverloadingDemo(int num1, int num2) {
        number1 = num1;
        number2 = num2;
    }

    static void area(int length, int breadth) {
        System.out.println("Area of the rectangle is: " + length * breadth);
    }

    static void area(double radius) {
        System.out.println("Area of the circle is: " + 3.1415 * radius * radius);
    }

    public static void main(String[] args) {
        OverloadingDemo obj1 = new OverloadingDemo("kyto", 2000);
        OverloadingDemo obj2 = new OverloadingDemo(6, 9);

        System.out.println(obj1.name + " was born in " + obj1.dob + ".");
        System.out.println("First number is " + obj2.number1 + " & second number is " + obj2.number2 + ".");

        area(10, 20);
        area(7);
    }
}