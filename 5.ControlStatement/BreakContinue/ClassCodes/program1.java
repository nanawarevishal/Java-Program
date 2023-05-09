package BreakContinue.ClassCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program1 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int N = Integer.parseInt(br.readLine());

        int cnt=0;
        for(int i=1;i<=N;i++){

            if(N % i==0){
                cnt++;
            }

            if(cnt>2){
                break;
            }

            if(cnt==1 && N/2==i){
                cnt=2;
                break;
            }

        }
        if(cnt==2){
            System.out.println(N+" is Prime number");
        }
        else{
            System.out.println(N+" is not Prime number");
        }
    }
}
