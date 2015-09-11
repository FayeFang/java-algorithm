// A child is running up a staircase with n steps, and can hop either 1 step, 2 steps, or 3 steps
// at a time. Implement a method to count how many possible ways the child can run up the stairs.
class RunningSteps {
  public static void main(String arg[]) {
    RunningSteps s = new RunningSteps();
    int n = 4;
    System.out.println(s.count(n));
  }

  int count (int n) {
    int count = 0;

    if (n == 1) {
      count = 1;
    }
    if (n == 2) {
      count = 2;
    }
    if (n == 3) {
      count = 4;
    }

    if (n > 3) {
      count = count(n - 1) + count(n - 2) + count(n - 3);
    }

    return count;
  }
}

