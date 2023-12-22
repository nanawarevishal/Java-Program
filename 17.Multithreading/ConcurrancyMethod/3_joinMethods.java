
package ConcurrancyMethod;

class MyThread extends Thread{

    public void run(){
        
        // try{
        //     // new Thread().join();
        // }
        // catch(InterruptedException ie){

        // }

        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}

class ThreadDemo{
    public static void main(String[] args)throws InterruptedException {
        
        MyThread obj = new MyThread();
        obj.start();
        obj.join();
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}