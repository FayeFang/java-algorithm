class Anagram {
  public static void main (String[] args) {
    String a = "ABC";
    String b = "BDC";
    System.out.println("String a is " + a);
    System.out.println("String b is " + b);
    System.out.println("String a and b is anagram: " + isAnagram(a, b));
  }

  public static boolean isAnagram(String a, String b) {
    if (a.length() != b.length()) {
      return false;
    } else {
      return sortString(a).equals(sortString(b));
    }
  }

  public static String sortString(String a) {
    char[] content = a.toCharArray();
    java.util.Arrays.sort(content);
    return new String(content);
  }
}

//second method count same character using character set. 256?