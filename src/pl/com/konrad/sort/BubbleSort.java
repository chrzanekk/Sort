package pl.com.konrad.sort;

public class BubbleSort {
    public int[] bubbleSort(int[] listToSort) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int j = 1; j < listToSort.length; j++) {
                int swapVariable;
                if (listToSort[j - 1] > listToSort[j]) {
                    swapVariable = listToSort[j - 1];
                    listToSort[j - 1] = listToSort[j];
                    listToSort[j] = swapVariable;
                    swapped = true;
                }
            }
        }
        return listToSort;
    }


}
