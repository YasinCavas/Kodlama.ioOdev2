package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 9;
		boolean varMi = false;
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}

		}
		String mesaj = "";
		String mesaj1 = "";
		if (varMi) {
			mesaj = "Sayı mevcuttur:" + aranacak;
			mesajVer(mesaj);
		} else {
			mesaj1 = "Sayı mevcuttur değildir:" + aranacak;
			mesajVer(mesaj1);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
