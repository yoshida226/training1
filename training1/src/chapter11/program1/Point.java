package chapter11.program1;

public class Point {
	private int x;
	private int y;
	
	//値を0で初期化するコンストラクタ
	public Point() {
		x = 0;
		y = 0;
	}

	//受け取った値で初期化するコンストラクタ
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//xのGetter
	public int getX() {
		return this.x;
	}

	//xのSetter
	public void setX(int x) {
		this.x = x;
	}

	//yのGetter	
	public int getY() {
		return this.y;
	}

	//yのSetter
	public void setY(int y) {
		this.y = y;
	}
}
