// 1.


// class Subject {
//     private int subId;
//     private String name;
//     private int maxMarks;
//     private int marksObtain;

//     public int getSubId() {
//         return subId;
//     }

//     public String getName() {
//         return name;
//     }

//     public int getmaxMarks() {
//         return maxMarks;
//     }

//     public int marksObtain() {
//         return marksObtain;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public void setMaxMarks(int maxMarks) {
//         this.maxMarks = maxMarks;
//     }

//     public void setMarksObtain(int marksObtain) {
//         this.marksObtain = marksObtain;
//     }

//     public Subject(int subId, String name, int maxMarks, int marksObtain) {
//         this.name = name;
//         this.marksObtain = marksObtain;
//         this.maxMarks = maxMarks;
//         this.subId = subId;
//     }

//     public String toString() {
//         return "\nsubId: " +subId+"\nname: "+name+"\nmaxMarks: "+maxMarks+ "\nmarksObtain: " +marksObtain;
//     }
// }

// public class java_06_array_of_object_challenge {
//     public static void main(String[] args) {
//         Subject st[] = new Subject[3];
//         st[0] = new Subject(10, "maths", 100, 30);
//         st[1] = new Subject(11, "physics", 50, 70);
//         st[2] = new Subject(12, "chemistry", 20, 100);

//         for (Subject x : st) {
//             System.out.println(x);
//         }
//     }

// }




// 2. student

class Student {
    private int rollNo;
    private String name;
    private String dept;
    private String[] subject;

    // 🔹 Default Constructor
    public Student() {
        rollNo = 0;
        name = "";
        dept = "";
        subject = new String[0];
    }

    // 🔹 Parameterized Constructor
    public Student(int rollNo, String name, String dept, String[] subject) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        this.subject = subject;
    }

    // 🔹 Setters
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    // 🔹 Getters
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String[] getSubject() {
        return subject;
    }
}

public class java_06_array_of_object_challenge {

    public static void main(String[] args) {

        // 🔹 Array of Student objects
        Student[] students = new Student[2];

        // Using parameterized constructor
        students[0] = new Student(
                1,
                "Yash",
                "CSE",
                new String[]{"Java", "DSA", "OS"}
        );

        // Using default constructor + setters
        students[1] = new Student();
        students[1].setRollNo(2);
        students[1].setName("Aman");
        students[1].setDept("ECE");
        students[1].setSubject(new String[]{"Python", "Networks"});

        // 🔹 Display student details
        for (Student s : students) {
            System.out.println("Roll No: " + s.getRollNo());
            System.out.println("Name: " + s.getName());
            System.out.println("Department: " + s.getDept());
            System.out.print("Subjects: ");
            for (String sub : s.getSubject()) {
                System.out.print(sub + " ");
            }
            System.out.println("\n-------------------");
        }
    }
}
