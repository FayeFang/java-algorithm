// A magic index in an array A[0..n-1] is defined to be an index such that A[i] = i.
// Given a sorted array of distinct integers, write a method to find a magic index, if one
// exist, in array A.

class MagicIndex {
  public static void main(String arg[]) {
    MagicIndex m = new MagicIndex();
    int[] array = {-1, 1, 2};
    System.out.println(magicIndex(array, 0, array.length - 1));
  }

  public static int magicIndex (int[] array, int start, int end) {
    if ( end < start || start < 0 || end >= array.length) {
      return -1;
    }

    int mid = (start + end) / 2;

    if (array[mid] == mid) {
      return mid;
    }
    else if (array[mid] > mid) {
      return magicIndex(array, start, mid - 1);
    }
    else {
      return magicIndex(array, mid + 1, end);
    }
  }
}