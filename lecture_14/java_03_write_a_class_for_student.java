
class Student {
    public int roll;
    public String name;
    public String course;
    public int m1;
    public int m2;
    public int m3;

    public int total() {
        return m1 + m2 + m3;
    }

    public int average() {
        return (total()) / 3;
    }

    public char grade() {
        int ans = average();
        if (ans > 90) {
            return 'A';
        } else if (ans < 90 && ans > 80) {
            return 'B';
        } else if (ans < 80 && ans > 70) {
            return 'C';
        } else if (ans < 70 && ans > 60) {
            return 'D';
        }
        return 'F';
    }

}

public class java_03_write_a_class_for_student {
    public static void main(String[] args) {
        Student st = new Student();
        st.roll = 1000;
        st.course="PCM";
        st.name="Yash Maheswari";
        st.m1=100;
        st.m2=20;
        st.m3=100;

        System.out.println("The total is: "+st.total());

        System.out.println("The average is: "+st.average());

        System.out.println("The grade is: "+st.grade());


    }
}
