package Interface;

interface parent12{
   static void fun(){
        System.out.println("In fun method");
    }
}

class child12 implements parent12{
    public static void main(String[] args) {
        parent12.fun();
    }
}