import java.util.*;
import java.util.*;

public class Use{
	public static void main(String[] args) {

		System.out.println("------------------------------------------");

		Bicycle b1 = new Bicycle();

		b1.setSpeed(0);
		b1.setGear(0);
		System.out.print("Before Change Speed and Gear : ");
        System.out.println();
        System.out.println(b1.toString());
		

		System.out.print("After Change Speed and Gear : ");
		b1.changeGear(2);
		b1.speedUp(100);
		System.out.println();
		System.out.println(b1.toString());


System.out.println("------------------------------------------");
        
        Bicycle b2 = new Bicycle(20,1);
		System.out.print("Before Change Speed and Gear : ");
		System.out.println();
		System.out.println(b2.toString());


		b2.changeGear(3);
		b2.speedUp(60);
	    System.out.print("After Change Speed and Gear : ");
	    System.out.println();
		System.out.println(b2.toString());
	
	}
}