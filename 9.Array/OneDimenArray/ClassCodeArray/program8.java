package OneDimenArray.ClassCodeArray;


public class program8 {
    public static void main(String[] args) {

        System.out.println("For Integer value: ");
        int arr1[] ={1,2,3,4,5,200};
        System.out.println(arr1);

        int arr2[] ={1,2,3,4,5,200};
        System.out.println(arr2);

        System.out.println(System.identityHashCode(arr1));
        System.out.println(System.identityHashCode(arr2));

        System.out.println("Identity hashcode of element: ");
        System.out.println(System.identityHashCode(arr1[0]));
        System.out.println(System.identityHashCode(arr2[0]));

        System.out.println("Identity hashcode for Integer element grater than 127");
        System.out.println(System.identityHashCode(arr1[5]));
        System.out.println(System.identityHashCode(arr2[5]));

        System.out.println("\n");
        System.out.println("For Char array:");

        char ch[] = {'a','b','c'};
        char ch1[] = {'a','b','c'};

        System.out.println("The address of the array: ");
        System.out.println(ch);
        System.out.println(ch1);  // It is the String

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

        System.out.println("\n");

        System.out.println("For String array: ");
        String str1[] = {"abc","xyz"};
        String str2[] = {"abc","xyz"};

        System.out.println("Address of the array: ");
        System.out.println(str1);
        System.out.println(str2);

        System.out.println("Identity HashCode of the of the array: ");
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        System.out.println("Identity hashcode of the array element: ");
        System.out.println(System.identityHashCode(str1[0]));
        System.out.println(System.identityHashCode(str2[0]));

        System.out.println("\n");
        System.out.println("For double data type: ");
        double dba1[] = {12.0,3.14,5.6};
        double dba2[] = {12.0,3.14,5.6};

        System.out.println("Address of the array: ");
        System.out.println(dba1);
        System.out.println(dba2);

        System.out.println("Identity hashcode of array: ");
        System.out.println(System.identityHashCode(dba1));
        System.out.println(System.identityHashCode(dba2));

        System.out.println("Identity hashcode of the element: ");
        System.out.println(System.identityHashCode(dba1[0]));
        System.out.println(System.identityHashCode(dba2[0]));

        System.out.println("\n");
        System.out.println("For long data type: ");
        long lga1[] = {1222,34,67,888888885};
        long lga2[] = {1222,34,67,888888885};

        System.out.println("Address of the array");
        System.out.println(lga1);
        System.out.println(lga2);

        System.out.println("Identity hashcode of the array: ");
        System.out.println(System.identityHashCode(lga1));
        System.out.println(System.identityHashCode(lga2));

        System.out.println("Identity hashcode of the array element: ");
        System.out.println(System.identityHashCode(lga1[0]));
        System.out.println(System.identityHashCode(lga2[0]));

    }
}
