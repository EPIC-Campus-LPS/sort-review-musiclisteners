/**********
 *
 * @author Nathan Hoehndorf and Kellyn Hartzler
 * @since 1.0 - September 20, 2023
 *
 */
public class TimingTester {

    public static void main(String[] args) {

        //smallBubble(); // -
        //mediumBubble();// -
        //largeBubble(); // -- Runs Bubble Sort tester

        //smallSelection(); // -
        //mediumSelection();// -
        //largeSelection(); // -- Runs Selection Sort tester

        //smallInsertion(); // -
        //mediumInsertion();// -
        //largeInsertion(); // - Runs Insertion Sort tester

        //smallMergeSort(); // -
        //mediumMergeSort();// -
        //largeMergeSort(); // -- Runs Merge Sort tester

    }

    /**
     *
     * Runs Bubble sort on a small array
     *
     */
    public static void smallBubble() {

        int[] arraySmall = new int[100];
        for (int i = arraySmall.length-1; i >= 0; i--) {
            arraySmall[i] = i;
        }
        System.out.println(System.currentTimeMillis());
        QuadSorts.bubbleSort(arraySmall);
        System.out.println(System.currentTimeMillis());

    }

    /**
     *
     * Runs Bubble sort on a medium-sized array
     *
     */
    public static void mediumBubble() {

        int[] arrayMedium = new int[100000000];
        for (int j = arrayMedium.length-1; j >= 0; j--) {
            arrayMedium[j] = j;
        }
        System.out.println(System.currentTimeMillis());
        QuadSorts.bubbleSort(arrayMedium);
        System.out.println(System.currentTimeMillis());

    }

    /**
     *
     * Runs Bubble sort on a large array
     *
     */
    public static void largeBubble() {

        int[] arrayLarge = new int[2000000000];
        for (int k = arrayLarge.length-1; k >= 0; k--) {
            arrayLarge[k] = k;
        }
        System.out.println(System.currentTimeMillis());
        QuadSorts.bubbleSort(arrayLarge);
        System.out.println(System.currentTimeMillis());

    }

    /**
     *
     * Runs a Selection sort on a small array
     *
     */
    public static void smallSelection() {

        int[] arraySmall = new int[100];
        for (int i = arraySmall.length-1; i >= 0; i--) {
            arraySmall[i] = i;
        }
        System.out.println(System.currentTimeMillis());
        QuadSorts.selectionSort(arraySmall);
        System.out.println(System.currentTimeMillis());

    }

    /**
     *
     * Runs a Selection sort on a medium-sized array
     *
     */
    public static void mediumSelection() {

        int[] arrayMedium = new int[100000];
        for (int j = arrayMedium.length-1; j >= 0; j--) {
            arrayMedium[j] = j;
        }
        System.out.println(System.currentTimeMillis());
        QuadSorts.selectionSort(arrayMedium);
        System.out.println(System.currentTimeMillis());

    }

    /**
     *
     * Runs a Selection sort on a large array
     *
     */
    public static void largeSelection() {

        int[] arrayMedium = new int[1000000];
        for (int j = arrayMedium.length-1; j >= 0; j--) {
            arrayMedium[j] = j;
        }
        System.out.println(System.currentTimeMillis());
        QuadSorts.selectionSort(arrayMedium);
        System.out.println(System.currentTimeMillis());

    }

    /**
     *
     * Runs an Insertion sort on a small array
     *
     */
    public static void smallInsertion() {

        int[] arraySmall = new int[100];
        for (int i = arraySmall.length-1; i >= 0; i--) {
            arraySmall[i] = i;
        }
        System.out.println(System.currentTimeMillis());
        QuadSorts.insertionSort(arraySmall);
        System.out.println(System.currentTimeMillis());

    }

    /**
     *
     * Runs an Insertion sort on a medium-sized array
     *
     */
    public static void mediumInsertion() {

        int[] arraySmall = new int[1000000];
        for (int i = arraySmall.length-1; i >= 0; i--) {
            arraySmall[i] = i;
        }
        System.out.println(System.currentTimeMillis());
        QuadSorts.insertionSort(arraySmall);
        System.out.println(System.currentTimeMillis());

    }

    /**
     *
     * Runs an Insertion sort on a large array
     *
     */
    public static void largeInsertion() {

        int[] arraySmall = new int[1000000000];
        for (int i = arraySmall.length-1; i >= 0; i--) {
            arraySmall[i] = i;
        }
        System.out.println(System.currentTimeMillis());
        QuadSorts.insertionSort(arraySmall);
        System.out.println(System.currentTimeMillis());

    }

    /**
     *
     * Runs a Merge Sort on a small array
     *
     */
    public static void smallMergeSort() {

        int[] arraySmall = new int[100];
        for (int i = arraySmall.length-1; i >= 0; i--) {
            arraySmall[i] = i;
        }
        System.out.println(System.currentTimeMillis());
        QuadSorts.mergeSort(arraySmall);
        System.out.println(System.currentTimeMillis());

    }

    /**
     *
     * Runs a Merge Sort on a medium-sized array
     *
     */
    public static void mediumMergeSort() {

        int[] arraySmall = new int[1000000];
        for (int i = arraySmall.length-1; i >= 0; i--) {
            arraySmall[i] = i;
        }
        System.out.println(System.currentTimeMillis());
        QuadSorts.mergeSort(arraySmall);
        System.out.println(System.currentTimeMillis());

    }

    /**
     *
     * Runs a Merge Sort in a large array
     *
     */
    public static void largeMergeSort() {

        int[] arraySmall = new int[100000000];
        for (int i = arraySmall.length-1; i >= 0; i--) {
            arraySmall[i] = i;
        }
        System.out.println(System.currentTimeMillis());
        QuadSorts.mergeSort(arraySmall);
        System.out.println(System.currentTimeMillis());

    }

}
