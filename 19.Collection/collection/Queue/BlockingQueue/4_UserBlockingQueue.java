package collection.Queue.BlockingQueue;

import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

class Employee{

    String name = null;

    Employee(String name){
        this.name = name;
    }

    public String toString(){
        return "{ Name: "+name+ " }";
    }

    // public int compareTo(Object obj){
    //     return name.compareTo(((Employee)obj).name);
    // }
}


class sortByName implements Comparator{

    public int compare(Object obj1,Object obj2){
        return ((Employee)obj1).name.compareTo(((Employee)obj2).name);
    }
}

class Client4{

    public static void main(String[] args) {
        
        PriorityBlockingQueue pbq = new PriorityBlockingQueue<>(3,new sortByName());

        pbq.offer(new Employee("Kanha"));
        pbq.offer(new Employee("Ashish"));
        pbq.offer(new Employee("Rahul"));
        pbq.offer(new Employee("Badhe"));

        System.out.println(pbq);
    }
}