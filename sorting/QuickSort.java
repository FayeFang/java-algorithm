// Divide and conquer.
// Partition the array into two by selecting a pivot point first.
// Recursively call quick sort to sort the two arrays

// The complexity of quick sort in the average case is O(lgn * n) and in the worst
// case is O(n^2)
class QuickSort {
  public static void main(String arg[]) {
    QuickSort q = new QuickSort();
    int[] array = {-1, 1, 2};
    System.out.println(quickSort( array, 0, array.length - 1 ));
  }

  public static int[] quickSort( int[] array, int start, int end ) {
    int pivot = array[end];
    int i, j;

    i = start - 1;

    for (j = start; j < end; j++) {
      if (array[j] < pivot) {
        i++;
        swap(array[i], array[j]);
      }
    }

    swap( array[i+1], array[end] );

    int partition = i+1;

    if ( start < partition - 1 ) {
      quickSort(array, start, partition - 1);
    }

    if ( partition > end ) {
      quickSort(array, partition, end);
    }
  }

  public void swap(int first, int second) {
      int tmp = first;
      first = second;
      second = tmp;
  }
}