
package ThreadClass;

class ThreadDemo1{

    static void fun()throws InterruptedException{

        for(int i=10;i<20;i++){

            System.out.println(i);
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        
        for(int i=0;i<10;i++){

            System.out.println(i);
            Thread.sleep(1000);      // sleep method throws InterruptedException in java
        }

        fun();

    }
}