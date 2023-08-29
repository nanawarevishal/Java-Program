package ConcurrancyMethod;

class MyThread4 extends Thread{

    public void run(){

        for(int i=1;i<=3;i++){
            System.out.println("Thread-0"+i+" ");
        }
    }
}

class ThreadDemo4{

    public static void main(String[] args) {
        MyThread4 obj = new MyThread4();
        obj.start();
        obj.yield();

        for(int i=1;i<=3;i++){
            System.out.println("Main: "+i+" ");
        }
    }
}