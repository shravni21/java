package Exception__handling;

class StackOverFlow extends Exception {
    public String toString() {
        return "Stack is full!";
    }
}

class StackUnderFlow extends Exception {
    public String toString() {
        return "Stack is empty!";
    }
}

class Stack {
    private int n;
    private int top = -1;
    private int arr[];

    public Stack(int n) {
        this.n = n;
        arr = new int[n];
    }

    public void push(int x) throws StackOverFlow {
        if (top == n - 1)
            throw new StackOverFlow();
        else
            arr[++top] = x;

    }

    public int pop() throws StackUnderFlow {
        int x = -1;
        if (top == -1)
            throw new StackUnderFlow();
        x = arr[top];
        top--;
        return x;
    }
}

public class User_define_exception {
    public static void main(String[] args) {
        Stack st = new Stack(5);
        try {
            st.push(10);
            st.push(15);
            st.push(13);
            st.push(89);
            st.push(100);
            st.push(19);
            st.pop();
            st.pop();
            st.pop();
            st.pop();
            st.pop();
        } catch (StackOverFlow e) {
            System.out.println(e);
        } catch (StackUnderFlow e) {
            System.out.println(e);
        }
    }
}
