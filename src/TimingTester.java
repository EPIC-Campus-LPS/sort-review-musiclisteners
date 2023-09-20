public class TimingTester {

    public static void main(String[] args) {

        //smallBubble();
        //mediumBubble();
        //largeBubble();

        //smallSelection();
        //mediumSelection();
        //largeSelection();

        //smallInsertion();
        //mediumInsertion();
        //largeInsertion();

        //smallMergeSort();
        //mediumMergeSort();
        largeMergeSort();

    }

    public static void smallBubble() {

        int[] arraySmall = new int[100];
        for (int i = arraySmall.length-1; i >= 0; i--) {
            arraySmall[i] = i;
        }
        System.out.println(System.currentTimeMillis());
        QuadSorts.bubbleSort(arraySmall);
        System.out.println(System.currentTimeMillis());

    }

    public static void mediumBubble() {

        int[] arrayMedium = new int[100000000];
        for (int j = arrayMedium.length-1; j >= 0; j--) {
            arrayMedium[j] = j;
        }
        System.out.println(System.currentTimeMillis());
        QuadSorts.bubbleSort(arrayMedium);
        System.out.println(System.currentTimeMillis());

    }

    public static void largeBubble() {

        int[] arrayLarge = new int[2000000000];
        for (int k = arrayLarge.length-1; k >= 0; k--) {
            arrayLarge[k] = k;
        }
        System.out.println(System.currentTimeMillis());
        QuadSorts.bubbleSort(arrayLarge);
        System.out.println(System.currentTimeMillis());

    }

    public static void smallSelection() {

        int[] arraySmall = new int[100];
        for (int i = arraySmall.length-1; i >= 0; i--) {
            arraySmall[i] = i;
        }
        System.out.println(System.currentTimeMillis());
        QuadSorts.selectionSort(arraySmall);
        System.out.println(System.currentTimeMillis());

    }

    public static void mediumSelection() {

        int[] arrayMedium = new int[100000];
        for (int j = arrayMedium.length-1; j >= 0; j--) {
            arrayMedium[j] = j;
        }
        System.out.println(System.currentTimeMillis());
        QuadSorts.selectionSort(arrayMedium);
        System.out.println(System.currentTimeMillis());

    }

    public static void largeSelection() {

        int[] arrayMedium = new int[1000000];
        for (int j = arrayMedium.length-1; j >= 0; j--) {
            arrayMedium[j] = j;
        }
        System.out.println(System.currentTimeMillis());
        QuadSorts.selectionSort(arrayMedium);
        System.out.println(System.currentTimeMillis());

    }

    public static void smallInsertion() {

        int[] arraySmall = new int[100];
        for (int i = arraySmall.length-1; i >= 0; i--) {
            arraySmall[i] = i;
        }
        System.out.println(System.currentTimeMillis());
        QuadSorts.insertionSort(arraySmall);
        System.out.println(System.currentTimeMillis());

    }

    public static void mediumInsertion() {

        int[] arraySmall = new int[1000000];
        for (int i = arraySmall.length-1; i >= 0; i--) {
            arraySmall[i] = i;
        }
        System.out.println(System.currentTimeMillis());
        QuadSorts.insertionSort(arraySmall);
        System.out.println(System.currentTimeMillis());

    }

    public static void largeInsertion() {

        int[] arraySmall = new int[1000000000];
        for (int i = arraySmall.length-1; i >= 0; i--) {
            arraySmall[i] = i;
        }
        System.out.println(System.currentTimeMillis());
        QuadSorts.insertionSort(arraySmall);
        System.out.println(System.currentTimeMillis());

    }

    public static void smallMergeSort() {

        int[] arraySmall = new int[100];
        for (int i = arraySmall.length-1; i >= 0; i--) {
            arraySmall[i] = i;
        }
        System.out.println(System.currentTimeMillis());
        QuadSorts.mergeSort(arraySmall);
        System.out.println(System.currentTimeMillis());

    }

    public static void mediumMergeSort() {

        int[] arraySmall = new int[1000000];
        for (int i = arraySmall.length-1; i >= 0; i--) {
            arraySmall[i] = i;
        }
        System.out.println(System.currentTimeMillis());
        QuadSorts.mergeSort(arraySmall);
        System.out.println(System.currentTimeMillis());

    }

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
