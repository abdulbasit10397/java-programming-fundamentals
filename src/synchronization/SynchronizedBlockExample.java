package synchronization;

class SBTable {
    void printTable(int n) {
        //Synchronized block below
        synchronized (this) {
            System.out.println("Table of " + n + ": ");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n * i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }//end of For Loop
        }//end of synchronized block
    }
}

class SBThreadOne implements Runnable {
    SBTable table;

    public SBThreadOne(SBTable table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(5);

    }
}

class SBThreadTwo implements Runnable {
    SBTable table;

    public SBThreadTwo(SBTable table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(10);

    }
}

public class SynchronizedBlockExample {
    public static void main(String[] args) {

        SBTable t = new SBTable();

        SBThreadOne m1 = new SBThreadOne(t);
        SBThreadTwo m2 = new SBThreadTwo(t);

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);

        //As both t1 and t2 here are using the same resource i.e. "printTable()" method
        //The printed table will be in haphazard manner (no sequence)
        //To avoid this inconsistency, we have to use "synchronized" keyword
        //before the resource used by multiple threads
        t1.start();
        t2.start();


    }

}
