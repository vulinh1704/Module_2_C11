public class Demo {

    public static void main(String[] args) {
//        int[] arr = {1, 5, 8, 2, 4};
//        int K = 18;
//        System.out.println(linearSearch(arr, K));

        int[] arr = {1, 3, 4, 5, 6, 7, 9, 10};
        int K = 12;
        System.out.println(binarySearch(arr, K));
    }



    public static int binarySearch(int[] arr, int K) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == K) {
                return mid;
            } else if (K > arr[mid]) {
                left = mid + 1;
            } else if (K < arr[mid]) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] arr, int K) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == K) {
                return i;
            }
        }
        return -1;
    }
}
