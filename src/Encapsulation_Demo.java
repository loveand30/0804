
public class Encapsulation_Demo {
	public static void main(String[] args) {
		Car sonata=new Car();
		sonata.setName("소나타");
		sonata.setPrice(3100);
		System.out.println(sonata.getName()+"의 가격은 "+sonata.getPrice()+"만원 입니다.");
	}
}
