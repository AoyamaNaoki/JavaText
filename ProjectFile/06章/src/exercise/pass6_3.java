package exercise;

public class pass6_3 {

	public static void main(String[] args) {
		String[] name = { "田中", "青木", "松田", "斎藤", "鈴木" };
		int[] year = { 22, 19, 34, 36, 18 };
		double[] height = { 175.5, 183.2, 170.5, 165.3, 185.0 };

		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(year[i] + "\t");
			System.out.println(height[i]);
		}
	}

}
