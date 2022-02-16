package _14_ThuatToanSapXep.Thuc_Hanh.Thua_toan_noi_bot;

public class BubbleSort {
    static int[] list = {1,2,20,4,5,2,10};

    public static void bubbleSort(int[] list) {
        boolean needNextPass =  true;
        for(int k =1 ; k < list.length - k ; k ++) {
            needNextPass = false;
            for( int i = 0; i < list.length - k ; i++) {
                if(list[i] > list[i +1]) {
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;

                    needNextPass =true;
                }

            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for(int i = 0; i<list.length; i ++) {
            System.out.println(list[i] + " ");
        }
    }
}
