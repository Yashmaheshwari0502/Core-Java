class Whiteboard {
    private String text;
    private int noOfStudents = 0;
    private int count = 0;

    synchronized public void attendance() {
        noOfStudents++;
    }

    synchronized public void write(String t) {
        while (count != 0) {
            try {
                wait();
            } catch (Exception e) {}
        }

        text = t;
        count = noOfStudents;
        notifyAll();
    }

    synchronized public String read() {
        while (count == 0) {
            try {
                wait();
            } catch (Exception e) {}
        }

        String t = text;
        count--;

        if (count == 0) {
            notifyAll();
        }
        return t;
    }
}

class Teacher extends Thread {
    Whiteboard wb;
    String notes[] = { "java", "is", "good" };

    Teacher(Whiteboard w) {
        wb = w;
    }

    public void run() {
        for (String note : notes) {
            wb.write(note);
        }
    }
}

class Student extends Thread {
    Whiteboard wb;
    String name;

    Student(Whiteboard w, String n) {
        wb = w;
        name = n;
    }

    public void run() {
        wb.attendance();
        String t;

        do {
            t = wb.read();
            System.out.println(name + " reads " + t);
        } while (!t.equals("good"));
    }
}

public class Java08TeacherStudent {
    public static void main(String[] args) {
        Whiteboard wb = new Whiteboard();

        Student s1 = new Student(wb, "Yash");
        Student s2 = new Student(wb, "Ravi");
        Teacher t = new Teacher(wb);

        s1.start();
        s2.start();
        t.start();
    }
}
