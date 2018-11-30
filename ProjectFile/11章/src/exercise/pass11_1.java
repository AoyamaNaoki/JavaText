package exercise;

import lib.Input;

public class pass11_1 {

	public static void main(String[] args) {
		int amount = Input.getInt();
		String code = Input.getString();
		switch (code) {
		case "a100":
			System.out.println(amount * 100);
			break;
		case "a110":
			System.out.println(amount * 200);
			break;
		case "b100":
			System.out.println(amount * 100);
			break;
		case "b110":
			System.out.println(amount * 200);
			break;
		case "b120":
			System.out.println(amount * 200);
			break;
		case "c100":
			System.out.println(amount * 300);
			break;
		case "c110":
			System.out.println(amount * 300);
			break;
		case "d100":
			System.out.println(amount * 400);
			break;
		default:
			System.out.println(amount * 500);
			break;
		}
	}

}
