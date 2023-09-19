public class QuadSorts {

    public static void bubbleSort(int[] array) {

        boolean solved = false;
        while (!solved) {

            for (int i = 0;i < array.length-1; i++) {

                if (array[i] > array[i+1]) {

                    solved = false;
                    break;

                } else {

                    solved = true;

                }

            }

            if (!solved) {

                for (int j = 0; j < array.length-1; j++) {

                    if (array[j] > array[j+1]) {

                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;

                    }

                }

            }

        }

    }

    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length-1; i++) {

            int small = array[i];
            int place = i;
            for (int j = i+1; j < array.length; j++) {

                if (array[j] < small) {

                    small = array[j];
                    place = j;

                }

            }

            if (small == array[i]) {

                continue;

            }
            array[place] = array[i];
            array[i] = small;

        }

    }

    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {

            int k = array[i];
            int j = i-1;

            while (j >= 0 && array[j] > k) {

                array[j+1] = array[j];
                j--;

            }
            array[j+1] = k;
        }

    }

    public static void mergeSort(int[] array) {

        mergeSorter(array, 0, array.length);

    }

    /**
     * copied from geeksforgeeks
     * @param arr
     * @param l
     * @param r
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
     * @param arr
     * @param l
     * @param m
     * @param r
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




    /*
     * static void mergeSorter(int[] array, int left, int right) {
     *
     *
     *         if (left < right) {
     *             int mid = (left + right) / 2;
     *
     *             mergeSorter(array, left, mid);
     *             mergeSorter(array, mid+1, right);
     *
     *             merge(array, left, mid, right);
     *
     *         }
     *
     *     }
     *
     *     static void merge(int[] array, int left, int mid, int right) {
     *
     *         int[] leftArr = new int[mid-left+1];
     *         int[] rightArr = new int[right-mid];
     *
     *         for (int i = 0; i < leftArr.length; i++) {
     *             leftArr[i] = array[left+i];
     *
     *         }
     *         for (int j = 0; j < rightArr.length-mid; j++) {
     *             rightArr[j] = array[mid+j+1];
     *         }
     *
     *         int i = 0;
     *         int j = 0;
     *         int k = mid;
     *
     *         while (i < leftArr.length && j < rightArr.length) {
     *
     *             if (leftArr[i] <= rightArr[j]) {
     *
     *                 array[k] = leftArr[i];
     *                 i++;
     *
     *             } else {
     *
     *                 array[k] = rightArr[j];
     *                 j++;
     *
     *             }
     *
     *             k++;
     *
     *         }
     *
     *         while (i < leftArr.length) {
     *
     *             array[k] = leftArr[i];
     *             i++;
     *             k++;
     *
     *         }
     *
     *         while (j < rightArr.length) { //fix off by one with midpoint and total array
     *
     *             array[k] = rightArr[j];
     *             j++;
     *             k++;
     *
     *         }
     *
     *     }
     */


}
