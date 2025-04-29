// Thread to generate Fibonacci numbers
class FibonacciThread extends Thread {
    @Override
    public void run() {
        int limit = 10;  // Number of Fibonacci numbers to print
        int a = 0, b = 1;
        System.out.println("Fibonacci numbers:");
        for (int i = 1; i <= limit; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();  // Newline after Fibonacci numbers
    }
}

// Thread to display even numbers in a given range
class EvenNumbersThread extends Thread {
    @Override
    public void run() {
        int start = 1, end = 20;  // Range of numbers
        System.out.println("Even numbers in range:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();  // Newline after even numbers
    }
}

// Main class to execute threads
public class ThreadExample {
    public static void main(String[] args) {
        // Create thread objects
        FibonacciThread fibonacciThread = new FibonacciThread();
        EvenNumbersThread evenNumbersThread = new EvenNumbersThread();

        try {
            // Start Fibonacci thread
            fibonacciThread.start();
            // Wait for Fibonacci thread to finish
            fibonacciThread.join();

            // Start Even Numbers thread after Fibonacci thread finishes
            evenNumbersThread.start();
            // Wait for Even Numbers thread to finish
            evenNumbersThread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
