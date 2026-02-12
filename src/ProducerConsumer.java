class SharedResource {
    int item;
    boolean available = false;

    // TODO: synchronize void put(int item)
    // while(available) -> wait()
    // set this.item = item, available = true
    // print "Produced: " + item
    // notify()

    // TODO: synchronize void get()
    // while(!available) -> wait()
    // print "Consumed: " + item
    // available = false
    // notify()
}

class Producer extends Thread {
    SharedResource resource;
    // TODO: Constructor to init resource
    
    // TODO: run()
    // Loop 1 to 5
    // call resource.put(i)
}

class Consumer extends Thread {
    SharedResource resource;
    // TODO: Constructor to init resource
    
    // TODO: run()
    // Loop 1 to 5
    // call resource.get()
}

public class ProducerConsumer {
    public static void main(String[] args) {
        // TODO: Create SharedResource object
        // TODO: Create Producer and Consumer threads
        // TODO: Start both threads
    }
}
