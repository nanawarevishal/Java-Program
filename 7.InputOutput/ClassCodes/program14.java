package ClassCodes;

    
import java.io.*;
import java.util.StringTokenizer;
public class program14 {

    public static void main(String[] args)throws IOException {
        
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Player name,Grade of Palyer,Jersy Number,Average");
        String info = br.readLine();

        StringTokenizer st = new StringTokenizer(info, " ");

        String namePlayer = st.nextToken();
        char grade = st.nextToken().charAt(0);
        int jersyNumber = Integer.parseInt(st.nextToken());
        float average = Float.parseFloat(st.nextToken());


        System.out.println("Name of Player:"+namePlayer);
        System.out.println("Grade of Player: "+grade);
        System.out.println("Jersy Number of Player: "+jersyNumber);
        System.out.println("Average of Player: "+average);

        

    }
}
