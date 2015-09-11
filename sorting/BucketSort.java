// search and sort. Maximum known and should be non-negative?

class BucketSort {
  public static void main(String[] args) {
    int[] array = {4, 2, 9, 6, 23, 12, 34, 0, 34, 100};
    bucketSort(array);
    printArray(array);
  }

  public static void bucketSort(int[] array) {
    int bucket = array.length;
    int[][] bucketArray = new int[bucket][];

    for (int i = 0; i < array.length; i++) {
      int index = array[i] / bucket;
      bucketArray[index]++;
    }

    int k = 0;

    for (int j = 0; j < bucket; j++) {
      int numberBucket = bucketArray[j];
      while (numberBucket > 0) {
        array[k] = j;
        numberBucket--;
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
