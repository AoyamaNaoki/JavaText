package pass15_01;

public class Exec {

	public static void main(String[] args) {
		Dice dice1 = new Dice(6, "黒");
		Dice dice2 = dice1;
		System.out.println(dice1.getVal() + " " + dice1.getColor());
		System.out.println(dice2.getVal() + " " + dice2.getColor());
	}

}
