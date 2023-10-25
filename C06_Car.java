package Java_Dersleri1;

public class C06_Car {
    private static C06_Car C06_Car;
    private String color;
    private String model;
    private double engine;
    private int doors;

    public static void main(String[] args) {
        C06_Car car1= new C06_Car() ;
        car1.color = "Gümüş";
        car1.model = "Megane";
        car1.engine = 1.6;
        car1.doors = 4;

        System.out.println("Arabanın rengi : " + car1.color);
        System.out.println("Arabanın modeli : " + car1.model);
        System.out.println("Arabanın motoru : " + car1.engine);
        System.out.println("Arabanın kapı sayısı : " + car1.doors);
    }
}
