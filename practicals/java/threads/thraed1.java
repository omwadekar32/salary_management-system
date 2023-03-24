class thread1 extends Thread {
    thread1(String n){
        super(n);
    }
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(getName());
        }
    }
}

class Another {
    public static void main(String[] args) {
        thread1 a = new thread1("Thread1");
        thread1 b = new thread1("Thread2");
        a.setPriority(9); // max num means higher priority
        a.start();
        b.start();
    }
}