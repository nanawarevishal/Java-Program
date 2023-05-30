package OneDimenArray.ClassCodeArray;

public class program10 {

    private static final String IntegerCache = null;

    public static void main(String[] args) {
        
        int x =10;
        int y=10;
        Integer z= 10;
        
        Integer obj = new Integer(10);
        Integer obj1 = new Integer(10);
        

        System.out.println(System.identityHashCode(x));  //same hashcode
        System.out.println(System.identityHashCode(y));  //Same hashcode
        System.out.println(System.identityHashCode(z));

        System.out.println(System.identityHashCode(obj));
        System.out.println(System.identityHashCode(obj1));

        
    }
}
