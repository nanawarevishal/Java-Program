package collection.list.arrayList;

import java.util.*;

class Employee{

    String empName = null;
    float empSal = 0.0f;

    Employee(String empName,float empSal){
        this.empName = empName;
        this.empSal = empSal;
    }

    public String toString(){
        return empName+"-"+empSal;
    }

}

class SortByName implements Comparator<Employee>{

    public int compare(Employee obj1,Employee obj2){
        return obj1.empName.compareTo(obj2.empName);
    }
}

class SortBySal implements Comparator<Employee>{

    public int compare(Employee obj1,Employee obj2){
        return (int) (obj1.empSal - obj2.empSal);
    }
}


class Client6{

    public static void main(String[] args) {
        
        ArrayList<Employee> ls = new ArrayList<>();

        ls.add(new Employee("Rahul", 200000.00f));
        ls.add(new Employee("Ashish", 250000.00f));
        ls.add(new Employee("Kanha", 150000.00f));
        ls.add(new Employee("Badhe", 175000.00f));

        // System.out.println(ls);

        Collections.sort(ls,new SortByName());

        System.out.println(ls);

        Collections.sort(ls,new SortBySal());

        System.out.println(ls);
    }
}