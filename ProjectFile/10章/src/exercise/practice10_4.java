package exercise;

import lib.Input;

public class practice10_4 {

	public static void main(String[] args) {
		double weight;
		weight = Input.getDouble();
		if (weight >= 10) {
			System.out.println("送料は1,500円です");
		} else if (weight >= 5) {
			System.out.println("送料は800円です");
		} else if (weight >= 1) {
			System.out.println("送料は500円です");
		} else {
			System.out.println("送料は300円です");
		}
	}

}
