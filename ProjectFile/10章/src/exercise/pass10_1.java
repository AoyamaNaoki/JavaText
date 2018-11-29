package exercise;

import lib.Input;

public class pass10_1 {

	public static void main(String[] args) {
		String s;
		while ((s = Input.getString()) != null) {
			if (s.equals("dog")) {
				System.out.println("いぬ");
			} else if (s.equals("cat")) {
				System.out.println("ねこ");
			} else if (s.equals("mouse")) {
				System.out.println("ねずみ");
			} else if (s.equals("rabbit")) {
				System.out.println("うさぎ");
			} else {
				System.out.println("?");
			}
		}
	}

}
