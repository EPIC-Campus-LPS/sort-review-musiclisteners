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

    public static int[] mergeSort(int[] array) {

        return mergeSorter(array, 0, array.length);

    }

    static int[] mergeSorter(int[] array, int left, int right) {



    }

    static int[] merge(int[] lArr, int[] rArr) {



        int lLen = lArr.length;
        int rLen = rArr.length;

        int[] newArr = new int[lLen + rLen];
        for (int i = 0; i < lLen; i++) {



        }


    }

    public static void main(String[] args) {



    }

}
