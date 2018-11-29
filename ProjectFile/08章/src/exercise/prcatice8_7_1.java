package exercise;

import lib.Input;

public class prcatice8_7_1 {

	public static void main(String[] args) {
		int year = Input.getInt();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("うるう年です");
		} else {
			System.out.println("平年です");
		}
	}

}
