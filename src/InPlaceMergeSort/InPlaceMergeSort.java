package InPlaceMergeSort;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int array[] = {12, 11, 13, 5, 6, 7};
        int array_size = array.length;

        mergeSort(array, 0, array_size - 1);
        printArray(array, array_size);
    }

    static void merge (int arr[], int start, int mid, int end) {
        int start2 = mid + 1;

        if (arr[mid] <= arr[start2]) {
            return;
        }

        while (start <= mid && start2 <= end) {
            if (arr[start] <= arr[start2]) {
                start++;
            }else {
                int value = arr[start2];
                int index = start2;

                while (index != start) {
                    arr[index] = arr[index-1];
                    index--;
                }

                arr[start] = value;

                start++;
                mid++;
                start2++;
            }
        }
    }

    static void mergeSort(int arr[], int leftIndex, int rightIndex) {
       if(leftIndex < rightIndex) {
           int middle = leftIndex + (rightIndex - leftIndex) / 2;
           mergeSort(arr, leftIndex, middle);
           mergeSort(arr, middle + 1, rightIndex);

           merge(arr, leftIndex, middle, rightIndex);
       }
    }

    static void printArray(int arrayIndex[], int size) {
        int index;
        for (index = 0; index < size; index++) {
            System.out.println(arrayIndex[index] + " ");
        }
        System.out.println();
    }


}
