class SharedBuffer {
    private int buffer = -1;  // Shared buffer (empty initially)
    
    // Produce an item
    public synchronized void produce(int item) throws InterruptedException {
        while (buffer != -1) {  // If buffer is full, wait
            wait();
        }
        buffer = item;  // Store item in the buffer
        System.out.println("Produced: " + item);
        notify();  // Notify consumer that item is produced
    }
    
    // Consume an item
    public synchronized void consume() throws InterruptedException {
        while (buffer == -1) {  // If buffer is empty, wait
            wait();
        }
        System.out.println("Consumed: " + buffer);
        buffer = -1;  // Empty the buffer
        notify();  // Notify producer that buffer is empty
    }
}

// Producer thread
class Producer extends Thread {
    private SharedBuffer buffer;
    
    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }
    
    @Override
    public void run() {
        int item = 0;
        while (true) {
            try {
                buffer.produce(item++);
                Thread.sleep(1000);  // Simulate time to produce an item
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Consumer thread
class Consumer extends Thread {
    private SharedBuffer buffer;
    
    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                buffer.consume();
                Thread.sleep(1500);  // Simulate time to consume an item
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumerITC {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();
        
        // Create producer and consumer threads
        Thread producer = new Producer(buffer);
        Thread consumer = new Consumer(buffer);
        
        producer.start();
        consumer.start();
    }
}
