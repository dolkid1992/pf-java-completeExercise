import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        //Tính điểm trung bình
        Scanner sc = new Scanner(System.in);
        double physicalPoint, chemistryPoint, biologicalPoint;

        System.out.print("Nhập điểm Vật Lý: ");
        physicalPoint = sc.nextDouble();
        System.out.print("Nhập điểm Hóa Học: ");
        chemistryPoint = sc.nextDouble();
        System.out.print("Nhập điểm Sinh Học: ");
        biologicalPoint = sc.nextDouble();

        double tongDiem = chemistryPoint + biologicalPoint + physicalPoint;
        System.out.print("Tổng điểm 3 môn là: " + tongDiem);
        double diemTB = tongDiem / 3;
        System.out.print("Điểm trung bình 3 môn là: " + diemTB);

        //Chuyển đổi đọ C sang F
        int celsius;
        System.out.print("Enter Celsius: ");
        celsius = sc.nextInt();

        int fahrenheit = ((9*celsius)/5) + 32;
        System.out.println("Fahrenheit after convert is: "+fahrenheit);
    }
}
