package ThreadClass;

class MyThread4 extends Thread{

    public void run(){
        System.out.println("Run");
        System.out.println(Thread.currentThread().getName());
    }

    // public void start(){
    //     System.out.println("In my thread start");
    //     System.out.println(Thread.currentThread().getName());

    // }
}

class ThreadDemo4{

    public static void main(String[] args) {
        MyThread4 obj = new MyThread4();
        obj.start();

        System.out.println(Thread.currentThread().getName());
    }
}