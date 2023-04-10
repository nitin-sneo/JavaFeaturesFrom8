package java8;

class Employee{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}

public class PassBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(1,"ABC");
		String name="ABC";
		PassBy pb = new PassBy();
		pb.changeName(name);
		System.out.println("After Changed Name "+name);
		

	}
	
	public void changeName(String emp1) {
		emp1="FGH";
		System.out.println("Changed Name "+emp1);
	}

}
