package Constructor;

class c2wdemo1{
    int numCorces = 10;
    String courceName = "CPP";

    void disp(){
        System.out.println(numCorces);
        System.out.println(courceName);
    }
}

class student{
    public static void main(String[] args) {
        c2wdemo1 obj= new c2wdemo1();
        obj.disp();

        System.out.println(obj.numCorces);
        System.out.println(obj.courceName);
    }
}
