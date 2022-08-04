
public class pr1 {
	public static void main(String[] args) {
		
		int after=1,befor=0, count=0, next=0;
		while(count<7) {
		System.out.println(after);
		next=after;
		after=befor+after;
		befor=next;
		count++;
	}
	}
}
