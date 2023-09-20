/**********
 *
 * @author Nathan Hoehndorf and Kellyn Hartzler
 * @version 1.0  -- 09/19/2023
 * @see SortingTester
 *
 *********/

public class QuadSorts {

    /**
     * @param array - an integer array to be sorted
     */
    public static void bubbleSort(int[] array) {

        boolean solved = false; // variable for while loop
        while (!solved) { // checks that array is not sorted -- continues to sort

            for (int i = 0; i < array.length - 1; i++) { // traverses through whole array

                if (array[i] > array[i + 1]) { // if the value is bigger than the following value

                    solved = false; // keep looping
                    break; // restart the while loop

                } else {

                    solved = true; // the array is sorted

                }

            }

            if (!solved) { // needed since the loop above can cause problems

                for (int j = 0; j < array.length - 1; j++) { // traverses through whole array

                    if (array[j] > array[j + 1]) { // checks what was checked in the for loop

                        int temp = array[j];     // switches
                        array[j] = array[j + 1]; // the
                        array[j + 1] = temp;     // values

                    }

                }

            }

        }

    }

    /**
     * @param array - an integer array to be sorted
     */
    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) { // traverses array

            int small = array[i]; // makes a placeholder smallest value -- if already sorted, creates a better scenario
            int place = i; // active index
            for (int j = i + 1; j < array.length; j++) { // checks every value after the current value

                if (array[j] < small) { // checks if the current value is the current smallest

                    small = array[j]; //
                    place = j;        // updates placeholder variables

                }

            }

            if (small == array[i]) { // in case they're equal, move on to next iteration

                continue;

            }
            array[place] = array[i]; // switches
            array[i] = small;        // places

        }

    }

    /**
     * @param array - an integer array to be sorted
     */
    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) { // traverses through whole array

            int k = array[i]; // current value
            int j = i - 1; // previous index

            while (j >= 0 && array[j] > k) { // checks that end of array has not been reached and that current value is greater than placeholder

                array[j + 1] = array[j]; // moves up array
                j--; // decrements

            }
            array[j + 1] = k; // fills in "empty" space
        }

    }

    /**
     * @param array - an integer array to be sorted
     */
    public static void mergeSort(int[] array) {

        mergeSorter(array, 0, array.length-1); // calls mergeSorter() method with correct amount of arguments

    }

    /**
     * copied from geeksforgeeks
     *
     * @param arr - an integer array to be sorted
     * @param l   - the left index of the array to be used
     * @param r   - the right index of the array to be used
     */
    static void mergeSorter(int[] arr, int l, int r) {

        if (l < r) {

            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            mergeSorter(arr, l, m);
            mergeSorter(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }

    }


    /**
     * copied from geeksforgeeks
     *
     * @param arr - an integer array to be sorted
     * @param l   - the left index of the array to merge back up
     * @param m   - the right middle index of the array to split the array into two
     * @param r   - the right index of the array to merge back up
     */
    static void merge(int arr[], int l, int m, int r) {

        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }


}
