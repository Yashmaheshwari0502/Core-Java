
class Cylinder {
    private int raduis;
    private int height;

    public int getRaduis() {
        return raduis;
    }

    public int getHeight() {
        return height;
    }

    public void setRaduis(int raduis) {
        this.raduis = raduis;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setDimension(int raduis, int height) {
        this.raduis = raduis;
        this.height = height;
    }
    public Cylinder(){
        raduis=0;
        height=0;
    }
    public Cylinder(int raduis){
        this.raduis=raduis;
        height=1;

    }
    public Cylinder(int raduis,int height){
        this.raduis=raduis;
        this.height=height;
    }
}

public class java_04_cylinder {
public static void main(String[] args) {
    Cylinder c1=new Cylinder(10,20);
    
}
}
