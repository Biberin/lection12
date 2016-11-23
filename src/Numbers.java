
public class Numbers {
	private static int a;
	private static int b;
	private static int sum;
	public Numbers (){
		this.setA(a);
		this.setB(b);
		this.sum =getA()+getB();
	}
	
	
	public static int getSum() {
		return sum;
	}


	public static int getA() {
		return a;
	}
	public static void setA(int a) {
		Numbers.a = a;
	}
	public static int getB() {
		return b;
	}
	public static void setB(int b) {
		Numbers.b = b;
	}

}
