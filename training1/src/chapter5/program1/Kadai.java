package chapter5.program1;

public class Kadai {

	public static void main(String[] args) {
		
		HumanResource hr = new HumanResource("田中");
		Sales sl = new Sales("佐藤");
		Engineer en = new Engineer("鈴木", "Java");

		hr.displayInfo();
		sl.displayInfo();
		en.displayInfo();
		
		
	}

}
