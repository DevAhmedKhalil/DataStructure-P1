
public class MyArray {

    protected int[] items;
    protected int counter; // 0 by default

    public MyArray(int length) {
        items = new int[length];
    }

    public int getLength() {
        return items.length;
    }

    public int getItems() {
        return counter;
    }

    public void increaseLength() {
        System.out.println("** Make sure that you double the length! **");

        int[] newItems = new int[items.length * 2];
        System.arraycopy(items, 0, newItems, 0, items.length);
        items = newItems;
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    public int indexOf(int item) {

        for (int i = 0; i < counter; i++) {
            if (items[i] == item)
                return i;
        }

        return -1;
    }

    public int removeByValue(int value) {
        int removed = value;
        int i;

        for (i = 0; i < counter; i++) {
            if (items[i] == value) {
                items[i] = items[i + 1];
                break;
            }
        }

        for (int j = i; j < counter - 1; j++) {
            items[j] = items[j + 1];
        }

        counter--;
        return removed;
    }

    public int removeAtIndex(int index) {
        // [0, 1, 2, 3] -> index = 3
        // ----^--^
        if (isEmpty())
            throw new IllegalStateException();

        if (index <= 0 || index >= getLength())
            throw new IllegalArgumentException();

        int removed = items[index];

        for (int i = index; i < counter; i++) {
            items[i] = items[i + 1];
        }

        counter--;
        return removed;
    }

    public void removeAll() {
        if (isEmpty())
            throw new IllegalStateException();

        counter = 0;
    }

    public void remove() {
        if (isEmpty())
            throw new IllegalStateException();

        counter--;
    }

    public void insert(int value) {
        if (getLength() == counter) {
            increaseLength();
        }
        items[counter] = value;
        counter++;
    }

    public void print(int[] array) {
        System.out.println("Array Length is: " + getLength());
        System.out.println("Array Items- is: " + getItems());

        System.out.print("[");
        for (int i = 0; i < counter; i++) {
            System.out.print(items[i]);
            if (i < counter - 1)
                System.out.print(", ");
        }
        System.out.print("]\n"); // Add a newline character at the end
    }

    public void print() {
        print(items);
    }

}
