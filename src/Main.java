
public class Main {

    public static void main(String[] args) {

        int[] arr = {6, 5, 3, 2, 8, 7, 2, 4, 1};

        System.out.print("Array before sort: ");
        for (int item : arr) {
            System.out.print(item);
            System.out.print(" ");
        }


        for (int i = 0; i < arr.length; i++) {

            if (i + 1 >= arr.length) {
                break;
            }

            if (arr[i] > arr[i + 1]) {

                for (int j = i; j >= 0; j--) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        System.out.println();
        System.out.print("Array after sort: ");
        for (int item : arr) {
            System.out.print(item);
            System.out.print(" ");
        }
    }
}
