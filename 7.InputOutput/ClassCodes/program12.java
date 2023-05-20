package ClassCodes;


import java.io.*;
public class program12 {
    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the match Team Name: ");
        String tName = br.readLine();

        System.out.println("Enter the man of the match: ");
        String name = br.readLine();


        System.out.println("NUmber of runs scored: ");
        int runs = Integer.parseInt(br.readLine());

        
        System.out.println(tName);
        System.out.println(name);
        System.out.println(runs);
    }
}
