package exercise;

import lib.Input;

public class practice12_2 {

	public static void main(String[] args) {
		int number = Input.getInt("性別を入力してください(男:1,女:2)");
		String name = Input.getString("名前を入力してください");
		greet(number, name);
	}

	public static void greet(int number, String name) {
		if (number == 1) {
			System.out.println("こんにちは" + name + "くん");
		}
		if (number == 2) {
			System.out.println("こんにちは" + name + "さん");
		}
	}
}
