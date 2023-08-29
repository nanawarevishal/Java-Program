package ConcurrancyMethod;

class MyThread3 extends Thread{

    // static Thread nmMain = null;

    public void run(){


        for(int i=0;i<=3;i++){
            System.out.println("In Thread-0 ");
        }
    }
}

class ThreadDemo3{

    public static void main(String[] args) throws InterruptedException{

        // MyThread2.nmMain = Thread.currentThread();
        MyThread3 obj = new MyThread3();
        obj.start();
        obj.join(1000);
        // System.out.println(Thread.currentThread().getState());
        for(int i=0;i<=3;i++){
            System.out.println("In Main");
        }
    }
}
