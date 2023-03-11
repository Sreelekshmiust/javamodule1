package userdefinedobjects;
import java.util.TreeSet;


public class TestEmpTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Employee> empSet = new TreeSet<Employee>();
		
		Employee emp1 = new Employee ("John Doe","Male",24,101,"Research",10000);
		Employee emp2 = new Employee ("Jane Doe","Female",24,102,"Accounts",50000);
		Employee emp3 = new Employee ("Jones Doe","Male",24,103,"sales",60000);
		Employee emp4 = new Employee ("Jason Doe","Male",25,104,"Research",30000);
		Employee emp5 = new Employee ("John Doe","Male",24,101,"Research",10000);
		
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		
		System.out.println(empSet);
		System.out.println(empSet.size());
		
		

	}

}
