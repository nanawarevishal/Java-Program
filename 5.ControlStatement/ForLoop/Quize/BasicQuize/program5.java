package ForLoop.Quize.BasicQuize;

public class program5 {
    public static void main(String[] args) {

        System.out.println("Before for loop");

        for(int i=0,j=0;i<1;j++){
            System.out.println("Inside for");
        }

        System.out.println("After for");
    }
}


/*
  Output - Infinite Loop

   Explanation - As we are not changing the value of the loop condition will never become false resulting in an infinite loop
 */
