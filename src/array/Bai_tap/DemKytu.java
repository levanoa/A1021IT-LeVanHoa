package array.Bai_tap;

public class DemKytu {
    public static void main(String[] args) {
        String name = "LlLhahsdh";
        char kt = 'L';
        int count = 0;
        for(int i = 0 ; i <name.length(); i ++) {
            if( name.charAt(i) == kt) {
                count ++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự  " + "'" + kt + "'" + " là: " + count);
    }

}
