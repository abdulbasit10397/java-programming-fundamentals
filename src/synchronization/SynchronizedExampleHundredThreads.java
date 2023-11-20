package synchronization;

class SBTable1 {
    void printTable(int n) {
        //Synchronized block below
        synchronized (this) {
            System.out.println("Table of " + n + ": ");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n * i);
            }//end of For Loop
        }//end of synchronized block
    }
}

class SBThread implements Runnable {
    SBTable1 table;

    public SBThread(SBTable1 table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(5);
    }
}


public class SynchronizedExampleHundredThreads {
    public static void main(String[] args) throws InterruptedException {
        SBTable1 t = new SBTable1();
        SBTable1[] hundredTables = new SBTable1[100];
        SBThread[] hundredThreads = new SBThread[100];
        Thread[] hundredTs = new Thread[100];


        for (int i = 0; i < 100; i++) {
            hundredTables[i] = new SBTable1();
            hundredThreads[i] = new SBThread(hundredTables[i]);
            hundredTs[i] = new Thread(hundredThreads[i]);
        }

        SynchronizedExampleHundredThreads obj = new SynchronizedExampleHundredThreads();
        obj.executeHundredTimes(hundredTs);

    }

    public void executeHundredTimes(Thread[] hundredTs) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            System.out.println("Iteration No: " + i);
            hundredTs[i].start();
           // hundredTs[i].join(0);
        }
    }
}
