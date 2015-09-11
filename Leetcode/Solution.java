public class Solution {
  public static void main(String[] args) {

    int A = -1500000001;
    int B = 0;
    int C = -1500000000;
    int D = 1;
    int E = 1500000000;
    int F = 0;
    int G = 1500000001;
    int H = 1;

    int ac = C - A;
    int bd = D - B;
    int eg = G - E;
    int fh = H - F;

    int area1 = ac * bd;
    // System.out.println(area1);
    int area2 = eg * fh;
    // System.out.println(area2);

    long length = Math.max((long)Math.min(C, G) - (long)Math.max(A, E), 0);
    // System.out.println(Math.min(C, G));
    // System.out.println(Math.max(A, E));
    System.out.println(length);
    long height = Math.max(Math.min(D, H) - Math.max(B, F), 0);
    System.out.println(height);
    long area3 = length * height;

    // System.out.println(area1 + area2 - area3);
  }
    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int ac = C - A;
        int bd = D - B;
        int eg = G - E;
        int fh = H - F;

        int area1 = ac * bd;
        int area2 = eg * fh;

        int length = Math.max(Math.min(C, G) - Math.max(A, E), 0);
        int height = Math.max(Math.min(D, H) - Math.max(B, F), 0);
        int area3 = length * height;

        return area1 + area2 - area3;
    }
}