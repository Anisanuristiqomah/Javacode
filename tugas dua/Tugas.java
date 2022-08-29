package tugas2;

import java.util.Scanner;
import java.util.*;

public class Tugas {
	public static void main(String[] args) {
		Scanner terminalInput = new Scanner (System.in);
		String pilihanUser;
		//pilihan_user
		System.out.println(" Program Berjalan\n");
		System.out.println("1.\tNilai Absolute");
		System.out.println("2.\tNilai Terbesar");
		System.out.println("3.\tPerpangkatan");
		//print_pilihan_user	
		System.out.print("\n\nPilihan Anda: ");
		pilihanUser = terminalInput.next();
			
		switch(pilihanUser){
			case "1":
				System.out.println("Nilai Absolute");
		//mengubah nilai negatif jadi positif, nilai positif tetap positif
				Scanner number;
		
				int a ;
				number = new Scanner(System.in);
		
				System.out.print("nilai a= ");
				a = number.nextInt();
		
				a = (a < 0 ? - a : a);
				System.out.print("a = " + a);
				break;
			case "2":
				System.out.println("Nilai Terbesar");
				//menentukan nilai terbesar dalam kumpulan data 
				Integer array[] = {-55,89,45,-74,34,56,78,32,34,33,-92};
                Integer indexTerbesar = array[0];
                 for(int i=0;i<array.length;i++){
                     //menrntuksn nilai terbesar    
                	 if(indexTerbesar < array[i]){
                                indexTerbesar = array[i];
                        }
                //println nilai terbesar
                 } System.out.println("indexTerbesar " + indexTerbesar);
                break;
			case "3":
				System.out.println("Perpangkatan");
				int hasil = 1; 
		        int angka, pangkat;
		        //memasukkan angka yang akan di pangkatkan 
		        Scanner b=new Scanner(System.in);
		        System.out.print("Masukkan angka: ");
		        angka=b.nextInt();
		        //memasukkan pangkat
		        System.out.print("Masukkan pangkat: ");
		        Scanner c=new Scanner(System.in);
		        pangkat=c.nextInt();

		        for(int i=1;i<=pangkat;i++){
		            hasil=hasil*angka; 
		        }
		        System.out.println( "Hasil "+angka+" pangkat "+pangkat+" = " +hasil);
		        break;

			    
			
		
		}
	}
}

