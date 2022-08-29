package revisitugas2;

import java.util.*;

//import belajar.scanner;

public class Nilai {

	public static void main(String[] args) {
		System.out.println("Nilai Absolute");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("nilai = ");//untuk nilai yang dimasukkan
		int varA = scanner.nextInt();
		
		System.out.print("nilai = ");//untuk nilai yang dikeluarkan/sudah dijalankan 
		int hasil = nilaiMutlak(varA);
		nilaiMutlak(hasil);
		
		System.out.println(nilaiMutlak(varA));//memasukkan method yang digunakan
	}
		//System.out.println("Nilai Absolute");
		
		public static int nilaiMutlak(int varA) {
		
		varA = (varA < 0 ? - varA : varA);
		//bisa menggunakan rumus diatas atau menggunakan if dibawah
		//if (varA < 0) {
			//return varA * -1;
		//}
		
		return varA;
		
		}
		
	}


