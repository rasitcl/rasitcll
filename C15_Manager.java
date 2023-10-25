package Java_Dersleri1;

public class C15_Manager extends C13_Employee {
private int num_of_employess;
    public C15_Manager(String name, String department, int salary, int num_of_employess) {
        super(name, department, salary);
        this.num_of_employess = num_of_employess;
    }
public void raiseSalary(int amount){
    System.out.println("Çalışanlara " + amount + "tl zam yapıldı...");
}
}
