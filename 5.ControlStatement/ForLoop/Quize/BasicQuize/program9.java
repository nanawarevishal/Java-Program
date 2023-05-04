package ForLoop.Quize.BasicQuize;

public class program9 {
    public static void main(String[] args) {
        
        for(int var1=10,float var2=40.25f;var1<15;var1++,var2++){
            if(var2 % 2==0){
                System.out.println(var1);
            }
        }
    }
}


/*
 Output : Compile time error

 Explanation -    In a loop, we cannot initialize variables of different data types.it gives multiple errors for syntax
 */
