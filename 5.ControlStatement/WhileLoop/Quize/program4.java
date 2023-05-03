package WhileLoop.Quize;

public class program4 {

    public static void main(String[] args) {
        
        int var =5;

        System.out.println("Inside Main");

        while(var > 3);{   // Here the empty while loop is present but the condition given is true so it will goes into infinite loop
            System.out.println("Inside While");
        }
    }
    
}
