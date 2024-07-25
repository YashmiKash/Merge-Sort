package mergeSort;
import java.util.Arrays;
public class Merge_Sort {

	    public static int[] mergeSort(int[] arr) {
	        if (arr.length <= 1) {
	            // Base case: array is already sorted
	            return arr;
	        }

	        // Split the array into two halves
	        int mid = arr.length / 2;
	        int[] left = Arrays.copyOfRange(arr, 0, mid);
	        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

	        // Recursively sort each half
	        left = mergeSort(left);
	        right = mergeSort(right);

	        // Merge the sorted halves
	        return merge(left, right);
	    }

	     
	    private static int[] merge(int[] left, int[] right) {
	        int[] result = new int[left.length + right.length];
	        int i = 0, j = 0, k = 0;

	        // Merge smaller elements first
	        while (i < left.length && j < right.length) {
	            if (left[i] <= right[j]) {
	                result[k++] = left[i++];
	            } else {
	                result[k++] = right[j++];
	            }
	        }

	        // Copy remaining elements, if any
	        while (i < left.length) {
	            result[k++] = left[i++];
	        }
	        while (j < right.length) {
	            result[k++] = right[j++];
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[] arr = {5, 2, 8, 3, 1, 6, 4};
	        int[] sortedArr = mergeSort(arr);
	        System.out.println(Arrays.toString(sortedArr));
	    }
	}


