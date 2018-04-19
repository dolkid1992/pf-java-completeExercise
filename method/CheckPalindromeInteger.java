package method;

import java.util.Scanner;

public class CheckPalindromeInteger {
    public static boolean isPalindrome(String s){
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Nhập chuỗi cần kiểm tra: ");
        s = sc.nextLine();
        if (isPalindrome(s))
            System.out.println("la chuỗi đối xứng");
        else System.out.println("ko phải chuỗi đối xứng");
    }
}
