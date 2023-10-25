package day09_ForLoopVeMethodOluşturma;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        // 1 , 2 ,3 , 4 yazdırın
        for ( int i = 1; i <= 4 ; i++ ){
            System.out.print(i + " ");
        }
        System.out.println("");
        // 2,4,6,8 yazdırın

        for ( int i = 1 ; i <= 4 ; ++i) {
            System.out.print(2 * i + " ");

            System.out.println("");
        }//3,6,9,12 yazdırın

        for ( int i = 1 ; i <= 4 ; ++i) {
            System.out.print(3*i + " ");}
        System.out.println("");


        for ( int i = 1 ; i <= 3 ; i ++){
            for (int j = 1 ; j <= 4  ; j ++){
                System.out.print(i * j + " ");
            }
        }
        System.out.println("");
    }

}
