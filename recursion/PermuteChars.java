// Write a method to compute all permutations of a string of unique characters.

class PermuteChars {
  public static void main(String arg[]) {
    PermuteChars m = new PermuteChars();
    char[] string = {'F', 'A', 'Y', 'E'};
    permutations(string, string.length - 1);
  }

  public static char[] permutations (int[] string, int length) {
    if (length <= 1) {
      return string;
    }

    int i;
    char[] result;
    char[] new_string;

    for (i = 0; i <= length; i++) {
      new_string = string.deleteCharAt(i);
      length = new_string.length;
      result = {string[i]};
      return result.append(permutations(new_string, length));
    }
  }
}

// syntax difficulties with Java...TBD...