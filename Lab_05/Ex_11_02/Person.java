package Ex_11_02;

public class Person {

    private String name;
    private String address;
    private String phone;
    private String email;

    public Person() {
        this("", "", "", "");
    }

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name " + name + "\nAddress " + address + "\nPhone number " + phone + "\nEmail address " + email + "\n";
    }
}
