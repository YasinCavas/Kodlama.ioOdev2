package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.Topla(5, 7);
		System.out.println(sonuc);
		DortIslem dortIslem2 = new DortIslem();
		int sonuc2 = dortIslem2.Carp(5, 7);
		System.out.println(sonuc2);
		DortIslem dortIslem3 = new DortIslem();
		int sonuc3 = dortIslem3.Bol(10, 5);
		System.out.println(sonuc3);
		DortIslem dortIslem4 = new DortIslem();
		int sonuc4 = dortIslem4.Cıkar(5, 7);
		System.out.println(sonuc4);

	}

}
