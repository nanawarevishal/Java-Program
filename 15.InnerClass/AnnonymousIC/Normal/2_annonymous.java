package AnnonymousIC.Normal;


class Demo2{

    int x =10;

    void marry(){

        System.out.println("Kriti Sanon");
    }
}


class Client2{

    public static void main(String[] args) {
        
        Demo2 obj = new Demo2(){   // Demo2 obj = new Client2$1(); // Internally
            int x =20;
            private int y =20;

            void marry(){
                System.out.println("Nupoor Sanon");
            }

            Demo2 fun(){
                System.out.println("In fun");
                return new Demo2();
            }
            
        }.fun();

        obj.marry();

        System.out.println(obj.x);
        
        
    }

}