


public class merge {
    public static void main(String[] args) {
        int a1[] = {2,1,4,5};
        int a2[]= {1,5,6,7};

        int ans[] = new int[a1.length+a2.length];


        for(int i=0;i<(a1.length+a2.length);i++){
            if(i<a1.length){
                ans[i] = a1[i];
            }
            else{
                ans[i] = a2[i-a1.length];
            }
        }

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");

        }
    }
}
