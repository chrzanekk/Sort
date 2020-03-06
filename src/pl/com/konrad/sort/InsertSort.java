package pl.com.konrad.sort;

public class InsertSort {
    public int[] insertSort(int[] listToSort) {
        int loopIterator = 1;
        int tempSwap = 0;
        while (loopIterator < listToSort.length) {
            int j = loopIterator;
            while (j > 0 && listToSort[j - 1] > listToSort[j]) {
                tempSwap = listToSort[j - 1];
                listToSort[j - 1] = listToSort[j];
                listToSort[j] = tempSwap;
                j--;
            }
            loopIterator++;
        }
        return listToSort;
    }
}
