package Practice;

class Sports {
    String getName() {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }

}

class Soccer extends Sports {
    @Override
    String getName() {
        return "Soccer Class";
        // return super.getName();
    }

    @Override
    void getNumberOfTeamMembers() {
        // super.getNumberOfTeamMembers();
        System.out.println("Each team has 11 players in " + getName());
    }
}

public class Method_overloading {
    public static void main(String[] args) {
        Soccer s = new Soccer();
        Sports s1 = new Sports();
        System.out.println(s1.getName());
        s1.getNumberOfTeamMembers();
        System.out.println(s.getName());
        s.getNumberOfTeamMembers();
    }
}
