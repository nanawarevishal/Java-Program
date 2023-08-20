package MethodLocalIC;

/*
ex Bank class
    method:
        Create account:
            class Current
            class saving

        take loan


2.class Phone pay:
            method:
                transaction:
                        class Bank names:


3.class Play Store:
            method:
                Update:
                    class Apps:

3.
    
 */

class Outer1{


    void m1(){

        System.out.println("Outer M1");

        class Inner1{

            void m1(){
                System.out.println("Inner M1");
            }
        }

        Inner1 obj = new Inner1();
        obj.m1();
    }

    void m2(){

        System.out.println("Outer M2");
    }

    public static void main(String[] args) {
        Outer1 obj = new Outer1();
        obj.m1();
        obj.m2();
    }
}
