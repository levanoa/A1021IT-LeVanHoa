package array.Bai_tap;

public class Merge_arr {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int [] b = {5,6,7,8};
        int [] c = new int[8];
        int index = 0;
        for(int i = 0; i < a.length; i++) {
            c[index] = a[i];
            index ++;
        }
        for(int i = 0; i < b.length; i++) {
              c[index] = b[i];
              index ++;
            }

        for( int i = 0; i <c.length; i ++) {
            System.out.print(c[i] + " ");
        }
    }
}

