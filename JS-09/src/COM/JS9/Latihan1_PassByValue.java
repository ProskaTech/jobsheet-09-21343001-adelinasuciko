/*
 * 21343001_ADELINA SUCIKO
 * Percobaan 1 pass by value
 */
package COM.JS9;

public class Latihan1_PassByValue {

	public static void main(String[] args) {
		
		System.out.println("Nama : Adelina suciko");
		System.out.println("Nim : 21343001");
		System.out.println("Mata kuliah : Praktikum pemrograman berorientasi object");
		System.out.println("***********************");
		
		int i=10;
		System.out.println(i);
		
		test(i);
		System.out.println(i); 
	}

	public static void test(int j) { 
	j=33;
		
	}
}
