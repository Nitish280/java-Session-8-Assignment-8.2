//here we extending the class employee
public class ITDepartment extends Employee {
	int id = 28;
	String name = "Nitish";

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		System.out.println();
		emp1.display();
	}
}

class Employee {
	int id = 28;
	String name = "Nitish";
//here we declaring the method final
	final void display() {
		System.out.println("Id : " + id + ",Name :" + name);

	}
}
