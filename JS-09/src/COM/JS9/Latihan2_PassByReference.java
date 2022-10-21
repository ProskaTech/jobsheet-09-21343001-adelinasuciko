/*
 * 21343001_ADELINA SUCIKO
 * Percobaan 2 pass by reference
 */
package COM.JS9;

public class Latihan2_PassByReference {

	public static void main(String[] args) {
		
		System.out.println("Nama : Adelina suciko");
		System.out.println("Nim : 21343001");
		System.out.println("Mata kuliah : Praktikum pemrograman berorientasi object");
		System.out.println("***********************");
		
		int[] ages = {10,11,12};
		for(int i=0; i<ages.length; i++) {
			System.out.println(ages[i]);
		}
		test(ages);
		
		for(int i=0; i<ages.length; i++) {
			System.out.println(ages[i]);
		}

	}

	private static void test(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			arr[i] = i+50;
		}
		
	}

}
