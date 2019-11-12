package demo;

public class Example1 {
    private static int[] arr1 = {1, -2, 4, -3, 9, 6, 7, 35, -23, 66, 235, -1, -2, 111};

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int j = 2000; j > 0; j--) {
            boolean flag = false;
            for (int i : insertionSort(arr1)) {
                if (flag) {
                    System.out.print(" -> ");
                }
                System.out.print(i);
                flag = true;
            }
        }
        System.out.print("\n"+(System.currentTimeMillis()  - start));

    }

    private static int[] insertionSort(int[] arr1) {
        for (int i = 1; i < arr1.length; i++) {
            int temp = arr1[i];
            int j = i - 1;
            while (j >= 0 && arr1[j] > temp) {
                arr1[j + 1] = arr1[j];
                j --;
            }
            arr1[j+1] = temp;
        }
        return arr1;
    }

    private static int[] choiceSort(int[] arr1) {
        for (int i = 0; i < arr1.length - 1; i++) {
            int key = i;
            for (int j = i; j < arr1.length; j++) {
                if (arr1[key] > arr1[j]) {
                    key = j;
                }
            }
            int temp = arr1[key];
            arr1[key] = arr1[i];
            arr1[i] = temp;
        }
        return arr1;
    }
}
