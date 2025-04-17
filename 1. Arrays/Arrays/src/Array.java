
// Array is resized by 50% of it's size
// Array is static in java

public class Array {
    protected int[] items;
    protected int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        //1) If the array is full, resize it
        if (count == items.length) {
            //1.1) Create a new array (twice the size)
            int[] newItems = new int[count * 2];
            //1.2) Copy all existing items
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            //1.3) Set "items" to this new array
            items = newItems;
        }

        //2) Add the new item at the End of array
        items[count++] = item;
    }

    public void removeAt(int index) {
        //1) Validate index
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        //2) Shift items to the left to fill the hole
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];

        count--;
    }

    public int indexOf(int item) {
        //1) If we find the item, return index
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;

        //2) Otherwise, return -1
        return -1;
    }

    public int max() {
        // Find the max number
        int max = 0;
        for (int i = 0; i < count; i++) {
            if (max < items[i]) {
                max = items[i];
            }
        }
        // Return it
        return max;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}