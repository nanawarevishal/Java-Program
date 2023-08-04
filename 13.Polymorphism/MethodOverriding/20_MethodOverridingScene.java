package MethodOverriding;

class Parent20{

    int fun(){
        System.out.println("In Parent fun");
        return 0;
    }

    Object gun(){
        System.out.println("Object");
        return new Object();
    }
}

class child20 extends Parent20{

     void marry(){
        System.out.println("Child selected Girl");
    }

    String gun(){
        System.out.println("String");
        return "String";
    }
}

class Client20{
    public static void main(String[] args) {
        Parent20 obj = new child20();
        obj.gun();
    }
}

