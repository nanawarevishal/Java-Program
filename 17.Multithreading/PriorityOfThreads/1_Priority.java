package PriorityOfThreads;

class MyThread1 extends Thread{

    public void run(){

        Thread  th = Thread.currentThread();
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(th.getPriority());
        System.out.println(th); // thread group,thread priority , thread name

    }
}

class ThreadDemo1{

    public static void main(String[] args) {
        
        Thread  th = Thread.currentThread();
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(th.getPriority());

        th.setPriority(11); // illeagle aurgument exception

        MyThread1 obj = new MyThread1();
        obj.start();
        obj.start(); // illegal thread state exception
        
    }
}