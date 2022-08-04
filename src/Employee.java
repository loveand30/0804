
public class Employee {

	private String empno;
	private String name;
	private int salary;
	private String hire;
	
	Employee(){
		System.out.println("방금 격자");
		this.empno=empno;
		this.name=name;
	}
	
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setHire(String hire) {
		this.hire = hire;
	}
	public void myPrint() {
		System.out.printf("%s, %s, %d, %s\n", this.empno, this.name, this.salary, this.hire);
	}
}
