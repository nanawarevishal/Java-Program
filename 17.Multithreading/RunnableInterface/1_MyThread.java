package RunnableInterface;

class MyThread1 implements Runnable{

    public void run(){
        System.out.println("In Run");
        System.out.println(Thread.currentThread().getName());
    }
}

class ThreadDemo{

    public static void main(String[] args) {
        
        Runnable obj = new MyThread1();
        
        Thread th = new Thread(obj);
        th.start();
    }
}