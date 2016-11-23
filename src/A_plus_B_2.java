import acm.program.ConsoleProgram;

public class A_plus_B_2 extends ConsoleProgram {

	public void run() {

		int n = readInt("¬ведите число больше 3 ");

		println(findIntegers(n));

	}

	private Res findIntegers(int n) {
		Res[] results = new Res[n];
		int effectiveSize =0;
		for (int a = 0; a < n; a++) {
			for (int b = 0; b < n; b++) {
				if (5 * a - 2 * b == n) {
					results[effectiveSize]=new Res(a,b);
				}
			}
		}
		Res result = results[0];
		for (int i = 1; i<effectiveSize;i++){
			if (result.getSum()>results[i].getSum())
				result = results[i];
		}
		return result;

	}

}
