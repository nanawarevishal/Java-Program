
/*
 Program 7 : write a program to print the following pattern
		Row =5;
		O
		14 13
		L  K  J
		9  8  7  6
		E  D  C  B  A

		Row = 4
		10
		I H
		7 6 5
		D C B A

		USE THIS FOR LOOP STRICTLY for the outer loop
		Int row;
		Take row from user
		for(int i =1;i<=row;i++){

		}
 */


package For.Assignment.Assignment07;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program6 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Number of rows : ");
		int row = Integer.parseInt(br.readLine());

        int num = ((row * row) + row) / 2;
		char ch = (char)(64 + ((row * row) + row) / 2);

		for(int i = 1; i <= row; i++){
			
			for(int j = 1; j <= i; j++){
				
				if( row % 2 == 1){
					if(i % 2 == 0){
					
						System.out.print(num + " ");
					}else{
			
						System.out.print(ch + " ");
					}		
					ch--;
					num--;
				}
                
                else{

					if(i  % 2 != 0){
					
						System.out.print(num + " ");
					}else{
			
						System.out.print(ch + " ");
					}		
					ch--;
					num--;
				}

			}
			System.out.println();
		}   
    }
}
