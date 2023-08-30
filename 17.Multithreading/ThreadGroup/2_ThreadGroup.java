package ThreadGroup;

class MyThread2 extends Thread{

    MyThread2(ThreadGroup tg,String str){
        super(tg,str);
    }

    public void run(){
        System.out.println(Thread.currentThread());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
    }
}

class ThreadDemo2{

    public static void main(String[] args) {
        ThreadGroup pThreadGroup = new ThreadGroup("Core2Web");

        MyThread2 obj1 = new MyThread2(pThreadGroup,"C");
        MyThread2 obj2 = new MyThread2(pThreadGroup,"Java");
        MyThread2 obj3 = new MyThread2(pThreadGroup,"Flutter");

        obj1.start();
        obj2.start();
        obj3.start();


        ThreadGroup cThreadGroup = new ThreadGroup(pThreadGroup, "Incubator");

        MyThread2 obj4 = new MyThread2(cThreadGroup,"React JS");
        MyThread2 obj5 = new MyThread2(cThreadGroup,"View JS");
        MyThread2 obj6 = new MyThread2(cThreadGroup,"Flutter");

        obj4.start();
        obj5.start();
        obj6.start();

        cThreadGroup.interrupt();

        // System.out.println(cThreadGroup.activeCount());
        // System.out.println(cThreadGroup.activeGroupCount());

        System.out.println(pThreadGroup.activeCount());
        System.out.println(pThreadGroup.activeGroupCount());


    }
}
