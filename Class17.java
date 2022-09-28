package java09;

class Namecard{
	private String name;
	private String address;
	private Phone data = new Phone(" "," ");
	
	public Namecard(String n, String a, String co, String ce){
		name = n;
		address = a;
		data.company = co;
		data.cell = ce;
	}
	
	public void show() {
		System.out.println("好友姓名:" + name);
		System.out.println("聯絡地址:" + address);
		System.out.println("公司電話:" + data.company);
		System.out.println("手機號碼:" + data.cell);
	}
	
	class Phone{	//(a)
		private String company;
		private String cell;
		public Phone(String s1,String s2){
			company = s1;
			cell = s2;
		}
	}
}

public class Class17 {

	public static void main(String[] args) {
		Namecard first = new Namecard("Andy", "123City", "2345-6789","0911336600");
		first.show();
	}

}
