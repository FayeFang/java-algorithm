import java.lang.*;

class ticketRevenue {
  public static void main(String arg[]) {
    int m = 1_000_000;
    int n = 999_999_999;
    System.out.println(maxRevenue(m, n));
  }

  public static int maxRevenue(int m, int n) {
    if (n == 0) return 0;
    if (m == 0) return 0;

    int ticketToSell = m;
    int ticketPrice = n;
    int revenue = 0;

    if (m > Math.pow(n, 2)) {
      revenue = (int) Math.pow(n, 2);
    }
    else {
      while (ticketToSell - n > 0) {
        revenue += n * ticketPrice;
        ticketToSell -= n;
        ticketPrice--;
      }

      revenue += ticketToSell * ticketPrice;
    }
    return revenue;
  }
}