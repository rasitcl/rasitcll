package Java_Dersleri1;

public class Car {
    // Fiels, properties
  private String color;
    private   String model;
    private  double engine;
    private int doors;
   public Car(String color,String model){
       this(color,model,0,0);
   }
    public Car(){
        //this.color = "Bilgi Yok";
        //this.model = "Bilgi Yok";
        //this.engine = 0;
        //this.doors = 0;
        this("Bilgi Yok","Bilgi Yok",0,0);
    }
    public Car(String color, String model, double engine, int doors){
        this.color = color;
        this.model = model;
        this.engine = engine;
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public void setDoors(int doors) {
        if (doors ==2 || doors == 4) {
            this.doors = doors;
        }else {
            System.out.println("Kapı sayısı sadece 2 veya 4 olabilir.");
        }
    }

    public void setColor(String color) {
    this.color = color;
}
public String getColor() {
    return this.color;
}
public void start(){
    System.out.println("Araba Çalıştı...");
}
public void stop(){
    System.out.println("Araba Durdu...");
}
public void showInfos(){
    System.out.println("Arabanın Rengi: " + this.color);
    System.out.println("Arabanın Modeli: " + this.model);
    System.out.println("Arabanın Motor Hacmi: " + this.engine);
    System.out.println("Arabanın Kapı Sayısı: " + this.doors);

}
}
