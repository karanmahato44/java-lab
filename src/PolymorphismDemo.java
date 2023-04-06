class PolymorphismDemo {
    public static void main(String[] args) {

        Manxe manxe = new Manxe();
        Ma ma = new Ma();
        Uni uni = new Uni();

        manxe.greet();
        ma.greet();
        uni.greet();

    }
}

class Manxe {
    public void greet() {
        System.out.println("Hello!");
    }
}

class Ma extends Manxe {
    public void greet() {
        System.out.println("Hi!");
    }
}

class Uni extends Manxe {
    public void greet() {
        System.out.println("Namaste!");
    }
}