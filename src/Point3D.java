public class Point3D extends Point {
    public int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                 ", z=" + z + "}";
    }
    @Override
    public double distance(Point p) {
        return 0;
//        return (this.x - p.x), (this.y - p.y);
    }
}
