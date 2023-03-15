package oopsday4.composition;

public class CompanyHR {

	public static void main(String[] args) {
		
		Address resAdd = new Address("31","Mannath","Worli","Mumbai",400000);
		Address commAdd = new Address("32","Antela","Bandra","Mumbai",450000);
		
		Employee emp1 = new Employee ("John Doe","Male",24,101,"Research",10000,resAdd,commAdd);
		System.out.println(emp1);
		Employee emp2 = new Employee ("Jane Doe","Female",24,102,"Accounts",50000,resAdd,commAdd);
		System.out.println(emp2);
		Employee emp3 = new Employee ("Jones Doe","Male",24,103,"sales",60000,resAdd,commAdd);
		System.out.println(emp3);
		Employee emp4 = new Employee ("Jason Doe","Male",25,104,"Research",30000,resAdd,commAdd);
		System.out.println(emp4);
		Employee emp5 = new Employee ("John Doe","Male",24,101,"Research",10000,resAdd,commAdd);
		System.out.println(emp5);
		
		if(emp1.equals(emp5)) {
			System.out.println("the objects are same");
		}
		else {
			System.out.println("the objects are not same");
		}
		
		
	}

}
