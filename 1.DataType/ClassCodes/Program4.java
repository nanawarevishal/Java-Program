package ClassCodes;

public class Program4 {
    public static void main(String[] args) {
        
        byte var1 = 18;
        byte var2 = 18;

        // var1 = var1 + var2;  // error: incompatible types: possible lossy conversion from int to byte (Compile time error)
                                // Runtime value generated in var1 and the addition of two byte is 36 but at runtime number 
                                // generated by java is by default is int. therefore the error  lossy conversion from int to byte

        System.out.println(var1);
    }
}
