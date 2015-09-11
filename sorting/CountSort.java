// search and sort. Maximum known and should be non-negative?

class CountSort {
  public static void main(String[] args) {

    int[] array = {4, 2, 9, 6, 23, 12, 34, 0, 34, 100};
    countSort(array, 101);
    printArray(array);
  }

  public static void countSort(int[] array, int count) {
    int[] countArray = new int[count];

    for (int i = 0; i < array.length; i++) {
      int index = array[i];
      countArray[index]++;
    }

    int k = 0;
    for (int j = 0; j < count; j++) {
      int numberCount = countArray[j];
      while (numberCount > 0) {
        array[k] = j;
        numberCount--;
        k++;
      }
    }

  }

  private static void printArray(int[] input) {
    for (int i = 0; i < input.length - 1; i++) {
        System.out.print(input[i] + ", ");
    }
    System.out.println(input[input.length-1]);
  }
}
