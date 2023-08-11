package AnnonymousIC.Normal;

class Demo{


}

class client{

    public static void main(String[] args) {
        Demo obj  = new Demo(){

            void m1(){
                System.out.println("In Inner m1");
            }
        }; 

    }
}
