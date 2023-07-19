package AccessSpecifiers;

class employee{
    int empId = 10;
    String empName = "Raj";
    static int salary = 5000;

    void empInfo(){
        System.out.println("empId"+empId);
        System.out.println("empName: "+empName);
        System.out.println("Salary: "+salary);
    }
}

class Empdetails{
    public static void main(String[] args) {
        employee emp1 = new employee();
        employee emp2 = new employee();

        emp1.empInfo();
        emp2.empInfo(); 

        System.out.println(System.identityHashCode(emp1.empName));
        System.out.println(System.identityHashCode(emp2.empName));

        
        System.out.println(System.identityHashCode(emp1.empId));
        System.out.println(System.identityHashCode(emp2.empId));

        System.out.println(System.identityHashCode(emp1.salary));
        System.out.println(System.identityHashCode(emp2.salary));
        

        System.out.println();

        emp1.empId = 20;
        emp1.empName = "Rahul";
        emp1.salary = 2000;

        emp1.empInfo();
        emp2.empInfo();    
        
        System.out.println(System.identityHashCode(emp1.empName));
        System.out.println(System.identityHashCode(emp2.empName));
        
        System.out.println(System.identityHashCode(emp1.empId));
        System.out.println(System.identityHashCode(emp2.empId));

        System.out.println(System.identityHashCode(emp1.salary));
        System.out.println(System.identityHashCode(emp2.salary));


    }
}
