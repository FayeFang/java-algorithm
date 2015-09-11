//insert by defining a key into a sorted array starting
//from the end of the sorted array

class InsertionSort {
  public static void main(String[] args) {

    int[] array = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
    insertionSort(array);
    printArray(array);
  }

  public static void insertionSort ( int[] array) {
    for ( int i = 1; i < array.length; i++ ) {
      int key = array[i];
      int j = i - 1;
      while ( j >= 0 && array[j] > key ) {
        array[j+1] = array[j];
        j--;
      }
      array[j+1] = key;
    }
  }

  private static void printArray(int[] input) {
    for (int i = 0; i < input.length - 1; i++) {
        System.out.print(input[i] + ", ");
    }
    System.out.println(input[input.length-1]);
  }
}

