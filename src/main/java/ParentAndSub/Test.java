package ParentAndSub;

public class Test {

	public static void main(String[] args) {
		Parent p = new Sub("xiaosan");
		p.string();
		System.out.println(Color.GREEN);
		String ame=Color.getName(3);
		Color c = Color.GREEN;
		System.out.println(c.getName());
		String url = "http://photos.youduoduo.xin/zhuanji/tempUpload/2018-04-04-11-03-42-0.xls";
		String str = "f"+url.substring(2);
		System.out.println(str);
	}
}
