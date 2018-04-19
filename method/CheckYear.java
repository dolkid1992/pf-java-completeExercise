package method;

import java.util.Scanner;

public class CheckYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a Start year : ");
        int yearBefore = scanner.nextInt();
        System.out.println("Input a Last year : ");
        int yearAfter = scanner.nextInt();
        int totalDays = 0;
        for (int i = yearBefore; i <= yearAfter; i++) {
            if (checkYear(i)) {
                totalDays = totalDays + 366;
            } else {
                totalDays += 365;
            }
        }
        System.out.println("Toltal days start year " +yearBefore+ " to " + yearAfter + " is: " + totalDays);
    }

    private static boolean checkYear(int year) {
        boolean check4 = year % 4 == 0;
        if (check4) {
            boolean check100 = year % 100 == 0;
            if (check100) {
                boolean check400 = year % 400 == 0;
                if (check400) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}