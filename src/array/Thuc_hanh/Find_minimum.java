package array.Thuc_hanh;

public class Find_minimum {
    public static void main(String[] args) {
        int [] arr = {5,4,1,0,77,5,2,1};
        int min = minValue(arr);
        System.out.println("Gía trị nhỏ nhất trong mảng là : " + min);

    }
    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i ++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        } return min;
    }
}
//public static void main(String[] args) {
//    int[] arr = {4, -12, 7, 8, 1, 6, 9};
//    int index = minValue(arr);
//    System.out.println("The smallest element in the array is: " + arr[index]);
//}
//
//    public static int minValue(int[] array) {
//        int index = 0;
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < array[index]) {
//                index = i;
//            }
//        }
//        return index;
//    }
//}
