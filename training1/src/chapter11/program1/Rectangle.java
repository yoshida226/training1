package chapter11.program1;

public class Rectangle extends Polygon {
	
	Point p;
	int width;
	int height;
	
	public Rectangle(int x, int y, int width, int height) {
		p = new Point(x, y);
		this.width = width;
		this.height = height;
		super.angle = 4;
	}

	@Override
	public void draw() {
		System.out.println(
			"[長方形(矩形)を描画] 点("
			+ Integer.valueOf(p.getX()).toString()
			+ ","
			+ Integer.valueOf(p.getY()).toString()
			+ ")を基準として幅"
			+ Integer.valueOf(width).toString()
			+ "、高さ"
			+ Integer.valueOf(height).toString()
			+ "の長方形"
		);
	}

	@Override
	public double getPerimeter() {
		return ( width + height ) * 2;
	}

}
