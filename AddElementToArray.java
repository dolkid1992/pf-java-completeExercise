import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào độ dài của mảng: ");
        size = sc.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        int index,newElement;
        System.out.print("\n"+"Nhập chỉ số index cần thay đổi vào mảng: ");
        index = sc.nextInt();
        System.out.print("Nhập phần tử mới muốn chèn: ");
        newElement = sc.nextInt();
        if(index <= 0 && index>array[size]){
            System.out.print("Không chèn được phần tử vào mảng");
        } else array[index] = newElement;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
