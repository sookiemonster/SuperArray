public class Driver {
  public static void main(String[] args) {
    SuperArray arr = new SuperArray();
    System.out.println(arr.size());
    for (int i = 0; i < 9; i++) {
      arr.add(Integer.toString(i));
      System.out.println("Added: " + i + " |  Size: " + arr.size());
    }
  }
}
