import java.util.ArrayList;
import java.util.Collections;

class Employee6 {
	
	String name = null;
	int empId = 0;

	Employee6(String name, int empId) {
		
		this.name = name;
		this.empId = empId;
	}
	public String toString() {

		return empId + " : " + name;
	}
}

class Main6 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(new Employee6("Kanha", 23));
		al.add(new Employee6("Rahul", 25));
		al.add(new Employee6("Ashish", 26));
		al.add(new Employee6("Badhe", 24));

		Collections.sort(al, (Object obj1, Object obj2)-> {
			
			return ((Employee6)obj1).name.compareTo(((Employee6)obj2).name);	
		});
		
		System.out.println(al);
	}
}