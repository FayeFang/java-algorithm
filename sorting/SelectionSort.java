// search and sort. Find and place to the right index

class SelectionSort {
  public static void main(String[] args) {

    int[] array = { 4, 2, 9, 6, 23, 12, 34, 0, 100};
    selectionSort(array);
    printArray(array);
  }

  public static void selectionSort(int[] array) {
    for ( int i = 0; i < array.length - 1; i++ ) {
      int index = i;
      for ( int j = i + 1; j < array.length; j++ ) {
        if ( array[j] < array[i]) {
          index = j;
        }
      }
      swap(i, index, array);
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
