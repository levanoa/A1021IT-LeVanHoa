package ss14_sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 14, 10, 19, 11, 5, 1};
        boolean swap = true;
        for (int i = 0; i < arr.length && swap; i++) {
            swap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int num : arr) {
            System.out.print(num + ", ");
        }
    }
}
