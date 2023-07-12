package StringBuffer;

public class program1 {
    public static void main(String[] args) {
        String str1 = "Shashi";
        String str2 = str1.concat(str1);

        System.out.println(str1);
        System.out.println(System.identityHashCode(str1));

        System.out.println(str2);
        System.out.println(System.identityHashCode(str2));


        StringBuffer str = new StringBuffer("Shahs");
        System.out.println(System.identityHashCode(str));

        str = str.append(str1);
        System.out.println(System.identityHashCode(str));
        
        StringBuffer str5 = new StringBuffer("Shashi");
        System.out.println(str5.capacity());

    }
}
