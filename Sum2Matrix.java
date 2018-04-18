import java.util.Scanner;

public class Sum2Matrix {
    public static void main(String[] args) {
        int line;
        int column;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số dòng của ma trận: ");
            line = sc.nextInt();
            System.out.println("Nhập vào số cột của ma trận: ");
            column = sc.nextInt();
        } while (line < 1 || column < 1);

        int arr1[][] = new int[line][column];
        int arr2[][] = new int[line][column];

        int arr3[][] = new int[line][column];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Arr1[" + i + "," + j + "] =");
                arr1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Arr2[" + i + "," + j + "] =");
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Ma trận 1: ");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("Ma trận 2: ");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println("\n");
        }

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Ma trận tổng arr3: ");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
