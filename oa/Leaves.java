class Leaves {
  public static void main(String arg[]) {
    int leaves = 1_000_000;
    int[] A = [2, 4, 6, 9];

  }

  public static int eatLeaves(int leaves, int[] A) {
    long leaves = (long)leaves;

    boolean[] isUneaten = new boolean[leaves + 1];
    for (int i = 0; i <= leaves; i++) {
      isPrime[i] = true;
    }

    for (int i = 0; i <= leaves; i++) {

      // if i is prime, then mark multiples of i as nonprime
      // suffices to consider mutiples i, i+1, ..., N/i
      if (isUneaten[i]) {
        for (int j = 0; j < A.length; j++) {
          long eatLeave = (long)A[j];
          while (eatLeave <= leaves) {
            isPrime[eatLeave] = false;
            eatLeave += eatLeave;
          }
        }
      }
    }
  }
}