
public class Res {
	
	private int a;
	private int b;
	
	
	
	public Res(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	
	public int getSum(){
		return a+b;
	}

}