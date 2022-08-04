
public class This_Demo1 {
	public static void main(String[] args) {
		
	
	Lion lion=new Lion();
	Lion another=lion.getLion();
	System.out.println(another.name);
	}
}
class Lion{
	String name="한지민";
	Lion getLion(){
		return this;
	}
}