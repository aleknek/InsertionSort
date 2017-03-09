
public class Main {                     //main function

    public static void main(String[] args) {

        int[] arr = {6, 5, 3, 2, 8, 7, 2, 4, 1};    //array of numbers

        System.out.print("Array before sort: ");    //print statement indicating before sort
        for (int item : arr) {                      //traverses array
            System.out.print(item);
            System.out.print(" ");
        }


        for (int i = 0; i < arr.length; i++) {     //sorts array by insertion sort

            if (i + 1 >= arr.length) {             //It operates by beginning at the end of the sequence and 
                break;                             //shifting each element one place to the right until a suitable position is found for the new element. 
            }

            if (arr[i] > arr[i + 1]) {
                                                    //To perform an insertion sort, begin at the left-most element of the array and 
                                                    //invoke Insert to insert each element encountered into its correct position.
                                                    //The ordered sequence into which the element is inserted is stored at the beginning
                                                    //of the array in the set of indices already examined. Each insertion overwrites a single value: the value being inserted
                for (int j = i; j >= 0; j--) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        System.out.println();                       //print statement after sorting
        System.out.print("Array after sort: ");
        for (int item : arr) {
            System.out.print(item);
            System.out.print(" ");
        }
    }
}
