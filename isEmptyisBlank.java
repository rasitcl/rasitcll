package Day07_StringManipulations;

public class isEmptyisBlank {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "     ";
        String str3 = "Java";

        System.out.println(str2.isBlank()); // boşluk mu? Space'lerden mi oluşuyor
        System.out.println(str2.isEmpty()); // boş mu?

        System.out.println(str1.isEmpty());
        System.out.println(str1.isBlank());

        System.out.println(str3.isBlank());
        System.out.println(str3.isEmpty());
    }
}
