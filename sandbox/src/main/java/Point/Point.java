package Point;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distacteTo(Point p){
        double dx = Math.abs(x-p.x);
        double dy = Math.abs(y-p.y);
        return Math.sqrt(dx*dx+dy*dy);
    }
}
