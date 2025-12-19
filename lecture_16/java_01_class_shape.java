
abstract class shape {
    abstract public double perimeter();

    abstract public double area();
}

class circle extends shape {
    double raduis;

    public circle(double raduis) {
        this.raduis = raduis;
    }

    public double perimeter() {
        return 2 * Math.PI * raduis;
    }

    public double area() {
        return Math.PI * raduis * raduis;
    }
}

class rectangle extends shape {
    double length;
    double breadth;

    public rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double perimeter() {
        return (2 * (length + breadth));
    }

    public double area() {
        return length * breadth;
    }
}

public class java_01_class_shape {
    public static void main(String[] args) {
        rectangle r = new rectangle(10, 10);
        System.out.println("area is: "+r.area());
    }
}
