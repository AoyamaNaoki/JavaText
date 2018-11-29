package exercise;

import lib.Input;

public class practice10_3_1 {

	public static void main(String[] args) {
		int number;
		number = Input.getInt();
		if (number == 124) {
			System.out.println("大当たり");
		} else if (number == 123 || number == 125) {
			System.out.println("前後賞");
		} else {
			System.out.println("はずれ");
		}
	}

}
