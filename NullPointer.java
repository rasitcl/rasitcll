package Day07_StringManipulations;

public class NullPointer {
    public static void main(String[] args) {
        String str;
        //System.out.println(str);
        // Java'da main method içerisinde değer atamadan bir variable oluşturabiliriz
        // ANCAK değer atamadan kullanamayız

        String str2 = "";
        System.out.println(str2); // hiçlik yazdırır
        // str2'yi kullanabilmek için hiçlik değeri atayabiliriz
        // Ancak hiçlik değeri atanan variable'ları
        // Java değer atanmamış olarak sınıflandırmaz
        // değer atananlar grubuna koyar

        /*
        java değerf atanmamış variable'ları işaretlemek için
        özel olarak null keyword'unu oluşturmuştur.

        Aşağıdaki örnekte
        str4'e hiçlik değeri atanmıştır
        str5'e Tava değeri atanmıştır
        str3 ise null olarak İŞARETLENMİŞTİR

        null bir değer değil İŞARETCİDİR
        str3'ün oluşturulduğunu ve bir değer atanana kadar
        bu şekilde kullanılmak istendiğini Java'ya söyler

        null olarak işaretlenen bir String'i
        yazdırabilirsiniz
        ama kullanamazsınız

         */

        //String str3 = true;
        //String str3 = 45;
        //String str3 = 'f';
        String str3 = null;
        String str4 = "";
        String str5 = "Tava";
        System.out.println(str3);

        //System.out.println(str3.isBlank()); //NullPointerException
        //System.out.println(str3.substring(0,1)); //NullPointerException
        //System.out.println(str3.charAt(0)); //NullPointerException
        //System.out.println(str3.isEmpty()); //NullPointerException

        System.out.println(str3==null);
    }
}
