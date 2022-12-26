class Q1 {
    int n;
    boolean valueset = false;

    synchronized int get() {
        while (!valueset)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        System.out.println("Got :" + n);
        valueset = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueset)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        this.n = n;
        valueset = true;
        System.out.println("put " + n);
        notify();
    }
}

class Producer1 implements Runnable {
    Q1 q;

    Producer1(Q1 q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

class Consumer1 implements Runnable {
    Q1 q;

    Consumer1(Q1 q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q.get();
        }
    }
}

class producerconsumer {
    public static void main(String args[]) {
        Q1 q = new Q1();
        new Producer1(q);
        new Consumer1(q);
        System.out.println("press ctrl+c to exit");
    }
}
