package ru.learning;

public class BinarySearch {

   public int search(int[]arr, int num) {
       int low = 0;
       int high = arr.length - 1;

       while (low <= high) {
           int mid = (low + high) / 2;
           if (arr[mid] == num) {
               return mid;
           } else if (arr[mid] > num) {
               high = mid -1;
           } else {
               low = mid + 1;
           }
       }
       return -1;
   }

}
