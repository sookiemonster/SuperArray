public class Driver {
  public static void main(String[] args) {
    SuperArray arr = new SuperArray();
    System.out.println(arr.size());
    for (int i = 0; i < 9; i++) {
      arr.add(Integer.toString(i));
      System.out.println("Added: " + i + " |  Size: " + arr.size());
    }
    for (int i = 0; i < 10; i++) {
      System.out.println(arr.get(i));
    }
    for (int i = 10; i < 20; i++) {
      arr.set(i-10, Integer.toString(i));
    }
    for (int i = 0; i < 10; i++) {
      System.out.println(arr.get(i));
    }
  }
}
