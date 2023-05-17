package week1.day1;

public class Bike {
	public static void driveBike() {
		System.out.println("driveBike");
		
	}
	public static void applyBrake() {
		System.out.println("applyBrake");
	}
public static void soundHorn() {
	System.out.println("soundHorn");
}
public static void isPuncture() {
	System.out.println("isPuncture");
	
}
public static void main(String[] args) {
	Bike a =new Bike();
	a.driveBike();
	a.applyBrake();
	a.soundHorn();
	a.isPuncture();
}
}
