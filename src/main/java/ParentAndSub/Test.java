package ParentAndSub;

public class Test {

	public static void main(String[] args) {
		Parent p = new Sub("xiaosan");
		p.string();
		System.out.println(Color.GREEN);
		String ame=Color.getName(3);
		Color c = Color.GREEN;
		System.out.println(c.getName());
		
	}
}
