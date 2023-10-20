

package AbstractClass;

class SingleTons{

    static SingleTons obj = new SingleTons();

    SingleTons(){
        System.out.println("In Constructor");
    }

    public static void main(String[] args) {
        
        // System.out.println((SingleTons.obj));

    }
}

