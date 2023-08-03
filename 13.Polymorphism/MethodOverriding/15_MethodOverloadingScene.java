package MethodOverriding;

class Demo15{

    void fun(String str){
        System.out.println("String Para");
    }

}

class Client15{
    public static void main(String[] args) {
        Demo15 obj = new Demo15();
        obj.fun(new StringBuffer("Core2Web"));
        obj.fun(new StringBuilder("Core2Web"));
    }
}


/*

 Output:  
        .\15_MethodOverloadingScene.java:14: error: incompatible types: StringBuffer cannot be converted to String
            obj.fun(new StringBuffer("Core2Web"));
                    ^
        .\15_MethodOverloadingScene.java:15: error: incompatible types: StringBuilder cannot be converted to String
                obj.fun(new StringBuilder("Core2Web"));
                        ^
        Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
        2 errors
        
 */
