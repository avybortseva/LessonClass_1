public class Main {
    public static void main(String[] args) {

        String s = "Text";
        Point point = new Point(0, 3);
        Point point2 = new Point(4, 0);



        /*point.x = 10;
        point.y = 20;

        System.out.println(point);*/
        System.out.println(point);
        System.out.println(point2);

        System.out.println(point.distance(point2));
        Point3D point3D = new Point3D(1, 2, 3);
        System.out.println(point3D);
    }
}