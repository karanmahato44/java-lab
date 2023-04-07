class ThreadSyncMulTable {
    public static void main(String[] args) {
        Table table = new Table();
        Thread1 t1 = new Thread1(table);
        Thread2 t2 = new Thread2(table);
        t1.start();
        t2.start();
    }
}

class Table {
    public synchronized void printTable(int n) {
        for(int i=1; i<=10; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n");
    }
}

class Thread1 extends Thread {
    Table t;
    Thread1(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(2);
    }
}

class Thread2 extends Thread {
    Table t;
    Thread2(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(10);
    }
}