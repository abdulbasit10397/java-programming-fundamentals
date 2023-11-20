package synchronization;

import java.rmi.UnknownHostException;

class MyThread1 extends Thread {
    int k;
    public MyThread1(int i) {
        k = i;
    }

    @Override
    public void run() {
        //Your Code
        System.out.println("Thread no. "+k);
        System.out.println("Thread no. +" + k + "is running");
        System.out.println("Thread no. +" + k + "is running");
        System.out.println("Thread no. +" + k + "is running");
        System.out.println("Thread no. +" + k + "is finished\n");

    }
}
class MainClass {

    public static void main(String arg[]) throws UnknownHostException {
        Refresh() ;
    }

    public static void Refresh(){

        //create 255 Thread using for loop
        for (int x = 0; x < 256; x++) {
            // Create Thread class
            MyThread1 temp = new MyThread1(x);
            temp.start();
            try {
                temp.join(100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
