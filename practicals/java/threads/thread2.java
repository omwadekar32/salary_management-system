class thread2 implements Runnable{
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("Thread 1");
        }
    }
}

class thread3 implements Runnable {
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("Thread 2");
        }
    }
}

class thread4 {
    public static void main(String[] args) {
        thread2 t2 = new thread2();
        thread3 t3 = new thread3();
        Thread t1 = new Thread(t2);
        Thread t4 = new Thread(t3);
        t1.start();
        t4.start();
    }
}