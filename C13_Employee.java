package Java_Dersleri1;

public class C13_Employee {
    private String name;
    private String department;
    private int salary;
    public C13_Employee(String name, String department, int salary){

        this.name = name;
        this.department = department;
        this.salary = salary;
    }
public void showInfos(){
    System.out.println("Bilgiler...");
    System.out.println("İsim: " + this.name);
    System.out.println("Departman: " + this.department);
    System.out.println("Maaş: " + this.salary);
}

}
