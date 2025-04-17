public class ReverseArray extends Array {

    public ReverseArray(int length) {
        super(length);
    }

    public void reverse() {
        // Iterate through the array until the middle element
        for (int i = 0; i < count / 2; i++) {
            // Swap the elements from the beginning and end of the array
            int temp = items[i];
            items[i] = items[count - i - 1];
            items[count - i - 1] = temp;
        }
    }
}
