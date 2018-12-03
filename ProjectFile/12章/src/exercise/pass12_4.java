package exercise;

import lib.Input;

public class pass12_4 {

	public static void main(String[] args) {
		double height = Input.getDouble("高さ");
		double width = Input.getDouble("幅");
		double depth = Input.getDouble("深さ");
		isOk(height, width, depth);
	}

	public static void isOk(double height, double width, double depth) {
		double total = height + width + depth;
		if (total <= 180) {
			double weight = Input.getDouble("重さ");
			ryokin(total, weight);
		} else {
			System.out.println("配送できない");
		}
	}

	public static void ryokin(double total, double weight) {
		if (total <= 90 && weight <= 5) {
			System.out.println("500円");
		} else if (total <= 90 && weight <= 10) {
			System.out.println("1000円");
		} else if (total <= 90 && weight > 10) {
			System.out.println("1500円");
		} else if (total <= 180 && weight <= 5) {
			System.out.println("1000円");
		} else if (total <= 180 && weight <= 10) {
			System.out.println("2000円");
		} else if (total <= 90 && weight > 10) {
			System.out.println("3000円");
		}
	}
}