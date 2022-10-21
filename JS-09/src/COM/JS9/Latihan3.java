/*
 * 21343001_ADELINA SUCIKO
 * Perbandingan object
 */

package COM.JS9;

public class Latihan3 {

	public static void main(String[] args) {
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
