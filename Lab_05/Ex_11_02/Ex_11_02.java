/*
Programming Exercise 11.2 p.445
 */
package ex_11_02;

public class Ex_11_02 {

    public static void main(String[] args) {

        Person person = new Person("A", "Bangkok", "0998887776", "59019999@kmitl.ac.th");
        Student student = new Student("B", "Chiang Mai", "0998886274", "59018888@kmitl.ac.th", "freshman");
        Employee employee = new Employee("C", "Phuket", "0998880341", "59017777@kmitl.ac.th", "Network Lab", 12000.0);
        Faculty faculty = new Faculty("D", "Korat", "0998889402", "59016666@kmitl.ac.th", "KMITL Computer Faculty", 25000.0, "10.00-16.00", "Trainee");
        Staff staff = new Staff("E", "Ubon", "0998880341", "59015555@kmitl.ac.th", "KMITL Computer Faculty", 18000.0, "Title");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
