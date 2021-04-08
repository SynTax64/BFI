package BankGenerics.src.at.bfi.oop.konzepten.l_2._generics_bank;

//Thema: Generische DatenTypen
//siehe zuerst Bank.java und die aenderungen 

public class TestBank {
	public static void main(String[] args) {

		Bank<GeschaeftsKunde> bank = new Bank<>();

		Kunde gk1 = new GeschaeftsKunde(new Konto(100));
		Kunde gk2 = new GeschaeftsKunde(new Konto(101));
		Kunde gk3 = new GeschaeftsKunde(new Konto(102));

		Kunde[] geschaeftsKunden = new GeschaeftsKunde[3];
		geschaeftsKunden[0] = gk1;
		geschaeftsKunden[1] = gk2;
		geschaeftsKunden[2] = gk3;

		bank.setT((GeschaeftsKunde[]) geschaeftsKunden);

		System.out.println(bank);

	}

}
