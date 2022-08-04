
public class Constructor_Demo2 {
	public static void main(String[] args) {
		
//		Tiger tiger=new Tiger();
//		System.out.println(tiger.grade);
		MyCalender mc=new MyCalender(30,20,10);
		System.out.printf("%d%d%d",mc.day, mc.year,mc.month);
		
		
	}
}

class MyCalender{
	
	int year, month, day;
	public MyCalender(int a, int b, int c) {
		year=a;
		month=b;
		day=c;
	}
	
}

class Tiger{
	
	String name;
	int age;
	boolean flag;
	double weight;
	char grade;
	
	
}