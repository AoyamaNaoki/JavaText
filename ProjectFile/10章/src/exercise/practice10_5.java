package exercise;

import lib.Input;

public class practice10_5 {

	public static void main(String[] args) {
		int sansei = 0;
		int hantai = 0;
		int data;
		while ((data = Input.getInt()) != 0) {
			if (data % 3 == 0) {
				sansei++;
			} else {
				hantai++;
			}
		}

		System.out.println("3の倍数=" + sansei);
		System.out.println("その他=" + hantai);

	}

}
