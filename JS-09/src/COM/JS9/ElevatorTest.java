/*
 * 21343001_ADELINA SUCIKO
 */
package COM.JS9;

public class ElevatorTest {

	public static void main(String[] args) {
		
		System.out.println("Nama : Adelina suciko");
		System.out.println("Nim : 21343001");
		System.out.println("Mata kuliah : Praktikum pemrograman berorientasi object");
		System.out.println("***********************");
		System.out.println();
		
		Elevator myElevator = new Elevator();
		myElevator.openDoor();
		myElevator.closeDoor(); 
		myElevator.goUp();
		myElevator.goUp();
		myElevator.goUp();
		myElevator.openDoor();
		myElevator.closeDoor();
		myElevator.goDown();
		myElevator.openDoor();
		myElevator.closeDoor();
		myElevator.goDown();
		myElevator.setFloor(myElevator.TOP_FLOOR);
		myElevator.openDoor();

	}

}
