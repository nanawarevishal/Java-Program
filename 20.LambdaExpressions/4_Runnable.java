
class MyThread {
	
	public static void main(String[] args) {
		
		Runnable obj1 = ()->{
                System.out.println(Thread.currentThread().getName());
        };

        Runnable obj2 = new Runnable() {
            
           public void run(){
                System.out.println(Thread.currentThread().getName());
            }
        };

        Thread th1 = new Thread(obj1);
        th1.start();

        Thread th2 = new Thread(obj2);
        th2.start();
	}
}