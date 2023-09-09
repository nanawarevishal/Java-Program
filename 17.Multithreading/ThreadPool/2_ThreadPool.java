package ThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


class MyThread2 implements Runnable{

    int num;

    MyThread2(int num){
        this.num = num;
    }

    public void run(){
        System.out.println(Thread.currentThread()+" start Thread - "+num);
        dailyTask();
        System.out.println(Thread.currentThread()+" End Thread - "+num);

    }

    void dailyTask(){

        try{

            Thread.sleep(40000);
        }
        catch(InterruptedException ie){

        }
    }
}

class ThreadPoolDemo2{

    public static void main(String[] args) {
        
        ThreadPoolExecutor tpe1 = (ThreadPoolExecutor)Executors.newFixedThreadPool(2);
        ThreadPoolExecutor tpe2 = (ThreadPoolExecutor)Executors.newFixedThreadPool(2);

        for(int i=1;i<=4;i++){
            MyThread2 obj = new MyThread2(i);
            tpe1.execute(obj);
        }

        for(int i=1;i<=4;i++){
            MyThread2 obj = new MyThread2(i);
            tpe2.execute(obj);
        }

        tpe1.shutdown();
        tpe2.shutdown();
    }
}
