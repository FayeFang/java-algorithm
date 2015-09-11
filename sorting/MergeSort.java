// Divide the unsorted array into n partitions, each partition contains 1 element.
// Repeatedly merge partitioned units to produce new sublists until there is only
// 1 sublist remaining. This will be the sorted list at the end.

// Merge sort is a fast and stable sorting routine with guaranteed O(lgn * n) efficiency.
// When sorting arrays, merge sort requires additional scrath space proportional to the
// size of the input array. Merge sort is relatively simple to code and offeres performance
// typically only slightly below that of quicksort.

class MergeSort {

  private int[] array;
  private int[] tmpArray;
  private int length;

  public static void main(String[] args) {

    int[] array = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
    MergeSort m = new MergeSort();
    m.sort(array);
    printArray(array);
  }

  public void sort( int[] array ) {
    this.array = array;
    this.length = array.length;
    this.tmpArray = new int[length];
    mergeSort(0, length - 1);
  }

  private void mergeSort (int start, int end) {
    if (start < end) {
      int mid = (start + end) / 2;
      mergeSort(start, mid);
      mergeSort(mid+1, end);
      mergeParts(start, mid, end);
    }
  }

  private void mergeParts(int start, int mid, int end) {
    for (int i = start; i <= end; i++) {
      tmpArray[i] = array[i];
    }
    int i = start;
    int j = mid + 1;
    int k = start;

    while (i <= mid && j <= end) {
      if (tmpArray[i] <= tmpArray[j]) {
        array[k] = tmpArray[i];
        i++;
      } else {
        array[k] = tmpArray[j];
        j++;
      }
      k++;
    }
    while (i <= mid) {
      array[k] = tmpArray[i];
      k++;
      i++;
    }
  }

  private static void printArray(int[] input) {
    for (int i = 0; i < input.length - 1; i++) {
        System.out.print(input[i] + ", ");
    }
    System.out.println(input[input.length-1]);
  }
}

