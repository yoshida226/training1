package chapter11.program1;

public class Circle  extends Shape {
	
	//円の中心
	private Point center;
	
	//円の半径	
	private int radius;
	
	//center(x,y座標)、半径全て0で初期化するコンストラクタ
	public Circle() {
		center = new Point();
		radius = 0;
	}
	
	//center(x,y座標)、半径全て0で初期化するコンストラクタ
	public Circle(int x, int y, int r) {
		center = new Point(x, y);
		radius = r;
	}
		
	@Override
	public void draw() {
		System.out.println(
			"[円を描画] 中心点("
			+ Integer.valueOf(center.getX()).toString()
			+ ","
			+ Integer.valueOf(center.getY()).toString()
			+ ")から半径"
			+ Integer.valueOf(radius).toString()
		);
	}

	@Override
	public double getPerimeter() {
		return radius * 2 * Math.PI;
	}

}
