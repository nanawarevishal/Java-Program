package ThreadClass;

class Demo5 extends Thread{

    public void run(){

        System.out.println("Demo: "+Thread.currentThread().getName());

        for(int  i=0;i<10;i++){
            System.out.println(i);
        }
    }
}

class Myth extends Thread{

    public void run(){

        System.out.println("MyThread: "+Thread.currentThread().getName());

        Demo5 obj = new Demo5();
        obj.start();
    }
}

class ThreadDemo5{

    public static void main(String[] args) {
        
        System.out.println("ThreadDemo: "+Thread.currentThread().getName());

        Myth obj = new Myth();
        obj.start();

    }
}
