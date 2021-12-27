package payrollservice;

public class Payroll {

	public int id;
	public String name;
	public double salary;
	
	public Payroll(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Payroll [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
