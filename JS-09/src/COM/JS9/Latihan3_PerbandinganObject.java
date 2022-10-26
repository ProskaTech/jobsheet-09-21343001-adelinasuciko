/*
 * 21343001_ADELINA SUCIKO
 * percobaan 3 perbandingan object
 */
package COM.JS9;

public class Latihan3_PerbandinganObject {

	public static void main(String[] args) {
		
		System.out.println("Nama : Adelina suciko");
		System.out.println("Nim : 21343001");
		System.out.println("Mata kuliah : Praktikum pemrograman berorientasi object");
		System.out.println("***********************");
		
		String str1, str2;
		str1 = "Free the bound perodiclas.";
		str2 = str1;
		
		System.out.println("String 1: " +str1);
		System.out.println("String 2: " +str2);
		System.out.println("same object?" + (str1==str2));
		
		str2= new String(str1);
		System.out.println("String 1: " +str1);
		System.out.println("String 2: " +str2);
		System.out.println("same object?" + (str1==str2));
		
		System.out.println("same value?" + str1.equals(str2));
	}

}
