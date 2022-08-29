package com.tutorial;


import java.util.Scanner;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner terminalInput = new Scanner (System.in);
		String pilihanUser;
		//pilihan_user
		System.out.println("data\n");
		System.out.println("1.\tIdentitas");
		System.out.println("2.\tKakulator");
		System.out.println("3.\tPerbandingan");
		//print_pilihan_user	
		System.out.print("\n\nPilihan Anda: ");
		pilihanUser = terminalInput.next();
			
		switch(pilihanUser){
			case "1":
				//identitas 
				System.out.println("\nsaya Anisa Nur Istiqomah\nmengikuti bothcamp untuk melatih skill, menambah relasi dan mencoba hal baru\n saya berharap dapat membuat suatu program yang dapat membantu suatu perusahaan menjalankan bisnisnya\n");
				break;
			case "2":
				//kakulator
				System.out.println("Kakulator");
				Scanner inputUser;
				float a,b,hasil;
				char operator;
				
				inputUser = new Scanner(System.in);
				
				System.out.print("nilai a= ");
				a = inputUser.nextFloat();
				System.out.print("operator= ");
				operator = inputUser.next().charAt(0);
				System.out.print("nilai b= ");
				b = inputUser.nextFloat();
				
				System.out.println("input user:" + a + " "+ operator +" " + b );
				//pertambahan
				if (operator == '+') {
					hasil = a + b; 
					System.out.println("hasil =" + hasil );
				//pengurangan
				} else if (operator == '-') {
					hasil = a - b;
					System.out.println("hasil =" + hasil);
				//perkalian
				} else if (operator == '*') {
					hasil = a * b; 
					System.out.println("hasil =" + hasil);
				//pembagian
				} else if  (operator == '/') {
					hasil = a / b; 
					System.out.println("hasil =" + hasil);
				//sisa_pembagian
				} else if (operator == '%') {
					hasil = a % b;
					System.out.println("hasil =" + hasil);
				} else {
					System.out.println("operator tidak ditemukan");
				}
						
				break;
			case "3":
				System.out.println("Perbandingan");
				//perbandingan_nilai
				
			
				inputUser = new Scanner(System.in);
				
				System.out.print("nilai a= ");
				a = inputUser.nextFloat();
				System.out.print("nilai b= ");
				b = inputUser.nextFloat();
				System.out.println("input user:" + a + " " + b );
				//lebih besar dari
				if (a > b) {
					System.out.println( a + "lebih besar dari" + b);
				//kurang dari
				}else if ( a < b ){
					System.out.println(a + "kurang dari" +b);
				//sama dengan
				}else if (a >= b){
					System.out.println( a + "angka sama dengan" +b);
				}
				
				break;
			default:
				//apabila input tidak ditemukan 
				System.err.println("\ninput anda tidak ditemukan\nsilahkan pilih [1-3]\n");
				
			}
			
			
		}

	}


