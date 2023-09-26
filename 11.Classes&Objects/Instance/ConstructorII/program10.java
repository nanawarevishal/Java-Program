package Instance.ConstructorII;

class DemoCosnt{

    int x = 10;
    String name = "Sachin";

    DemoCosnt(int x,String name){
        
        x = x;
        name = name;

        System.out.println(x);
        System.out.println(name);
    }

    void printData(){
        System.out.println(x);
        System.out.println(name);
    }

    public static void main(String[] args) {
        
        DemoCosnt obj = new DemoCosnt(18, "virat");

        obj.printData();

    }
}

