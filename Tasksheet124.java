class Point {
    private double x;
    private double y;
   
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
   
    // Method to scale the point by half towards (0,0)
    public void scale() {
        this.x = this.x / 2;
        this.y = this.y / 2;
    }
   
    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }
}

public class Tasksheet124 {
    public static void main(String[] args) {
        Point p = new Point(32, 32);
        for (int i = 0; i < 5; i++) {
            p.scale();
            p.print();
        }
    }
}
