package method;

import java.util.Scanner;

public class SwapFeetAndMeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Feet: ");
        double feet = sc.nextDouble();
        System.out.println("Meter after convert is: "+feetToMetter(feet));

        System.out.println("Enter Meter: ");
        double metter = sc.nextDouble();
        System.out.println("Feet after convert is: "+meterToFeet(metter));
    }

    public static double feetToMetter(double feet){
        double meter;
        meter = 0.305 * feet;
        return meter;
    }

    public static double meterToFeet(double meter){
        double feet;
        feet = 3.279 * meter;
        return feet;
    }
}
