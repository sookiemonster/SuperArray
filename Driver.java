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
      System.out.println(arr.get(i) + " |  Size: " + arr.size());
    }
    System.out.println("Resizing Tests");

    arr.add(Integer.toString(10));
    System.out.println(arr.get(9) + " |  Size: " + arr.size());
    for (int i = 10; i < 20; i++) {
      arr.add(Integer.toString(i+10));
    }
    for (int i = 0; i < arr.size(); i++) {
      System.out.println(arr.get(i) + " |  Index: " + Integer.toString(i));
    }

    System.out.println("MORE TESTS:\n");
    SuperArray arr2 = new SuperArray();
    for (int i = 0; i < 234; i++) {
      arr2.add(Integer.toString(i));
    }
    for (int i = 0; i < arr2.size(); i++) {
      System.out.println(arr2.get(i) + " |  Index: " + Integer.toString(i));
    }
    System.out.println("Size: " + arr2.size());

    // Empty Tests:
    System.out.println();
    SuperArray arr3 = new SuperArray();
    System.out.println(arr2.isEmpty());
    System.out.println(arr3.isEmpty());
    // Clear Tests
    System.out.println();
    arr2.clear();
    System.out.println(arr2.isEmpty());
    System.out.println(arr2.size());
    for (int i = 0; i < 10; i++) {
      System.out.println(arr2.get(i));
    }

    // To String
    System.out.println(arr);

    // Contains
    for (int i = 0; i < arr.size(); i++) {
      System.out.println(arr.get(i));
    }
    System.out.println(arr.contains("10"));
    System.out.println(arr.contains("bruh"));

    // Initial Capacity Constructor
    SuperArray arr4 = new SuperArray(200);
    System.out.println(arr4.isEmpty());

    // Add
    System.out.println();
    SuperArray arr5 = new SuperArray(10);
    for (int i = 0; i < 5; i++) {
      arr5.add(Integer.toString(i));
    }

    arr5.add(5, "bruh");
    for (int i = 0; i < arr5.size(); i++) {
      System.out.println(arr5.get(i));
    }

    // Remove
    System.out.println();
    System.out.println(arr5);
    arr5.remove(4);
    for (int i = 0; i < arr5.size(); i++) {
      System.out.println(arr5.get(i));
    }
  }
}
