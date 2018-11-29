package exercise;

public class pass7_2 {

	public static void main(String[] args) {
		String[] name = { "田中", "中村", "鈴木", "山本", "本田" };
		double[] kokugo = { 82, 85, 74, 90, 70 };
		double[] eigo = { 70, 74, 88, 74, 82 };
		double kokugoKei = 0;
		double eigoKei = 0;

		for (double a : kokugo) {
			kokugoKei += a;
		}

		for (double a : eigo) {
			eigoKei += a;
		}

		System.out.println("国語平均=" + kokugoKei / kokugo.length);
		System.out.println("英語平均=" + eigoKei / eigo.length);
		System.out.println("科目平均=" + (kokugoKei + eigoKei) / (kokugo.length + eigo.length));

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + " : " + (kokugo[i] + eigo[i]) / 2);
		}
	}

}
