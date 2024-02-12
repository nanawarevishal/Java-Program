package AbstractClass;

abstract class CompanyName{

    int x =10;

    abstract void EmpRole();

    void workingTime(){
        System.out.println("9.00-5.00");
    }
}

class Employee extends CompanyName{
    
    void EmpRole(){
        System.out.println("Developer");
    }
}

class Client6{
    public static void main(String[] args) {
        CompanyName obj = new Employee();
        obj.EmpRole();
        obj.workingTime();
    }
}


