package day10_methodOluşturma;

public class C05_AsalSayıMıDöndür {
    public static void main(String[] args) {

        // Verilen pozitif bir tamsayının
        // asal sayı olup olmadığını kontrol edip
        // asal ise true, asal değilse false döndüren
        // bir method oluşturun

    asalMıDöndür(45);
        System.out.println(asalMıDöndür(43));

    }

public static boolean asalMıDöndür(int sayı){

        boolean flag = true;
    for (int i = 2; i < sayı; i++) {
        if (sayı % i == 0) {
            flag = false;
            break;
        }
    }
return flag;

    }


}
