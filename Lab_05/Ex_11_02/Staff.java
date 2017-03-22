package Ex_11_02;

public class Staff extends Employee {

    private String title;

    public Staff(String name, String address, String phone, String email, String office, double salary, String title) {
        super(name, address, phone, email, office, salary);
        this.title = title;
    }

    public String toString() {
        return super.toString() + "Title " + title + "\n";
    }
}
