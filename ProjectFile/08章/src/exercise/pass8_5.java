package exercise;

import lib.Input;

public class pass8_5 {

	public static void main(String[] args) {
		String s = Input.getString();
		if (s == null) {
			System.out.println("文字列はnull");
		} else {
			System.out.println(s);
		}
	}

}
