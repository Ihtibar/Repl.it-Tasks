package OOPs1_7;

class LameCalculator {

	int plus(int A, int B) {

		return A + B;
	}

	int minus(int A, int B) {

		return A - B;
	}

	int multiply(int A, int B) {

		return A * B;
	}

	int divide(int A, int B) {

		return A / B;
	}
}

public class Class2 {

	public static void main(String[] args) {

		LameCalculator lc = new LameCalculator();
		System.out.println("1+1 = " + lc.plus(1, 1));
		System.out.println("2-3 = " + lc.minus(2, 3));
		System.out.println("2x3 = " + lc.multiply(2, 3));
		System.out.println("10:2 = " + lc.divide(10, 2));

	}

}
