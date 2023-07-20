class ImplementingClass implements Runnable {
    // overriding the run() method
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Run method of the implementing class.");
        }
    }
}

public class Test {
    public static void main(String args[]) {
        // creating object of the implementing class.
        ImplementingClass ic = new ImplementingClass();

        // passing the reference to the Thread class constructor.
        Thread t = new Thread(ic);

        // starting the new thread execution.
        t.start();
        for(int i=0;i<20;i++){
            System.out.println(i);
        }
    }
}