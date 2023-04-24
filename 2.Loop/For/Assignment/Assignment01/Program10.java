//Program 10 : Write a program to print the product of the first 10 numbers.

package For.Assignment.Assignment01;
class Program{

	public static void main(String[] args){
		
		int mul = 1;
		for(int i = 1; i <= 10; i++){
			
			mul *= i;
		}
		System.out.println(mul);
	}
}
