

/*
    Write a program, take 7 characters as an input , Print only vowels from the array
    Input: a b c o d p e
    Output : a o e
 */



package Assignment.Assignment01;
import java.io.*;

public class program4 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array: ");
        int size = Integer.parseInt(br.readLine());

        char a[] = new char[size];
        System.out.println("Enter the elements: ");

        for(int i=0;i<size;i++){
            a[i] =(char)(br.read());
            br.skip(2);
        }

        for(int i=0;i<size;i++){
            if(a[i]=='a' || a[i]=='e' || a[i]=='o' || a[i]=='u'){
                System.out.print(a[i]+" ");
            }

        }

    }
}
