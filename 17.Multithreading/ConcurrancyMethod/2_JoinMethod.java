
/*
 *  Ex. 
 *      First Match Schedule
 *      then Match Ticket
 * 
 */

package ConcurrancyMethod;

class MyThread2 extends Thread{

    static Thread nmMain = null;

    public void run(){
        // try {
            
        //     // nmMain.join();
        // } catch (InterruptedException e) {
           
        // }

        for(int i=0;i<=3;i++){
            System.out.println("In Thread-0 ");
        }
    }
}

class ThreadDemo2{

    public static void main(String[] args) throws InterruptedException{

        MyThread2.nmMain = Thread.currentThread();
        MyThread2 obj = new MyThread2();
        obj.start();
        obj.join();
        System.out.println(Thread.currentThread().getState());
        for(int i=0;i<=3;i++){
            System.out.println("In Main");
        }
    }
}


/*
 * Explanation Deadlock
 */
