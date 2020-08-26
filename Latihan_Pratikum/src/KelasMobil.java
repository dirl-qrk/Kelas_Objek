class Mobil{
	String warna;
	int tahunProduksi;
}
public class KelasMobil {
	public static void main(String[] args) {
		Mobil mobilku = new Mobil();
		
		mobilku.warna = "Merah";
		mobilku.tahunProduksi = 2019;
		
		System.out.println("Warna : " + mobilku.warna);
		System.out.println("Tahun : " + mobilku.tahunProduksi);
	}
}