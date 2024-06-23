package ru.learning;

public class SelectionSort {

    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = maxValueIndex(arr, i);
            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }
        return arr;
    }

    private int maxValueIndex(int[] arr, int index) {
        int maxValue = arr[index];
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                index = i;
            }
        }
        return index;
    }

}
