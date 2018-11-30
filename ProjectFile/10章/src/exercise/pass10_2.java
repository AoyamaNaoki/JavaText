package exercise;

import lib.Input;

public class pass10_2 {

	public static void main(String[] args) {
		double distance;
		distance = Input.getDouble();
		if (distance >= 500) {
			System.out.println("1,000円です。");
		} else if (distance >= 100 && distance < 500) {
			System.out.println("700円です。");
		} else if (distance >= 50 && distance < 100) {
			System.out.println("500円です。");
		} else {
			System.out.println("300円です");
		}
	}

}
