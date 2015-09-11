// Iamgine a robot sitting on the upper left corner of an X by Y grid. The robot can only move
// in two directions: right and down. How many possible paths are there for the robot to go
// from (0, 0) to (X, Y)?

class Robot {
  public static void main(String arg[]) {
    Robot r = new Robot();
    int x = 2;
    int y = 2;
    System.out.println(r.ways(x, y));
  }

  int ways (int x, int y) {
    int count = 0;

    if (x == 1 && y == 1) {
      count = 2;
    }
    else if (x != 0 && y == 0) {
      count = 1;
    }
    else if (x == 0 && y != 0) {
      count = 1;
    }
    else {
    count = ways(x - 1, y) + ways(x, y - 1);
    }
    return count;
  }
}