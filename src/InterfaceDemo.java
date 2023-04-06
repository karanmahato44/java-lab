class InterfaceDemo {
    public static void main(String[] args) {
        MyAnotherInterface obj = new MyAnotherInterface();
        obj.name();
        obj.sound();

        MultipleInheritance multiObj = new MultipleInheritance();
        multiObj.lorem();
        multiObj.ipsum();
    }
}

interface MyInterface {
    void name();
    void sound();
}

class MyAnotherInterface implements MyInterface {
    public void name() {
        System.out.println("cat");
    }

    public void sound() {
        System.out.println("meow!");

    }
}

interface I1 {
    void lorem();
}

interface I2 {
    void ipsum();
}

class MultipleInheritance implements I1, I2 {
    public void lorem() {
        System.out.println("nice 1");
    }

    public void ipsum() {
        System.out.println("nice 2");
    }
}
