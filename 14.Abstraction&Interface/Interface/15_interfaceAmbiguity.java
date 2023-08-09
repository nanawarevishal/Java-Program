package Interface;

interface p15{
    
    default void fun(){
        System.out.println("P1 fun");
    }
}

interface parent15{
    default void fun(){
        System.out.println("parent 15");
    }
}

class child implements p15,parent15{
}


/*
// In Case we didn't override
 Output:
        .\15_interfaceAmbiguity.java:16: error: types p15 and parent15 are incompatible;
            class child implements p15,parent15{
            ^
            class child inherits unrelated defaults for fun() from types p15 and parent15
            1 error


 */
