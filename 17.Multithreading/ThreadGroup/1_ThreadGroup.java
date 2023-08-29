package ThreadGroup;

class MyThread1 extends Thread{
    MyThread1(){

    }

    MyThread1(String str){
        super(str);
    }

    public void run(){
        System.out.println(getName());
        System.out.println(Thread.currentThread().getThreadGroup());
    }
}

class ThreadDemo1{

    public static void main(String[] args) {
        
        MyThread1 obj = new MyThread1("Core2Web");
        obj.start();

        MyThread1 obj1 = new MyThread1();
        obj1.start();

    }
}
