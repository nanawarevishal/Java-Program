/*
 10. Write a program to print the product of the first 10 numbers
 */

package ForLoop.Assignments.Assignment02;

public class program10 {
    public static void main(String[] args) {

        int mult=1;
        for(int i=1;i<=10;i++){
            mult *=i;
        }

        System.out.println(mult);
    }
}
