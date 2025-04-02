package chapter11.program1;

public class Square extends Rectangle {

	public Square(int x, int y, int width) {
		super(x, y, width, width);
	}
	
	public void draw() {
		System.out.println(
			"[正方形を描画] 点("
			+ Integer.valueOf(p.getX()).toString()
			+ ","
			+ Integer.valueOf(p.getY()).toString()
			+ ")を基準として幅・高さ"
			+ Integer.valueOf(width).toString()
			+ "の正方形"
		);
	}

}
