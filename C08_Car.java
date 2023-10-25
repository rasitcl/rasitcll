package Java_Dersleri1;

public class C08_Car {
   private String color;
   private String model;
   private double engine;
   private int doors;

   public void setColor(String color) {
       this.color = color;
   }
    public String getColor(){
       return this.color;
}
public void setDoors(int doors){
       if (doors == 2 || doors == 4){
           this.doors=doors;
       }else {
           System.out.println("Kapı sayısı sadece 2 veya 4 olsun.");
       }
}
}
