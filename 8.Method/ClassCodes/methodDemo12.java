package ClassCodes;

public class methodDemo12 {

    void fun(int x){
        System.out.println(x);
    }
    public static void main(String[] args) {
        methodDemo12 obj = new methodDemo12();

        obj.fun(10);
        obj.fun(10.05f);
    }
}


/*
 .\methodDemo12.java:12: error: method fun in class methodDemo12 cannot be applied to given types;
        obj.fun(10f);
           ^
  required: int
  found:    float
  reason: argument mismatch; possible lossy conversion from float to int
1 error
error: compilation failed
 */
