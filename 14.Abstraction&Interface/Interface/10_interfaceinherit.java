package Interface;

interface parent1{
    void m1();
}

interface parent2{
    void m2();
}

interface parent3 extends parent2,parent1{
    void m3();
}

class child10 implements parent3{

    public void m1(){
        System.out.println("In m1");
    }

    public void m2(){
        System.out.println("In m2");
    }

    public void m3(){
        System.out.println("In m3");
    }
}

class client10{
    public static void main(String[] args) {
        child10 obj = new child10();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
