class Threads extends Thread {
    public static void main(String[] args) {
        Threads thread = new Threads();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}

class ThreadRunnable implements Runnable {
    public static void main(String[] args) {
        ThreadRunnable obj = new ThreadRunnable();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}

class Main extends Thread {
    private static int amount = 0;

    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run() {
        amount++;
        System.out.println("Thread: " + amount);
    }
}

class Alive extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        // Wait for the thread to finish
        while(thread.isAlive()) {
            System.out.println("Waiting...");
        }
        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }
    public void run() {
        amount++;
        amount++;
        amount++;

        System.out.println("Thread: " + amount);
    }
}