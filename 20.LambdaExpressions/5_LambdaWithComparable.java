import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{

    int empId =0;
    String empName = null;

    Employee(int empId,String empName){
        this.empId = empId;
        this.empName = empName;
    }

    public String toString(){
        return "{ empId: "+empId+" empName: "+empName+" }\n";
    }

    // public int compareTo(Object obj){
    //     return empName.compareTo(((Employee)obj).empName);
    // }
}

class SortById implements Comparator{

    public int compare(Object obj1,Object obj2){
        return ((Employee)obj1).empId - (((Employee)obj2).empId);
    }
}

class Client{

    public static void main(String[] args) {
        
        ArrayList ls = new ArrayList<>();

        ls.add(new Employee(25, "Kanha"));
        ls.add(new Employee(15, "Ashish"));
        ls.add(new Employee(22, "Rahul"));

        Collections.sort(ls,new SortById());
        System.out.println(ls);
    }
}
