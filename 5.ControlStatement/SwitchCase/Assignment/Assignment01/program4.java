
/*
        Q4
        Take a choice from the user
        Show this to the user

 */

package SwitchCase.Assignment.Assignment01;

import java.util.Scanner;

public class program4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("What's your interest?");
        System.out.println("1. movies");
        System.out.println("2. Series");
        System.out.print("Enter your choice 1 or 2 : ");
        choice = sc.nextInt();
        switch (choice) {

            case 1: {
                int wish;
                System.out.println("Movie you wish to watch today ");
                System.out.println("1. Founder");
                System.out.println("2. Snowden");
                System.out.println("3. Jobs");
                System.out.println("4. Her");
                System.out.println("5. Social Network");
                System.out.println("6. Wall-E");
                System.out.println("7. AI");
                System.out.print("Enter your choice : ");
                wish = sc.nextInt();
                switch (wish) {
                    case 1:
                        System.out.println("You wished to watch Founder movie");

                        break;
                    case 2:
                        System.out.println("You wished to watch Snowden movie");

                        break;
                    case 3:
                        System.out.println("You wished to watch Jobs movie");

                        break;
                    case 4:
                        System.out.println("You wished to watch Her movie");

                        break;
                    case 5:
                        System.out.println("You wished to watch Social Network movie");

                        break;
                    case 6:
                        System.out.println("You wished to watch Wall-E  movie");

                        break;
                    case 7:
                        System.out.println("You wished to watch AI movie");
                        break;
                    default:

                        System.out.println("Invalid Choice");

                }
            }
                break;
            case 2: {
                int wish;
                System.out.println("Best series to watch ");
                System.out.println("1. Silicon Valley");
                System.out.println("2. Devs");
                System.out.println("3. the IT crowd");
                System.out.println("4. Mr Robot");
                System.out.print("Enter your choice : ");
                wish = sc.nextInt();
                switch (wish) {
                    case 1:
                        System.out.println("You wished to watch Silicon valley Series");

                        break;
                    case 2:
                        System.out.println("You wished to watch Devs Series");

                        break;
                    case 3:
                        System.out.println("You wished to watch the IT crowd Series");

                        break;
                    case 4:
                        System.out.println("You wished to watch Mr Robot Series");

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
