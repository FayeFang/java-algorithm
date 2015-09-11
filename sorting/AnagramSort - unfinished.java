// Write a method to sort an array of strings so that all the anagrams are next
// to each other

class AnagramSort {
  public static void main(String[] args) {

    int[] array = { 4, 2, 9, 6, 23, 12, 34, 0, 100};
    bubbleSort(array);
    printArray(array);
  }


  private static boolean isAnagram(String a, String b) {
    if (a.length() == b.length()) {
      char[] first = a.toCharArray();
      char[] second = b.toCharArray();
      boolean isAnagram = true;
    } else {
      return false;
    }
  }

  private static void printArray(int[] input) {
    for (int i = 0; i < input.length - 1; i++) {
        System.out.print(input[i] + ", ");
    }
    System.out.println(input[input.length-1]);
  }
}
