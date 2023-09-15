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

    static void mergeSorter(int[] array, int left, int right) {


        if (left < right) {
            int mid = (left + right) / 2;

            mergeSorter(array, left, mid);
            mergeSorter(array, mid+1, right);

            merge(array, left, mid, right);

        }

    }

    static void merge(int[] array, int left, int mid, int right) {

        int[] leftArr = new int[mid-left+1];
        int[] rightArr = new int[right-mid];

        for (int i = 0; i < leftArr.length; i++) {
            leftArr[i] = array[left+i];

        }
        for (int j = 0; j < rightArr.length-mid; j++) {
            rightArr[j] = array[mid+j+1];
        }

        int i = 0;
        int j = 0;
        int k = mid;

        while (i < leftArr.length && j < rightArr.length) {

            if (leftArr[i] <= rightArr[j]) {

                array[k] = leftArr[i];
                i++;

            } else {

                array[k] = rightArr[j];
                j++;

            }

            k++;

        }

        while (i < leftArr.length) {

            array[k] = leftArr[i];
            i++;
            k++;

        }

        while (j < rightArr.length) { //fix off by one with midpoint and total array

            array[k] = rightArr[j];
            j++;
            k++;

        }

    }


}
