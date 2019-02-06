package OOPs1_7;

class Db {
	private String data;
	private int yint;

	String getData() {
		return data;
	}

	void setData(String data) {
		this.data = data;
	}

	int getYint() {
		return yint;
	}

	void setYint(int yint) {
		this.yint = yint;
	}

	void insertData(String data, int yint) {
		this.data = data;
		this.yint = yint;
	}
}

public class class3 {

	public static void main(String[] args) {

		Db db = new Db();
		db.insertData("aaa", 123);

		System.out.println(db.getData());// aaa
		System.out.println(db.getYint());// 123

		db.setData("zzz");
		db.setYint(200);

		System.out.println(db.getData());// zzz
		System.out.println(db.getYint());// 200

	}

}
