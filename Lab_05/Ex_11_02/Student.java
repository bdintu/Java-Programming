package Ex_11_02;

public class Student extends Person {

    private String status;

    public Student(String name, String address, String phone, String email, String status) {
        super(name, address, phone, email);
        this.status = status;
    }

    public String toString() {
        return super.toString() + "Status " + status + "\n";
    }
}
