class SharedResource {

    int item;
    boolean available = false;

    // TODO: synchronize void put(int item)
    // while(available) -> wait()
    // set this.item = item, available = true
    // print "Produced: " + item
    // notify()
    public synchronized void put(int item) {
        try {
            while (available) wait();
        } catch (Exception e) {}
        this.item = item;
        this.available = true;
        System.out.println("Produced: " + item);
        notify();
    }

    // TODO: synchronize void get()
    // while(!available) -> wait()
    // print "Consumed: " + item
    // available = false
    // notify()
    public synchronized void get() {
        try {
            while (!available) wait();
        } catch (Exception e) {}
        System.out.println("Consumed: " + item);
        this.available = false;
        notify();
    }
}

class Producer extends Thread {

    SharedResource resource;

    // TODO: Constructor to init resource
    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    // TODO: run()
    // Loop 1 to 5
    // call resource.put(i)
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) resource.put(i);
    }
}

class Consumer extends Thread {

    SharedResource resource;

    // TODO: Constructor to init resource
    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    // TODO: run()
    // Loop 1 to 5
    // call resource.get(i)
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) resource.get();
    }
}

public class ProducerConsumer {

    public static void main(String[] args) {
        // TODO: Create SharedResource object
        SharedResource sr = new SharedResource();
        // TODO: Create Producer and Consumer threads
        Producer pr = new Producer(sr);
        Consumer cr = new Consumer(sr);
        // TODO: Start both threads
        pr.start();
        cr.start();
    }
}
