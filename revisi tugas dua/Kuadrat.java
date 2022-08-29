package revisitugas2;

import java.util.*;

public class Kuadrat {

	public static void main(String[] args) {
		System.out.println("Perpangkatan");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Masukkan angka: ");
		int angka = scanner.nextInt();
		
		System.out.println("Masukkan pangkat: ");
		int pangkat = scanner.nextInt();
		int akhir = eksponen(angka,pangkat);
		eksponen(angka,pangkat);
		System.out.println(eksponen(angka,pangkat));
        
	}  
        public static int eksponen(int angka, int pangkat) {
        int hasil = 1; 
       

        for(int i=1;i<=pangkat;i++){
        hasil=hasil * angka; 
        }
        return hasil;
        //System.out.println( "Hasil "+angka+" pangkat "+pangkat+" = " +hasil);
	}	

}
