package method;

import java.util.Scanner;

public class MyTriangle {
    public static void main(String[] args) {
        double side1, side2, side3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side 1: ");
        side1 = sc.nextDouble();
        System.out.println("Enter Side 2: ");
        side2 = sc.nextDouble();
        System.out.println("Enter Side 3: ");
        side3 = sc.nextDouble();

        if (isValid(side1, side2, side3))
            System.out.println(calculatorArea(side1, side2, side3));
        else System.out.println("Méo phải hình tam giác");
    }

    private static boolean isValid(double side1, double side2, double side3) {
        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
            return false;
        } else return true;
    }

    private static double calculatorArea(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        double areaTriangle = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return areaTriangle;
    }
}
