package Interface;


interface parent1{
    void fun();
}

interface parent2{
    void fun();
    void gun();
}

class child7 implements parent1,parent2{

    public void fun(){
        System.out.println("In Fun");
    } 

    public void gun(){
        System.out.println("In Gun");
    }
   
}

class Client7{
    public static void main(String[] args) {
        child7 obj = new child7();
        obj.fun();
        obj.gun();
    }
}
