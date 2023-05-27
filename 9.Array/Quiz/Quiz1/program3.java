package Quiz.Quiz1;

public class program3 {
    public static void main(String[] args) {

        program3 [] var1 = new program3[5];

		for(int i=0;i<var1.length;i++)
            System.out.println(var1[i]);
    }
}

/*

Output: 
    null
    null
    null
    null
    null


Exception : 
    Array of objects is initialized with null by default, 
    so the index where no value is put explicitly contains null

 */
