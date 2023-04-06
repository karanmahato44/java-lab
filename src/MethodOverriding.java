class MethodOverriding {
    public static void main(String args[]) {
        Child child = new Child();
        child.calculate(10, 20, 30);
    }
}

class Parent {
    void calculate(int l, int b) {
        System.out.println("Area: " + l * b);
    }
}

class Child extends Parent {

    void calculate(int l, int b, int h) {
        System.out.println("Volume: " + l * b * h);
    }
}