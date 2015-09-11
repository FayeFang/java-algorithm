
// You are given a binary array with N elements: d[0], d[1], ... d[N -1]..
// You can perform AT MOST one move on the array: choose any two integers [L, R],
// and flip all the elements between (and including) the L-th and R-th bits. L and
// R represent the left-most and right-most index of the bits marking the
// boundaries of the segment which you have decided to flip.

// What is the maximum number of '1'-bits (indicated by S) which you can obtain in
// the final bit-string?
// 'Flipping' a bit means, that a 0 is transformed to a 1 and a 1 is transformed to
// a 0
// Input Format
// An integer N
// Next line contains the N bits, separated by spaces: d[0] d[1] ... d[N-1].

// Output:
// S

// Sample Input:
// 8
// 1 0 0 1 0 0 1 0
// Sample Output:
// 6
class Bits {
  public static void main(String arg[]) {
    int[] array = {1, 0, 0, 0, 1, 1};
    System.out.println("The max number of 1 is " + flipBits(array));
  }
  public static int flipBits(int[] array) {
    int length = array.length;

    int count = 0;
    for (int i = 0; i < length; i++) {
      if (array[i] == 1) {
        count++;
      }
    }

    int temp = 0;
    int flipped = 0;

    for (int i = 0; i < length; i++) {
      if (array[i] == 0) {
        temp++;
      }
      else {
        temp--;
      }
      temp = Math.max(0, temp);
      flipped = Math.max(flipped, temp);
    }
    return count + flipped;
  }
}