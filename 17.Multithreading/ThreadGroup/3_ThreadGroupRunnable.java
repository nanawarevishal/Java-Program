
package ThreadGroup;

class MyThread3 implements Runnable{

    public void run(){
        System.out.println(Thread.currentThread());
    }
}

class ThreadDemo3 {
    public static void main(String[] args) {
        
        ThreadGroup pThreadGroup = new ThreadGroup("India");

        MyThread3 obj1 = new MyThread3();
        MyThread3 obj2 = new MyThread3();

        Thread t1 = new Thread(pThreadGroup,obj1,"Maharashtra");
        Thread t2 = new Thread(pThreadGroup,obj2,"Goa");

        t1.start();
        t2.start();

        ThreadGroup cThreadGroup = new ThreadGroup(pThreadGroup, "Pakistan"); 

        MyThread3 obj3 = new MyThread3();
        MyThread3 obj4 = new MyThread3();

        Thread t3 = new Thread(cThreadGroup,obj3,"Karachi");
        Thread t4 = new Thread(cThreadGroup,obj4,"Lahore");

        t3.start();
        t4.start();

    }
}