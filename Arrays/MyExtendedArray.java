public class MyExtendedArray extends MyArray {

  public MyExtendedArray(int length) {
    super(length);
  }

  public int findMax() {
    if (isEmpty()) {
      throw new IllegalStateException("Array is empty");
    }

    int max = items[0]; // Assume the first element is the maximum initially
    for (int i = 1; i < counter; i++) {
      if (items[i] > max) {
        max = items[i]; // Update max if a larger element is found
      }
    }
    return max;
  }

  public void reverse() {
    int left = 0;
    int right = counter - 1;
    while (left < right) {
      // Swap elements at left and right indices
      int temp = items[left];
      items[left] = items[right];
      items[right] = temp;
      // Move indices towards the center
      left++;
      right--;
    }
  }

  public void printReversedArray() {
    reverse();
    super.print(); // Call the print method from MyArray
  }

  public void insertAt(int item, int index) {
    if (index < 0 || index > counter) {
      throw new IndexOutOfBoundsException("Index is out of bounds");
    }

    // If the array is full, increase its length
    if (getLength() == counter) {
      increaseLength();
    }

    // Shift elements to the right to make space for the new item
    for (int i = counter - 1; i >= index; i--) {
      items[i + 1] = items[i];
    }

    // Insert the new item at the specified index
    items[index] = item;
    counter++;
  }

}
