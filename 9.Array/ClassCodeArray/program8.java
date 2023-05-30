package ClassCodeArray;


public class program8 {
    public static void main(String[] args) {

        System.out.println("For Integer value: ");
        int arr1[] ={1,2,3,4,5};
        System.out.println(arr1);

        int arr2[] ={1,2,3,4,5};
        System.out.println(arr2);

        System.out.println(System.identityHashCode(arr1));
        System.out.println(System.identityHashCode(arr2));

        
        System.out.println("Identity hashcode of element: ");
        System.out.println(System.identityHashCode(arr1[0]));
        System.out.println(System.identityHashCode(arr2[0]));

        System.out.println();
        System.out.println("For Char array:");

        char ch[] = {'a','b','c'};
        System.out.println(ch);

        char ch1[] = {'a','b','c'};
        System.out.println(ch1);

        System.out.println("Identity Hashcode of char array: ");
        System.out.println(System.identityHashCode(ch));
        System.out.println(System.identityHashCode(ch1));

        System.out.println("Identity hashcode of the char element: ");
        System.out.println(System.identityHashCode(ch[0]));
        System.out.println(System.identityHashCode(ch1[0]));


        System.out.println();
        System.out.println("Float");

        float af1[] = {12.1f,2.3f,4.4f};
        float af2[] = {12.1f,2.3f,4.4f};

        System.out.println("Address of the element: ");
        System.out.println(af1);
        System.out.println(af2);

        System.out.println("Identity hashCode of array for Float: ");
        System.out.println(System.identityHashCode(af1));
        System.out.println(System.identityHashCode(af2));

        System.out.println("Identity hashcode of element: ");
        System.out.println(System.identityHashCode(af1[0]));
        System.out.println(System.identityHashCode(af2[0]));

        System.out.println("\n");
        System.out.println("For Boolean array: ");

        boolean flag1[] = {true,false};
        boolean flag2[] = {true,false};

        System.out.println("Address of array:  ");
        System.out.println(flag1);
        System.out.println(flag2);

        System.out.println("Identity hashcode of the boolean array: ");
        System.out.println(System.identityHashCode(flag1));
        System.out.println(System.identityHashCode(flag2));

        System.out.println("Identity hashcode of the element in array: ");
        System.out.println(System.identityHashCode(flag1[0]));
        System.out.println(System.identityHashCode(flag2[0]));


    }
}
