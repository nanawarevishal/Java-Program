package TryCatchFinally.TryCatchBlock;


class InterruptedExcept{
    public static void main(String[] args) {
        
        for(int i=0;i<10;i++){
            System.out.println("In loop");

            try {
                
                Thread.sleep(5000);
            }catch(RuntimeException e){
                System.out.println("Runtime Exception");
            }
             catch (InterruptedException e) {
            
                System.out.println("Exception occured");
            }
        }
    }
}
