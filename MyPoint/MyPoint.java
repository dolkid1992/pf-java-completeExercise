package MyPoint;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(MyPoint m1, MyPoint m2){
        int locationM1 = (m1.x - m2.x) * (m1.x - m2.x);
        int locationM2 = (m1.y - m2.y) * (m1.y - m2.y);
        return Math.sqrt(locationM1 + locationM2);
    }
}
