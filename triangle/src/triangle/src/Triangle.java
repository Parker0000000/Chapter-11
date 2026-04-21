public class Triangle extends GeometricObject{
private double Side10 = 1.0;
private double Side20 = 1.0;
private double Side30 = 1.0;
private double area;
public Triangle() {}




public Triangle(double Side1, double Side2, double Side3) {
 this.Side10 = Side1;
 this.Side20 = Side2;
 this.Side30 = Side3;
 double s = (Side10 + Side20 + Side30) / 2.0;
 this.area = Math.sqrt(s*(s-Side10)*(s-Side20)*(s-Side30));
}


double getPerimiter() {
    return Side10 + Side20 + Side30;
}

String ToString() {
return "Triangle: Side1 = " + Side10 + " + Side2 " + Side20 + " + Side3 " + Side30;
}

double getArea() {
    
    return area;
}
}

