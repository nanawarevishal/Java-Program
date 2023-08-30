package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class MyThread implements Runnable{

    int num;

    MyThread(int num){
        this.num = num;
    }

    public void run(){
        System.out.println(Thread.currentThread()+" start Thread - "+num);
        dailyTask();
        System.out.println(Thread.currentThread()+" End Thread - "+num);

    }

    void dailyTask(){

        try{

            Thread.sleep(8000);
        }
        catch(InterruptedException ie){

        }
    }
}

class ThreadPoolDemo{

    public static void main(String[] args) {
        
        ExecutorService ser = Executors.newFixedThreadPool(5);
        ExecutorService ser1 = Executors.newCachedThreadPool();

        for(int i=1;i<10;i++){
            MyThread obj = new MyThread(i);
            ser1.execute(obj);
        }

        ser1.shutdown();
    }
}
