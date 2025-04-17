public class ArrayWithInsertAt extends Array {

    public ArrayWithInsertAt(int length) {
        super(length);
    }

    public void insertAt(int item, int index) {
        //1) Check if the index is valid
        if (index < 0 || index > count)
            throw new IllegalArgumentException("Index is out of bounds");

        //2) Resize the array if necessary
        if (count == items.length) {
            int[] newItems = new int[count * 2];

            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            items = newItems;
        }

        // [10, 20, 30, 40]
        // insertAt(55, 2)
        // [10, 20, 55, 30, 40]

        //3) Shift elements 'From END' to make space to the new items
        for (int i = count; i > index; i--) {
            items[i] = items[i - 1];
        }

        //4) Insert the item in the index
        items[index] = item;

        //5) Increase the count => size of the array
        count++;
    }

}

