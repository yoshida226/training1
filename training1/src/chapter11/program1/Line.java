package chapter11.program1;

public class Line implements Figure {
	private Point p1;
	private Point p2;
	
	public Line() {
		p1 = new Point();
		p2 = new Point();
	}
	
	public Line(int x1, int y1, int x2, int y2) {
		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
	}
	
	//図形描画機能	
	public void draw() {
		System.out.println(
			"[線を描画] 始点("
			+ Integer.valueOf(p1.getX()).toString()
			+ ","
			+ Integer.valueOf(p1.getY()).toString()
			+ ")から終点("
			+ Integer.valueOf(p2.getX()).toString()
			+ ","
			+ Integer.valueOf(p2.getY()).toString()
			+ ")まで"
		);
	}
	
	//長さ測定機能
	public double getPerimeter() {
		return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
	}
}