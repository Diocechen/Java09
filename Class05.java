package java09;

class CCount{
	static int cnt = 0;
	public CCount(){
		count();
	}
	private void count(){
		cnt++;
	}
	public void setZero() {
		cnt = 0;
	}
	public void setValue(int n) {
		cnt = n;
	}
}

public class Class05 {

	public static void main(String[] args) {
		CCount c = new CCount();
		CCount a = new CCount();
		CCount t = new CCount();
		System.out.println(CCount.cnt);
		c.setZero();
		System.out.println(CCount.cnt);
		c.setValue(9);
		System.out.println(CCount.cnt);
	}

}
/* (d) cnt 應設為類別變數，因為要追蹤所有被建立的物件總數，所以各個被建立的物件都要共用 cnt 變數
 * (e) 都可以，只要讓建構子在建立物件時能夠呼叫就好。
 * */
