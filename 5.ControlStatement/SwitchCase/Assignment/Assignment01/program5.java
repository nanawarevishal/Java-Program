
/*

    5. Write a real-time example that shows an index like the above code
    Solution:
    //this is also an example for nested switch
    //NOTE : This program is not Sponsored by Bajaj. It is only a real-time example.


 */

package SwitchCase.Assignment.Assignment01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice;
        System.out.println("Welcome to Bajaj Bikes Stop");
        System.out.println("Enter bike type you want to buy - ");
        System.out.println("1. Fully Faired ");
        System.out.println("2. Naked Bikes");
        System.out.print("Enter your choice 1 or 2 : ");
        choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1: {
                int ch;
                System.out.println("Fully Faired Options are :- ");
                System.out.println("1. Bajaj Pulser 220 F");
                System.out.println("2. Bajaj Pulser RS 200");
                System.out.println("3. Bajaj Pulser F 250");
                System.out.print("Enter your option : ");
                ch = Integer.parseInt(br.readLine());
                switch (ch) {
                    case 1:
                        System.out.println("You Selected option Bajaj Pulser 220 F");

                        break;
                    case 2:
                        System.out.println("You Selected option BajajPulser RS 200");

                        break;
                    case 3:
                        System.out.println("You Selected option Bajaj Pulser F 250");

                        break;
                    default:
                        System.out.println("Invalid Choice");

                }
            }
                break;

            case 2: {
                int ch;
                System.out.println("Naked Bikes Options are :- ");
                System.out.println("1. Bajaj Pulser NS 200");
                System.out.println("2. Bajaj Pulser NS 125");
                System.out.println("3. Bajaj Pulser NS 160");
                System.out.println("4. Bajaj Pulser N 160");
                System.out.println("5. Bajaj Pulser N 250");
                System.out.println("6. Bajaj Pulser 125");
                System.out.println("7. Bajaj Pulser 150");
                System.out.println("8. Bajaj Dominar 250");
                System.out.println("9. Bajaj Dominar 400");
                System.out.print("Enter your option : ");
                ch = Integer.parseInt(br.readLine());
                switch (ch) {
                    case 1:
                        System.out.println("You Selected option Bajaj Pulser NS 200");

                        break;
                    case 2:
                        System.out.println("You Selected option Bajaj Pulser NS 125");

                        break;
                    case 3:
                        System.out.println("You Selected option Bajaj Pulser NS 160");

                        break;
                    case 4:
                        System.out.println("You Selected option Bajaj  Pulser N 160");

                        break;
                    case 5:
                        System.out.println("You Selected option Bajaj Pulser N 250");

                        break;
                    case 6:
                        System.out.println("You Selected option Bajaj Pulser 125");

                        break;
                    case 7:
                        System.out.println("You Selected option Bajaj  Pulser 150");

                        break;
                    case 8:
                        System.out.println("You Selected option Bajaj  Dominar 250");

                        break;
                    case 9:
                        System.out.println("You Selected option Bajaj Dominar 400");

                        break;
                    default:
                        System.out.println("Invalid Choice");

                }
            }
                break;
            default:
                System.out.println("Invalid Choice");

        }
    }
}
