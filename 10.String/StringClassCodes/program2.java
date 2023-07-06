package StringClassCodes;

public class program2 {
    public static void main(String[] args) {
        String str1 = "Core2Web";                           // String Constant Pool
        String str2 = new String("Core2Web");      // Heap
        char ch[]={'C','2','W'};                            // Heap 
        String str3 = new String(ch);

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));


        String str4 = "Core2Web";
        String str5 = new String("Core2Web");

        //Identity HashCode


        
        System.out.println(System.identityHashCode(str4));
        System.out.println(System.identityHashCode(str5));
        System.out.println(System.identityHashCode(ch));

    }
}
