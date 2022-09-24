package java09;

public class Class18 {

	public static void main(String[] args) {
		(
			new CCircle(10) 
			{
				void show() 
				{
					System.out.println(pi * radius * radius);
				}
			}
			
		).show();
	}
	static class CCircle{
		public double pi = 3.14;
		public double radius;
		public CCircle(double r) {
			radius = r;
		}
	}
}
