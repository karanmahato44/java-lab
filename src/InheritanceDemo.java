class InheritanceDemo {
    public static void main(String[] args) {
        AnotherCat kitty = new AnotherCat();
        kitty.action();
        kitty.meow();
        kitty.meowBack();

        Dog myDog = new Dog();
        myDog.bark();

    }
}

class Animal {
    void action() {
        System.out.println("Playing!");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("meow!");
    }
}

// multilevel
class AnotherCat extends Cat {
    void meowBack() {
        System.out.println("meow back!");
    }
}

// hierarchical
class Dog extends Animal {
    void bark() {
        System.out.println("bark!");
    }
}

// multi not supported
/*
class A {
    void greet() {
        System.out.println("hi!");
    }
}

class B {
    void greet() {
        System.out.println("hi! again");
    }
}

class C extends A,B {
    public static void main(String args[]) {
        C obj = new C();
        obj.greet(); // which one to call?
    }
}
*/
