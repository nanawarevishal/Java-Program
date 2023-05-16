
/*
        Q1
        Write a program in which students should enter marks of 5 different subjects. If all subject
        having above passing marks add them and provide to switch case to print grades(first class
        second class), if student get fail in any subject program should print “You failed in exam”
 */

package SwitchCase.Assignment.Assignment01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int marathiMarks;
        System.out.print("Enter Marathi marks = ");
        marathiMarks = Integer.parseInt(br.readLine());
        int englishMarks;
        System.out.print("Enter English marks = ");
        englishMarks = Integer.parseInt(br.readLine());
        int mathMarks;
        System.out.print("Enter Maths marks = ");
        mathMarks = Integer.parseInt(br.readLine());
        int socialScienceMarks;
        System.out.print("Enter Social Science marks = ");
        socialScienceMarks = Integer.parseInt(br.readLine());
        int scienceMarks;
        System.out.print("Enter Science marks = ");
        scienceMarks = Integer.parseInt(br.readLine());

        if (marathiMarks < 35 || englishMarks < 35 || mathMarks < 35 || socialScienceMarks < 35 || scienceMarks < 35) {

            System.out.println("You failed Exam");
        } else {
            double avg =

                    (marathiMarks + englishMarks + mathMarks + socialScienceMarks + scienceMarks) / 5;

            char ch;
            if (avg > 75)
                ch = 'A';
            else if (avg > 60)
                ch = 'B';
            else if (avg > 50)
                ch = 'C';
            else if (avg > 40)
                ch = 'D';
            else if (avg >= 35)
                ch = 'E';
            else
                ch = 'F';
            switch (ch) {
                case 'A':

                    System.out.println("First Class with Distinction");
                    break;

                case 'B':

                    System.out.println("First Class");
                    break;

                case 'C':

                    System.out.println("Second Class");
                    break;

                case 'D':

                    System.out.println("Third Class");
                    break;

                case 'E':

                    System.out.println("Pass");
                    break;

                case 'F':

                    System.out.println("Fail");
                    break;

            }
        }
    }
}