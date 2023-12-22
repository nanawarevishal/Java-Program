package ThreadClass;


class MyThread extends Thread{

   public void run(){ //throws InterruptedException{

        for(int i=0;i<10;i++){

            System.out.println("In Run");
            // Thread.sleep(1000);
        }
   }
}

class ThreadDemo{

    public static void main(String []args)throws InterruptedException{

        MyThread obj = new MyThread();

        obj.start();

        for(int i=0;i<10;i++){

            System.out.println("In Main");
            Thread.sleep(1000);
        }
    }
}


/*
 Output:
            .\2_MyThread.java:6: error: run() in MyThread cannot implement run() in Runnable
            public void run()throws InterruptedException{       
                        ^
            overridden method does not throw InterruptedException
            1 error

 */
