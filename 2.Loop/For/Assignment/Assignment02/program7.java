package For.Assignment.Assignment02;

/*
 Program 7 : write a program to print the following pattern
	D D D D
	D D D D
	D D D D
	D D D D
 */

class Program7 {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 4; j++) {

                System.out.print("D ");
            }
            System.out.println();

        }
    }
}
