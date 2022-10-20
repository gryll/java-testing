package Point;

public class Distance {
    public static double distance(Point p1, Point p2) {
        double dx = Math.abs(p1.x-p2.x);
        double dy = Math.abs(p1.y-p2.y);
        return Math.sqrt(dx*dx+dy*dy);
    }
    public static void main(String[] args) {
        Point p1 = new Point(1,1);
        Point p2 = new Point(2,2);
        System.out.println(distance(p1,p2));
        System.out.println((p1.distacteTo(p2)));
    }
}
