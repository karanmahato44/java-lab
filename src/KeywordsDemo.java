// fix the mess later(never)
class KeywordsDemo {
    static String message = "Have a nice day! #static variable"; // static in variable, single copy of the variable is created and shared among all objects at the class level
    final int maxSpeed = 100;   // final in variable
    String name;

    public KeywordsDemo(String name) {
        this.name = name;   // this in constructor and variable
    }

    static void staticMethod() {
        System.out.println("Hello from static method.");    // static in method
    }

    public static void main(String[] args) {
        KeywordsDemo obj = new KeywordsDemo("kyto");
        Lorem keywordsObj = new Lorem();

        System.out.println(message);
        staticMethod();
        keywordsObj.FromThis();
        System.out.println("Hello, " + obj.name + "." + " #this keyword in constructor");

        Ipsum i = new Ipsum();
        i.superKeyword();
        i.colorPrinter();
    }
}




class Lorem {

    Lorem() {
        System.out.println("Super keyword in constructor.");
    }
    String color1 = "Red from base class.";
    void greet() {
        System.out.println("Hello from this keyword in method.");
    }

    void FromThis() {
        this.greet();   // this in method
    }

    final void whoWasInParis() {    // final in method, can't override
        System.out.println("ye");
    }

}

class Ipsum extends Lorem {

    Ipsum() {
        super();    // super in constructor
    }

    String color2 = "Blue from inherited class.";

    void colorPrinter() {
        System.out.println(super.color1);   // super in variable
        System.out.println(color2);
    }
    void superKeyword() {
        super.whoWasInParis();  // super in method
    }
    // void whoWasInParis() {
    //     System.out.println("ye");
    // }
}




final class Foo {    // final in class
    void Sound() {
        System.out.println("foo");
    }
}

// class Bar extends Foo {
//     void Says() {
//         System.out.println("Cat says meow!");
//     }
// }