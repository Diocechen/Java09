package java09;
class Caaa{
	private int value;
	public Caaa() {
		value = 10;
		System.out.println("value="+value);
	}
	public Caaa(int i) {
		value = i;
		System.out.println("value="+value);
	}
}
public class Class03 {

	public static void main(String[] args) {
		Caaa obj1 = new Caaa();
		Caaa obj2 = new Caaa(12);
	}
}
/*	(b) 沒有參數的建構元跟有一個參數的建構元
 * 	(c) 不行，該class必須在自己的檔案內才能被宣告為public
 * 	(d) 
 * */
