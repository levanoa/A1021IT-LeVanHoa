package Loop_java.Bai_tap;

public class Drawing {
    public static void main(String[] args) {
        //1 Hình chữ nhật
        for ( int j =0; j<3; j ++) {
            for (int i = 0; i<7;i++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
        System.out.println("------------");

        for ( int j =1; j<=7; j ++) {
            for (int i = 0; i < j; i++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }

        System.out.println("------------");

        for ( int i=7;i>=1;i--) {
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }


    }
}
