package java09;

class Power{
	public static int power(int x, int n) {
		int temp = 1;
		for(int i = 0;i < n;i++) {
			temp *= x;
		}
		return temp;
	}
}

public class Class07 {

	public static void main(String[] args) {
		System.out.println(Power.power(2, 5));
		System.out.println(Power.power(3, 2));
	}

}
