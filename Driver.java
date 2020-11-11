public class Driver {
  public static void main(String[] args) {
    SuperArray arr = new SuperArray();
    System.out.println(arr.size());
    for (int i = 0; i < 9; i++) {
      arr.add(Integer.toString(i));
      System.out.println("Added: " + i + " |  Size: " + arr.size());
    }
    System.out.println(arr);
    for (int i = 10; i < 20; i++) {
      arr.add(Integer.toString(i));
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
    System.out.println(arr2);

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

    // IndexOf
    System.out.println();
    System.out.println(arr5);
    System.out.println(arr5.indexOf("2"));
    System.out.println(arr5.indexOf("bruh"));
    System.out.println(arr5.indexOf("4"));

    // ToArray
    System.out.println();
    System.out.println(arr5);
    String[] newArr = arr5.toArray();
    for (int i = 0; i < newArr.length; i++) {
      System.out.print(newArr[i] + "   ");
    }
    System.out.println();

    // Last Index
    SuperArray words = new SuperArray();
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");
    System.out.println(words);
    System.out.println(words.lastIndexOf("ebi"));

    // Equals
    System.out.println(words);
    SuperArray words2 = new SuperArray(40);
    words2.add("kani");   words2.add("uni");     words2.add("ebi");     words2.add("una");
    words2.add("una");    words2.add("ebi");     words2.add("kani");    words2.add("una");
    words2.add("una");    words2.add("ebi");     words2.add("toro");
    System.out.println(words.equals(words2));
    System.out.println(words.equals(arr5));

    // Error Testing
    try {
      SuperArray x = new SuperArray(-10);
    } catch (IllegalArgumentException e) {
      System.out.println("That's the right error! Illegal Argument");
    } catch (RuntimeException e2) {
      System.out.println("Uh oh");
    }

    try {
      SuperArray y = new SuperArray();
      for (int i = 0; i < 12; i++) {
        y.add("bruh");
      }
      y.get(-1);
      System.out.println(y);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Correct Error: Index Out of Bounds");
    }

    try {
      SuperArray z = new SuperArray();
      for (int i = 0; i < 12; i++) {
        z.add("bruh");
      }
      z.set(-1, "woah there");
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Correct Error (set negative): Index Out of Bounds");
    }

    try {
      SuperArray uwu = new SuperArray();
      for (int i = 0; i < 12; i++) {
        uwu.add("bruh");
      }
      uwu.set(uwu.size(), "woah there again");
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Correct Error (set at index size): Index Out of Bounds");
    }
  }
}
