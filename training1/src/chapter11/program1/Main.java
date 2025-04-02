package chapter11.program1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("図形描画[ 0:円 2:線 3:三角形 4:長方形 44:正方形 ] : >");
		
		// ユーザーからの入力を待つ
        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();

            // 入力された値に基づいて処理を行う
            switch (choice) {
                case 0:
                	Circle c = new Circle(100, 100, 20);
                	c.draw();
                	System.out.println("周囲の長さは、" + Double.valueOf(c.getPerimeter()).toString());
                    break;
                case 2:
                	Line l = new Line(0, 0, 100, 100);
                	l.draw();
                	System.out.println("周囲の長さは、" + Double.valueOf(l.getPerimeter()).toString());
                    break;
                case 3:
                	Triangle t = new Triangle(0, 0, 100, 100, 0, 200);
                	t.draw();
                	System.out.println("周囲の長さは、" + Double.valueOf(t.getPerimeter()).toString());
                	t.angle = 3;
                	System.out.println("内角の和は、" +Double.valueOf(t.getInternalAngle()));
                    break;
                case 4:
                	Rectangle r = new Rectangle(0, 0, 100, 50);
                	r.draw();
                	System.out.println("周囲の長さは、" + Double.valueOf(r.getPerimeter()).toString());
                	r.angle = 4;
                	System.out.println("内角の和は、" +Double.valueOf(r.getInternalAngle()));
                    break;
                case 44:
                	Square s = new Square(100, 100, 200);
                	s.draw();
                	System.out.println("周囲の長さは、" + Double.valueOf(s.getPerimeter()).toString());
                	s.angle = 4;
                	System.out.println("内角の和は、" +Double.valueOf(s.getInternalAngle()));
                    break;
                default:
                    System.out.println("無効な選択です。");
            }
        } else {
            System.out.println("数字を入力してください。");
            scanner.next(); // 無効な入力を読み飛ばす
        }

        // Scannerを閉じる (リソースの解放)
        scanner.close();

	}

}
