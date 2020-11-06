public class Demo {
  public static void removeDuplicates(SuperArray s) {
    for (int i = 0; i < s.size(); i++) {
      if (i!=s.indexOf(s.get(i)) ) {
        s.remove(i);
        i--;
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray result = new SuperArray();
    int maxIndex = (a.size() < b.size()) ? a.size() : b.size();

    for (int i = 0; i < maxIndex + 1; i++) {
      if (b.contains(a.get(i)) ) {
        result.add(a.get(i));
      }
    }
    removeDuplicates(result);
    return result;

  }

  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);

    SuperArray arr = new SuperArray();
    arr.add("9");   arr.add("1");     arr.add("2");     arr.add("2");
    arr.add("3");   arr.add("4");

    SuperArray arr2 = new SuperArray();
    arr2.add("0");   arr2.add("4");     arr2.add("2");     arr2.add("2");
    arr2.add("9");

    System.out.println(arr);
    System.out.println(arr2);
    System.out.println(findOverlap(arr, arr2));
  }
}
