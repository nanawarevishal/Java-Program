public class Program13 {
    public static void main(String[] args) {
        
        // Shift operator

        int x =8;
        int y =10;

        System.out.println(x << 2);  // left shift 1 0 0 0 - 1 0 0 0 0 0
        System.out.println(y >> 2);  //right shift 1 0 1 0 - 0 0 1 0


        int p =132;
        int q= 75;

        System.out.println(p >> 5);
        System.out.println(q << 2);
        // 132  1 0 0 0 0 1 0 1 - 4
        //75   1 0 0 1 0 1 1 0 0- 300
               
    }
}
