public class TestTriangle {
    public static void main(String[] args) throws Exception {
        String color = "red";
        boolean filled = true;
        double Side1 = 10;
        double Side2 = 10;
        double Side3 = 10;
        
        Triangle triangle = new Triangle(Side1, Side2, Side3);
        GeometricObject geoObj = new GeometricObject(color, filled);
        System.out.println("The perimiter of the triangle is: " + triangle.getPerimiter());
        System.out.println(triangle.ToString());
        System.out.println("The area of the triangle is: " + triangle.getArea());
        System.out.println("The color of the triangle is: " + geoObj.color());
        if (geoObj.filled() == true) {
            System.out.println("The triangle is filled ");
        } else {
            System.out.println("The triangle is not filled ");
        }

    }
}
