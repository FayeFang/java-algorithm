//Merge two sorted arrays given the first one has enough memory.

class MergeArrays {
  public static void main(String[] args) {

    int[] arrayA = { 2, 4, 6, 9, 12, 15, 34, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] arrayB = { 1, 2, 5, 18};
    merge(arrayA, arrayB);
    printArray(arrayA);
  }

  public static void merge(int[] arrayA, int[] arrayB) {
    // last index of A, B and the merged array
    int i = 7;
    int j = arrayB.length - 1;
    int k = 7 + arrayB.length - 1;

    while ( i >= 0 && j >= 0 && k >= 0) {
      if (arrayA[i] >= arrayB[j]) {
        arrayA[k] = arrayA[i];
        i--;
      } else {
        arrayA[k] = arrayB[j];
        j--;
      }
      k--;
    }

    while (j >= 0 && k >=0) {
      arrayA[k] = arrayB[j];
      j--;
      k--;
    }
  }

  private static void printArray(int[] input) {
    for (int i = 0; i < input.length - 1; i++) {
        System.out.print(input[i] + ", ");
    }
    System.out.println(input[input.length-1]);
  }
}
