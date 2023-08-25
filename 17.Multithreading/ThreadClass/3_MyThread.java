package ThreadClass;

class MyThread3 extends Thread{

   public void run(){

        for(int i=0;i<3;i++){

            System.out.println("In Run");
            try {

                Thread.sleep(1000);

            } catch (InterruptedException e) {
                
            }
        }

        System.out.println("Child Thread: "+Thread.currentThread().getName());
   }
}

class ThreadDemo3{

    public static void main(String []args)throws InterruptedException{

        MyThread3 obj = new MyThread3();
        obj.start();

        for(int i=0;i<3;i++){

            System.out.println("In Main");
            Thread.sleep(1000);
        }

        System.out.println("Main thread: "+Thread.currentThread().getName());
    }
}