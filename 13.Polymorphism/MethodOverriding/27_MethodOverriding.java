package MethodOverriding;

import java.net.SocketPermission;

class demo27{

    demo27(){
        System.out.println("In Constructor Demo");
    }
}

class demoChild27 extends demo27{

    demoChild27(){
        System.out.println("In DemoChild Constructor");
    }
}

class Parent27{

    Parent27(){
        System.out.println("In Parent constructor ");
    }

    demo27 m1(){
        System.out.println("In m1 parent");

        return new demo27();
    }
}

class Child27 extends Parent27{

    Child27(){
        System.out.println("In Child Constructor");
    }

    demoChild27 m1(){
        System.out.println("In m1 child");
        return new demoChild27();
    }
}

class Client27{

    public static void main(String[] args) {
        
        Parent27 p = new Child27();
        p.m1();
    }
}
