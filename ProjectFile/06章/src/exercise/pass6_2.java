package exercise;

import lib.Input;

public class pass6_2 {

	public static void main(String[] args) {
		System.out.println("start");
		int m, n;

		for (int i = 0; i < 3; i++) {
			m = Input.getInt("mの値を入れてください");
			n = Input.getInt("nの値を入力してください");
			System.out.println(n % m);
		}

		System.out.println("end");
	}

}
