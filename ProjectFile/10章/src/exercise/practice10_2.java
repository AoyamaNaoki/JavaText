package exercise;

import lib.Input;

public class practice10_2 {

	public static void main(String[] args) {

		int ryokin = 750;
		int nin;
		nin = Input.getInt();
		if (nin >= 5) {
			System.out.println(ryokin * 0.7 * nin);
		} else {
			System.out.println(ryokin * nin);
		}
	}

}
