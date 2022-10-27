package java09;
class A{
	static void add2n(int n) {
		int sum = 0;
		for(int i = 1;i <= n;i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
public class Class06 {

	public static void main(String[] args) {
		A a = new A();
		A.add2n(5);
		A.add2n(10);
	}

}
