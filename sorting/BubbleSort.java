// repeatedly sorting pairs.
// pair sorting

class BubbleSort {
  public static void main(String[] args) {

    int[] array = { 4, 2, 9, 6, 23, 12, 34, 0, 100};
    bubbleSort(array);
    printArray(array);
  }

  public static void bubbleSort(int[] array) {
    for ( int m = array.length - 1; m > 0; m-- ) {
      for ( int i = 0; i < array.length - 1; i++ ) {
        if ( array[i] > array[i + 1]) {
          swap(i, i + 1, array);
        }
      }
    }
  }

  private static void swap(int i, int j, int[] array) {
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
  }

  private static void printArray(int[] input) {
    for (int i = 0; i < input.length - 1; i++) {
        System.out.print(input[i] + ", ");
    }
    System.out.println(input[input.length-1]);
  }
}
