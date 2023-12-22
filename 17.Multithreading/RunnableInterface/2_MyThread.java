package RunnableInterface;

class MyThread2 implements Runnable{

    public void run(){
        System.out.println("In Run Method");
    }
}

class Client {
    public static void main(String[] args) {
        
        Runnable obj = new MyThread2();

        Thread th = new Thread(obj);
        th.start();

    }
}