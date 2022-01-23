package _4_class_object.Bai_tap.StopWatch;

public class Main {
    private static void selectionSort(double[] arr){
        int length= arr.length;
        for (int i = 0; i < length; i++) {
            int min_pos= i;
            for (int j = 0; j < length-i; j++) {
                if(arr[min_pos]> arr[j]) min_pos= j;
            }

            if(min_pos!= i){
                double tmp= arr[min_pos];
                arr[min_pos]= arr[i];
                arr[i]= tmp;
            }
        }
    }
    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        double[] arr = new double[100000];
        int length= arr.length;
        for (int i = 0; i < length; i++) {
            arr[i] = i;
//            System.out.println(arr[i]);
        }

        System.out.println("Array before sort");
//        System.out.println(arr.toString(arr));
        sw.start();
        selectionSort(arr);
        sw.stop();
        System.out.println("Array after sort");
//        System.out.println(arr.toString(arr));
        System.out.printf("Elapsed Time: %d ms.", sw.getElapsedTime());
    }
}
