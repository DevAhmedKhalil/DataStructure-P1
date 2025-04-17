import java.util.Arrays;

public class CommonArray extends Array {

    public CommonArray(int length) {
        super(length);
    }

    public int[] intersect(Array otherArray) {
        // Create a new array to store common items
        int[] commonItems = new int[Math.min(this.count, otherArray.count)];
        int commonCount = 0;

        // Iterate through each item in the array
        for (int i = 0; i < this.count; i++) {
            int currentItem = this.items[i];
            // Check if the item exists in the other array
            if (otherArray.indexOf(currentItem) != -1) {
                // Add it to the common items array
                commonItems[commonCount++] = currentItem;
            }
        }

        // Resize the common items array if necessary
        /*
        creates a new array of length commonCount containing the common items,
        ensuring no extra space is wasted.
        This is necessary because the size of commonItems may be
        larger than the actual number of common items found.
        */
        return Arrays.copyOf(commonItems, commonCount);
    }
}
