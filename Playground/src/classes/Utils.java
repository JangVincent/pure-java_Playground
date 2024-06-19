package classes;

public class Utils {
  public void logln(String str) {
    System.out.println(str);
  }

  public void log(String str) {
    System.out.print(str);
  }

  public <T> void logArray(int[] fibo) {
    for (int i = 0; i < fibo.length; i++) {
      if (i == fibo.length - 1) {
        System.out.println(fibo[i]);
        break;
      }
      System.out.print(fibo[i] + ",");
    }
  }
}
