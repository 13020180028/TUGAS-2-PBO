/* Nama : FITRIANI HASBULLAH
   STB	: 13020180028
   KELAS : B1
   HARI / TGL : SENIN, 25 MARET 2020
   WAKTU : 21.46
*/


public class Waktu{
	public static void main(String[] args){
			int detik, menit, jam, sisa1,sisa2;
			detik = 5200;
	
		jam = detik/3600;
		sisa1 = detik%3600;
		
		menit = (int) sisa1/60;
		sisa2 = sisa1%60;
		
		System.out.println("Hasil Konversi : " + detik + " Detik = " + jam + " Jam : " + menit + " Menit : " + sisa2 + " Detik");
	
	}
}