package AccessSpecifiers;

class core2web{
    int numCources = 10;
    String courceName = "Java";

    void display(){
        System.out.println(numCources);
        System.out.println(courceName);
    }
}

class Student{
    public static void main(String[] args) {
        core2web obj = new core2web();
        obj.display();
        System.out.println(obj.numCources);
        System.out.println(obj.courceName);
    }
}