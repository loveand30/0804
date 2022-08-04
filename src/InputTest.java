import static org.junit.Assert.*;

import org.junit.Test;

public class InputTest {
	Student student;
	
	@Before
	pubilc void init(){
		student= new Student();
	}
	
	@Ignore @Test
	public void testInput() {
		Student student=new Student();
		Input input = new Input();
		input.input(student);
//		assertEquals();
				
	}
	@Test
	public void testCalc(){
		Calc calc= new Calc();
		
		student.kor=100; student.eng=90; student.mat=80;
		calc.calc(student);
		System.out.print(student.tot);
		
	}
	
}
