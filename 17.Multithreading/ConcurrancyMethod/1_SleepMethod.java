package ConcurrancyMethod;

class MyThread1 extends Thread{

    public void run(){
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread());
    }
}

class ThreadDemo1{
    public static void main(String[] args)throws InterruptedException {
        
        MyThread1 obj = new MyThread1();
        System.out.println(Thread.currentThread());

        obj.start();
        Thread.sleep(1000);
        Thread.currentThread().setName("Core2Web");
        System.out.println(Thread.currentThread());

    }
}
