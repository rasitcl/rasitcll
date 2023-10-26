package Java_Dersleri04;

public class InheritanceBase {
    private String name;
    private String department;
    private int salary;

    public InheritanceBase(String name, String department, int salary) {

        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public void showInfos() {
        System.out.println("Bilgiler...");
        System.out.println("İsim : " + this.name);
        System.out.println("Department : " + this.department);
        System.out.println("Salary : " + this.salary);
    }
}
