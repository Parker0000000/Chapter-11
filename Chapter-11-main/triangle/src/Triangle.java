public class Triangle extends GeometricObject{
private double Side1 = 1.0;
private double Side2 = 1.0;
private double Side3 = 1.0;
public Triangle() {}




public Triangle(double Side1, double Side2, double Side3) {
 this.Side1 = Side1;
 this.Side2 = Side2;
 this.Side3 = Side3;
}


double getPerimiter() {
    return Side1 + Side2 + Side3;
}

String ToString() {
return "Triangle: Side1 = " + Side1 + " + Side2 " + Side2 + " + Side3 " + Side3;
}

double getArea() {
    double s = (Side1 + Side2 + Side3) / 2;
    return Math.sqrt(s*(s-Side1)*(s-Side2)*(s-Side3));
}
}

