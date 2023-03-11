package userdefinedobjects;
import java.util.ArrayList;


public class TestEmpArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		Employee emp1 = new Employee ("John Doe","Male",24,101,"Research",10000);
		Employee emp2 = new Employee ("Jane Doe","Female",24,102,"Accounts",50000);
		Employee emp3 = new Employee ("Jones Doe","Male",24,103,"sales",60000);
		Employee emp4 = new Employee ("Jason Doe","Male",25,104,"Research",30000);
		Employee emp5 = new Employee ("John Doe","Male",24,101,"Research",10000);
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		System.out.println(empList);
		

	}

}
