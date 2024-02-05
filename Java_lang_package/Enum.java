package Java_lang_package;

enum dept {
    CS("John", "Block A"), IT("Pakle", "Block B"), MECH("Joshi", "Block C"), PROD("Bhanap", "Block D");

    String head;
    String location;

    private dept(String head, String location) {
        // System.out.println(this.name());
        this.head = head;
        this.location = location;
    }

    public String getheadname() {
        return head;
    }

    public String getlocation() {
        return location;
    }

}

public class Enum {
    public static void main(String[] args) {
        dept d = dept.CS;
        dept s = dept.IT;

        // Ordinal - give index
        // System.out.println(d.ordinal());

        // System.out.println(dept.valueOf("IT"));

        // list of values
        // dept list[] = dept.values();
        // for (int i = 0; i < list.length; i++) {
        // System.out.print(list[i] + " ");
        // }
        // System.out.println();

        // switch (s) {
        // case CS:
        // System.out.println("Computer Science");
        // break;
        // case IT:
        // System.out.println("Information Technology");
        // break;
        // case MECH:
        // System.out.println("Mechanical Engineering");
        // break;
        // case PROD:
        // System.out.println("Production Engineering");
        // break;

        // default:
        // break;
        // }

        System.out.println(d.getheadname());
        System.out.println(s.location);
    }
}
