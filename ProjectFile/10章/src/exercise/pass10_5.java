package exercise;

public class pass10_5 {

	public static void main(String[] args) {
		String[] name = { "田中", "前田", "鈴木", "中村", "田辺", "浦川", "島田", "岩田" };
		int[] drinking = { 7, 0, 3, 3, 2, 0, 0, 6 };
		int[] smoking = { 60, 10, 0, 20, 10, 0, 30, 0 };

		for (int i = 0; i < name.length; i++) {
			String setumei = null;
			if (drinking[i] == 0 && smoking[i] == 0) {
				setumei = "安全";
			} else if (drinking[i] == 0 && smoking[i] > 0 && smoking[i] <= 20) {
				setumei = "注意";
			} else if (drinking[i] > 0 && drinking[i] <= 3 && smoking[i] == 0) {
				setumei = "注意";
			} else if (drinking[i] > 0 && drinking[i] <= 3 && smoking[i] > 0 && smoking[i] <= 20) {
				setumei = "要指導";
			} else if (drinking[i] >= 4 || smoking[i] >= 21) {
				setumei = "要検査";
			}
			System.out.println(name[i] + "(" + drinking[i] + "," + smoking[i] + ")" + "\t" + setumei);
		}
	}

}
