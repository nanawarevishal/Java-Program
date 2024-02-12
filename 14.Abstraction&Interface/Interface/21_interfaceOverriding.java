package Interface;

// interface Parent{

//     default void fun(){
//         System.out.println("In Parent fun..!");
//     }
// }

interface Child{

    default void fun(){
        System.out.println("In child fun");
    }
}

class Demo implements Child{

    public static void main(String[] args) {
        
        Child obj = new Demo();
        obj.fun();
    }
}
