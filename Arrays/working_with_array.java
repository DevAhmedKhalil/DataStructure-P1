
import java.util.Arrays;

public class working_with_array {
  public static void main(String[] args) {
    System.out.println("hi");

    int[] numbers = new int[3];
    System.out.println(numbers); // I@1dbd16a6 = The address of object in memory
    System.out.println(Arrays.toString(numbers));
    System.out.println(numbers.length);

    numbers[0] = 10;
    numbers[1] = 20;
    numbers[2] = 30;
    System.out.println(Arrays.toString(numbers));

    int[] numbers1 = { 11, 22, 33 };
    System.out.println(Arrays.toString(numbers1));
  }
}