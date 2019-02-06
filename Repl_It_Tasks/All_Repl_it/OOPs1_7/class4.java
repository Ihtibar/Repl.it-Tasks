package OOPs1_7;

class Calc {

	private int x, y, Result;

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	int getResult() {
		return Result;
	}

	void setX(int x) {
		this.x = x;
	}

	void setY(int y) {
		this.y = y;
	}

	void minus() {
		Result = x - y;
	}

	void plus() {
		Result = x + y;
	}
}

public class class4 {

	public static void main(String[] args) {

		Calc a = new Calc();
		a.setX(1);
		a.setY(1);
		a.plus();
		System.out.println("1+1 = " + a.getResult());// 1+1 = 2

	}

}
