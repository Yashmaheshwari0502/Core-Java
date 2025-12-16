class cylinder {
    public int raduis;
    public int height;

    public void lidArea() {
        System.out.println("The lidArea is: " + (Math.PI * raduis * raduis));
    }

    public void totalSurfaceArea() {
        System.out.println(
                "The totalSurfaceArea is: " + (2 * (Math.PI * raduis * raduis) + (2 * Math.PI * raduis * height)));
    }

    public void circumference() {
        System.out.println("The circumference is: " + (2 * Math.PI * raduis));
    }

    public void volume() {
        System.out.println("The volume is: " + (Math.PI * raduis * raduis * height));
    }
}

public class java_02_write_a_class_for_cylinder {
    public static void main(String[] args) {
        cylinder c1 = new cylinder();
        c1.height = 10;
        c1.raduis = 20;
        c1.lidArea();
        c1.circumference();
        c1.totalSurfaceArea();
        c1.volume();
    }
}
