
class Subject {
    private int subId;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public int getSubId() {
        return subId;
    }

    public String getName() {
        return name;
    }

    public int getmaxMarks() {
        return maxMarks;
    }

    public int marksObtain() {
        return marksObtain;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public void setMarksObtain(int marksObtain) {
        this.marksObtain = marksObtain;
    }

    public Subject(int subId, String name, int maxMarks, int marksObtain) {
        this.name = name;
        this.marksObtain = marksObtain;
        this.maxMarks = maxMarks;
        this.subId = subId;
    }

    public String toString(int subId, String name, int maxMarks, int marksObtain) {
        return "\nsubId: " + subId + "\nname: " +name+"\nmaxMarks: "+maxMarks+ "\nmarksObtain: " + marksObtain;
    }
}

public class java_06_array_of_object_challenge {
    public static void main(String[] args) {
        Subject st[] = new Subject[3];
        st[0] = new Subject(10, "maths", 100, 30);
        st[1] = new Subject(11, "physics", 50, 70);
        st[2] = new Subject(12, "chemistry", 20, 100);

        for (Subject x : st) {
            System.out.println(x);
        }
    }

}