package chapter11.program1;

public class Triangle extends Polygon {
	//三角形の点1
	Point p1;
	
	//三角形の点2
	Point p2;
	
	//三角形の点3
	Point p3;
	
	//コンストラクタ
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
		p3 = new Point(x3, y3);
		super.angle = 3;
	}
	
	@Override
	public void draw() {
		System.out.println(
			"[三角形を描画] 点1("
			+ Integer.valueOf(p1.getX()).toString()
			+ ","
			+ Integer.valueOf(p1.getY()).toString()
			+ ")から点2("
			+ Integer.valueOf(p2.getX()).toString()
			+ ","
			+ Integer.valueOf(p2.getY()).toString()
			+ ")から点3("
			+ Integer.valueOf(p3.getX()).toString()
			+ ","
			+ Integer.valueOf(p3.getY()).toString()
			+ ")の三角形"
		);
	}

	@Override
	public double getPerimeter() {
		Line p1p2 = new Line(p1.getX(), p1.getY(), p2.getX(), p2.getY());
		Line p2p3 = new Line(p2.getX(), p2.getY(), p3.getX(), p3.getY());
		Line p3p1 = new Line(p3.getX(), p3.getY(), p1.getX(), p1.getY());
		return p1p2.getPerimeter() + p2p3.getPerimeter() + p3p1.getPerimeter();
	}

}
