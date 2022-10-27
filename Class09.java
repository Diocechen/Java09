package java09;

class CWin{
	static int cnt = 0;
	String color = "";
	int width;
	int height;
	CWin(){
		color = "Red";
		width = 2;
		height = 2;
		count();
	}
	CWin(String str,int w,int h){
		color = str;
		width = w;
		height = h;
		count();
	}
	public static void setZero() {
		cnt = 0;
	}
	public static void setN(int n ) {
		cnt = n;
	}
	private void count() {
		cnt++;
	}
}

public class Class09 {

	public static void main(String[] args) {
		CWin c = new CWin();
		CWin b = new CWin();
		CWin j = new CWin();
		System.out.println(CWin.cnt);
		CWin.setZero();
		System.out.println(CWin.cnt);
		CWin.setN(66);
		System.out.println(CWin.cnt);
		
	}

}
