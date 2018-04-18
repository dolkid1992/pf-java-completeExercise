package method;

import java.util.Scanner;

public class PalindromeInteger {
    public static int reverse(int number){
        int reverse = 0 , rem;
        while (number > 0){
            rem = number % 10;
            reverse = reverse * 10 + rem;
            number /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        System.out.println("Reverse number: ");
        System.out.println(reverse(number));
    }
}
