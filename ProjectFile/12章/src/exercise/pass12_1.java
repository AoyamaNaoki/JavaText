package exercise;

import lib.Input;

public class pass12_1 {

	public static void main(String[] args) {
		double mile = Input.getDouble();
		mile = mileToKm(mile);
		System.out.println(mile);
	}

	public static double mileToKm(double mile) {
		return mile * 1.609344;
	}
}
