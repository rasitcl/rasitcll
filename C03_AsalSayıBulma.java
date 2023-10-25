package day10_methodOluşturma;

public class C03_AsalSayıBulma {
    public static void main(String[] args) {

        // Verilen bir pozitif bir tamsayının ,
        // asal olup olmadığını kontrol edip asal
        // ise true, asal değilse false yazdıran
        // bir method oluşturun


   asalMıYazdır(45);
   asalMıYazdır(94513218);
   asalMıYazdır(5);
   asalMıYazdır(4546);
   asalMıYazdır(1);
   asalMıYazdır(97);

    }

    public static void asalMıYazdır(int sayı){

        boolean flag = true;

        for (int i = 2; i <sayı ; i++) {
            if (sayı % i==0){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }







}
