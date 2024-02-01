package Interfaces_in_java;

interface member {
    void callback();
}

class store {
    member mem[] = new member[100];
    int cnt = 0;

    void register(member m) {
        mem[cnt++] = m;
    }

    void invite_sale() {
        for (int i = 0; i < cnt; i++) {
            mem[i].callback();
        }
    }
}

class customer implements member {
    String name;

    customer(String name) {
        this.name = name;
    }

    public void callback() {
        System.out.println("Okay I will visit. " + name);
    }
}

public class Student_challenge_callback_method {
    public static void main(String[] args) {
        store s = new store();
        customer s1 = new customer("Shravni");
        customer s2 = new customer("Harish");
        s.register(s1);
        s.register(s2);
        s.invite_sale();
    }
}
