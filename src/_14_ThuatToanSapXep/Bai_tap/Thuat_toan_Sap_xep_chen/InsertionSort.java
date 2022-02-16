package _14_ThuatToanSapXep.Bai_tap.Thuat_toan_Sap_xep_chen;

public class InsertionSort {
    static int[] list = {12,44,2,5,6,2};

    public static void InsertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }

    }

    public static void main(String[] args) {
        InsertionSort(list);
        for(int i = 0 ; i< list.length; i ++) {
            System.out.println(list[i] + "\t");
        }
    }
}
