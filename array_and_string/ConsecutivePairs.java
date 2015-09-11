class ConsecutivePairs {
  public static void main(String[] args) {

    int[] array = {4, 4, 5, 5, 6, 6};
    boolean result = isConsecutivePairs(array);
    System.out.println(result);
  }

  public static boolean isConsecutivePairs(int[] array) {
    if (array.length < 6) return false;

    int i = 0;
    int j = 1;
    int counter = 0;

    while (i < array.length && j < array.length) {
      if (array[i] != array[j]) {
        i++;
        j++;
        counter = 0;
      } else {
        if (counter > 0 && array[i] - array[i-1] != 1) {
          counter = 0;
        } else {
          i += 2;
          j += 2;
          counter++;
        }
      }
      if (counter == 3) return true;
    }
    return false;
  }
}