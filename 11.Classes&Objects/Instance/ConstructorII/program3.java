package Instance.ConstructorII;

class Demo3{

    Demo3(){
        System.out.println("In Constructor I");
    }

    // Demo3(){
    //     System.out.println("In Constructor II");
    // }
}

/*

Output: 
        program3.java:9: error: constructor Demo3() is already defined in class Demo3
            Demo3(){
            ^
        1 error

        
 */
