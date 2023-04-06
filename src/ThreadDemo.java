class ThreadDemo extends Thread {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        t1.start();
    }

    public void run() {
        System.out.println("Threading via Thread class extension.");
    }
}

/* 

class Foo implements Runnable {
    public static void main(String[] args) {
        Foo obj = new Foo();
        Thread t2 = new Thread(obj);
        t2.start();
    }

    public void run() {
        System.out.println("Threading via Runnable Interface implementation.");
    }
}

*/