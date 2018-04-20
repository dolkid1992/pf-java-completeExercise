package OOP_Location;

public class App {
    public static void main(String[] args) {
        double[][] listNumber = {{1, 2, 3}, {4, 55, 6}, {7, 8, 9}};
        Location location = new Location();
        System.out.println(location.locateLargest(listNumber));
        for (int i = 0; i < listNumber.length; i++) {
            for (int j = 0; j < listNumber[i].length; j++) {
                System.out.print(listNumber[i][j] + " ");
            }
            System.out.println();
        }
    }
}
