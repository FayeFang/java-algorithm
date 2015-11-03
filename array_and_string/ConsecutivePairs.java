class ConsecutivePairs {
  public static void main(String[] args) {

    int[] array = {1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4};
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
        if (counter > 0 && array[i] == array[i-1] && array[j] - array[i] == 1) {
          counter = counter;
        } else {
          counter = 0;
        }
        i++;
        j++;
      } else {
        if (counter > 0 && array[i] == array[i-1]) {
          i++;
          j++;
        } else if (counter > 0 && array[i] - array[i-1] != 1) {
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