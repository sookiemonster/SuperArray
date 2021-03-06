public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray() {
    size = 0;
    data = new String[10];
  }

  public SuperArray(int initialCapacity) {
    if (initialCapacity < 0) {
      throw new IllegalArgumentException("\nReceived initial capacity: " + initialCapacity + "\nInitial capacity cannot be negative.");
    }
    size = 0;
    data = new String[initialCapacity];
  }

  public int size() {
    return size;
  }

  public boolean add(String element) {
    if (size == data.length) {
      resize();
    }
    data[size] = element;
    size++;
    return true;
  }

  public String get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("\nIndex " + index + " is out of bounds. Index must be equal to 0 or between 0 and the size of the SuperArray.");
    }
    return data[index];
  }

  public String set(int index, String element) {
    String replacedElement = data[index];
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("\nIndex " + index + " is out of bounds. Index must be equal to 0 or between 0 and the size of the SuperArray.");
    }
    if (data[index] != null) {
      data[index] = element;
    }
    return replacedElement;
  }

  private void resize() {
    String[] newData = new String[size*2 + 1];
    for (int i = 0; i < data.length; i++) {
      newData[i] = data[i];
    }
    data = newData;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void clear() {
    size = 0;
    data = new String[10];
  }

  public String toString() {
    String result = "[";
    for (int i = 0; i < size; i++) {
      if (i != size - 1) {
        result += (data[i] + ", ");
      } else {
        result += (data[i]);
      }
    }
    return result + "]";
  }

  public boolean contains(String s) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(s)) {
        return true;
      }
    }
  return false;
  }

  public void add(int index, String element) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("\nIndex " + index + " is out of bounds. Index must be equal to 0 or between 0 and the size of the SuperArray.");
    }
    size++;
    String[] tempData = new String[data.length + 1];
    for (int i = 0; i < tempData.length; i++) {
      if (i == index) {
        tempData[i] = element;
      } else if (i < index) {
        tempData[i] = data[i];
      } else {
        tempData[i] = data[i - 1];
      }
    }
    data = tempData;
  }

  public void remove(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("\nIndex " + index + " is out of bounds. Index must be equal to 0 or between 0 and the size of the SuperArray.");
    }
    String[] tempData = new String[data.length];
    int tempIndex = 0;
    for (int i = 0; i < size; i++) {
      if (i != index) {
        tempData[tempIndex] = data[i];
        tempIndex++;
      }
    }
    data = tempData;
    if (index < size){
      size--;
    }
  }

  public int indexOf(String s) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(s)) {
        return i;
      }
    }
    return -1;
  }

  public String[] toArray() {
    String[] result = new String[size];
    for (int i = 0; i < size; i++) {
      result[i] = data[i];
    }
    return result;
  }

  public int lastIndexOf(String s) {
    for (int i = size - 1; i >= 0; i--) {
      if (data[i].equals(s)) {
        return i;
      }
    }
    return -1;
  }

  public boolean equals(SuperArray other) {
    if (this.size != other.size()) {
      return false;
    }
    for (int i = 0; i < this.size; i++) {
      if (!this.data[i].equals(other.get(i))) {
        return false;
      }
    }
    return true;
  }


}
