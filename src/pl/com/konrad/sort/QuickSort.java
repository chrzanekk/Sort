package pl.com.konrad.sort;

public class QuickSort {
    public int[] quickSort(int[] listToSort, int leftIndex, int rightIndex) {
        int leftSide = leftIndex;
        int rightSide = rightIndex;
        int listBreakPointValue = listToSort[(leftSide + rightSide) / 2];
        do {
            while (listToSort[leftSide] < listBreakPointValue)
                leftSide++;
            while (listToSort[rightSide] > listBreakPointValue)
                rightSide--;
            if (leftSide<=rightSide) {
                int temp = listToSort[leftSide];
                listToSort[leftSide] = listToSort[rightSide];
                listToSort[rightSide] = temp;
                leftSide++;
                rightSide--;
            }
        }
        while (leftSide < rightSide);
        if (leftIndex<rightSide)
            quickSort(listToSort, leftIndex, rightSide);
        if (leftSide<rightIndex)
            quickSort(listToSort, leftSide,rightIndex);
        return listToSort;
    }
}
