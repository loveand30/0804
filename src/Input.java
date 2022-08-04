import java.util.Scanner;


public class Input {
	Scanner sc = new Scanner(System.in);
	void input(Student student) {
		
		System.out.print("Hakbun : ");
		
		String name=sc.nextLine();
		
		System.out.print("Hakkbun : " );
		String hakbun = sc.nextLine();
		
		System.out.print("Korean : ");
		int kor = sc.nextInt();
		
		System.out.print("English : ");
		int eng = sc.nextInt();
		
		System.out.print("Math : ");
		int mat = sc.nextInt();
		
		Student jimin=new Student(hakbun,name,kor,eng,mat)
		
	}
}
