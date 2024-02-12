package Interface;

interface parent20{

    int x =10;
    default void fun(){

       System.out.println("Fun parent");
    }
}


interface p{
    int x =20;

    default void fun(){
        System.out.println("Fun child");
   }
}


class child20 implements p{

    int x =30;
    // public void fun(){
    //     System.out.println(x);
    //     System.out.println(p.x);
    //     System.out.println(parent20.x);
    // }

    public static void main(String[] args) {
      
    }
}


// class Client20{
//     public static void main(String[] args) {
//         p obj = new child20();
//         obj.fun();
//     }
// }
