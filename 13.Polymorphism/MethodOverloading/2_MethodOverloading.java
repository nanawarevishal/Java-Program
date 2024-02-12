

package MethodOverloading;


class demo1{
                                                            // Method Signature
    int fun(int x){                                      // fun(int)
        return x;
    }

    float fun(int y,int x){                                    // fun(int)
        return y;
    }
}


/*
 Output: 
        .\2_MethodOverloading.java:12: error: method fun(int) is already defined in class demo1
        float fun(int y){
          ^
1 error
 */