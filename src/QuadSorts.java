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



    }

    public static void insertionSort(int[] array) {



    }

    public static void mergeSort(int[] array) {



    }

}
