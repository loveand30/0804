
public class Constructor_Demo3 {
	public static void main(String[] args) {
		
		Sawon sawon=new Sawon(200);
//		System.out.println(sawon.salary);
		
	}
}
class Sawon{
	String name;
	int salary;
	public Sawon(String name, int salary) {
//		this(name,salary)
		this.name=name;
		this.salary=salary;
	}
	public Sawon(String name) {
		this(name,180);
//		this.name=name;
		System.out.printf("%s, %d", name, salary);
		
//		this.salary=180;
//		new Sawon(name,180);
	}
	public Sawon(int salary) {
		this("unknown", salary);
//		this.salary=salary;
		System.out.printf("%s, %d", name, salary);
		
//		this.name="unnown";
//		new Sawon("홍길동",salary);
	}
	public Sawon() {
		this("unkwon",180);
		System.out.printf("%s, %d", name, salary);
	}
}