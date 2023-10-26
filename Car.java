package Java_Dersleri04;

public class Car {
    private String color;

    private String model;

    private double engine;

    private int doors;

    private String packet;

    private double price;

    public Car (String color, String model , double engine, int doors, double price, String packet){
        this.color=color;
        this.engine=engine;
        this.packet=packet;
        this.model=model;
        this.doors=doors;
        this.price=price;
    }


    public void showInfos() {
        System.out.println("Arabanın Rengi : " + this.color);
        System.out.println("Arabanın Kapı Sayısı : " + this.doors);
        System.out.println("Arabanın Motoru : " + this.engine);
        System.out.println("Arabanın Modeli : " + this.model);
        System.out.println("Arabanın Paketi : " + this.packet);
        System.out.println("Arabanın Fiyatı : " + this.price);
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {

        if (doors == 2 || doors == 4){
            System.out.println();
            this.doors = doors;
        }else {
            System.out.println("Kapı sayısı en az 2, en fazla 4 olabilir.");
        }



    }

    public String getPacket() {
        return packet;
    }

    public void setPacket(String packet) {
        this.packet = packet;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

