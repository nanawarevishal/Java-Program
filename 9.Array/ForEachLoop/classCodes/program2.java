package ForEachLoop.classCodes;

public class program2 {
    public static void main(String[] args) {
        
        char arr[] = {10,20,30,40,50};

        for(float data : arr){
            System.out.print(data+" ");

            if(data == 40){
                break;
            }
        }
    }
}
