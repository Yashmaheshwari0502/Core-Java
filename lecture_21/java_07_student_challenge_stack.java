class stackPushExtension extends Exception {
    public String toString() {
        return "Stack full";
    }
}

class stackPopExtension extends Exception {
    public String toString() {
        return "Stack empty";
    }
}

class stack {
    private int size;
    private int top = -1;
    private int s[];

    public stack(int size) {
        this.size = size;
        s = new int[size];
    }

    public void push(int value) throws stackPushExtension {
        if (top == size - 1) {
            throw new stackPushExtension();
        }
        top++;
        s[top] = value;
    }

    public int pop() throws stackPopExtension {
        if (top == -1) {
            throw new stackPopExtension();
        }
        int x = s[top];
        top--;
        return x;
    }
}

public class java_07_student_challenge_stack {
    public static void main(String[] args) {
        stack s1 = new stack(5);
        try {
            s1.push(10);
            s1.push(10);
            s1.push(10);
            s1.push(10);
            s1.push(10);
            
            
            s1.pop();

            s1.pop();
            s1.pop();
            s1.pop();
            s1.pop();
            s1.pop();
            s1.pop();s1.pop();
            s1.pop();

        } catch (Exception e) {
            System.out.println(e);
        }

        
    }
}
