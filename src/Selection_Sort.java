import java.util.Arrays;

public class Selection_Sort {

    public static void main(String[] args) {

        int[] arr = { 50, 40, 30, 20, 10 };

        print(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int min_idx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            int tmp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = tmp;
        }

        print(Arrays.toString(arr));

    }

    public static void print(Object o) {
        System.out.println(o);
    }

}
