package pertemuan10;

public class Main {

	public static void main(String[] args) {
		// instansiasi class ArrayKu
		ArrayKu arrayKu = new ArrayKu();
		
		// definisikan maksimal bentuk array
		// maksimal 5 angka
		arrayKu.angkaFavoritku = new int[5];
		
		// isi array dengen nilai
		arrayKu.angkaFavoritku[0] = 13;
		arrayKu.angkaFavoritku[1] = 10;
		arrayKu.angkaFavoritku[2] = 20;
		arrayKu.angkaFavoritku[3] = 21;
		arrayKu.angkaFavoritku[4] = 24;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Selamat, angka favoritmu di index ke "+i+" adalah " + arrayKu.angkaFavoritku[i]);
		}
	}
}
