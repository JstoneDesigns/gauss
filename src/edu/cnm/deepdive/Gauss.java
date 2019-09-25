package edu.cnm.deepdive;

public class Gauss {

  private static final int DEFAULT_UPPER_BOUND = 100;

  public static void main(String[] args) {
    try {
      int upperBound = (args.length > 0) ? Integer.parseInt(args[0]) : DEFAULT_UPPER_BOUND;
      if (upperBound <= 0) {
        throw new IllegalArgumentException();
      }
      long sum = 0;
      for (int i = 1; i <= upperBound; i++) {
        sum += i;
      }
      System.out.println(sum);
    } catch (IllegalArgumentException e) {
      System.out.printf("Upper bound must be an integer in the range 1...%d%n", Integer.MAX_VALUE);
    }
  }

}
