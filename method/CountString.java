package method;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        chuoi = scanner.nextLine();
        System.out.println("Nhập vào ký tự cần đếm số lần xuất hiện: ");
        kyTu = scanner.next().charAt(0);

        for (int i = 0; i < chuoi.length(); i++) {
            if (kyTu == chuoi.charAt(i)) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự " + kyTu +
                " trong chuỗi " + chuoi + " = " + count);
    }
}
