package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
	  krediUI krediUI=new krediUI();
			 krediUI.krediHesapla(new askerKrediManager());
      krediUI krediUI2=new krediUI();
             krediUI2.krediAktarma(new askerKrediManager());
	}

}
