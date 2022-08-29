package revisitugas2;
import java.util.*;

public class Angka {

	public static void main(String[] args) {
		System.out.println("Nilai Angka Terbesar");
	
		int[] arrayApapun = { 45, -20, 11, 19, -60, 33, 6, -127};
		
		System.out.println(arrayTerbesar(arrayApapun));
		
	}
	 public static int arrayTerbesar(int [] myArray) {
	      
	        int angkaTerbesar = myArray[0];

	        for(int ii=0;ii<myArray.length;ii++){

	            if(angkaTerbesar < myArray[ii]){

	                angkaTerbesar = myArray[ii];

	            }

	        }

	        return angkaTerbesar;

	}
}
