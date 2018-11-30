package exercise;

import lib.Input;

public class practice12_3 {

	public static void main(String[] args) {
		int tanka = Input.getInt();
		double ritu = Input.getDouble();
		System.out.println("税額= " + tax(tanka, ritu));
	}

	public static int tax(int tanka, double ritu) {
		return (int) (tanka * ritu);

	}
}
