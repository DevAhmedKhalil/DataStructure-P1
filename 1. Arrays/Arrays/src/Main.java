import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    ReverseArray numbers = new ReverseArray(3);
    numbers.insert(3);
    numbers.insert(10);
    numbers.insert(7);
    numbers.insert(200);
    numbers.insert(10);

    numbers.removeAt(2);
    System.out.println("index is: " + numbers.indexOf(1010));
    System.out.println("Max Number: " + numbers.max());

    System.out.println("Original array:");
    numbers.print();

    System.out.println("Reversed array:");
    numbers.reverse();
    numbers.print();


    CommonArray array1 = new CommonArray(5);
    array1.insert(1);
    array1.insert(2);
    array1.insert(3);

    CommonArray array2 = new CommonArray(5);
    array2.insert(2);
    array2.insert(3);
    array2.insert(4);

    int[] commonItems = array2.intersect(array1);
    System.out.println("Common items: " + Arrays.toString(commonItems));

    ArrayWithInsertAt numbs = new ArrayWithInsertAt(4);
    numbs.insert(100);
    numbs.insert(200);
    numbs.insert(300);

    System.out.println("Original array:");
    numbs.print();

    numbs.insertAt(33, 2);
    numbs.insertAt(44, 1);

    System.out.println("Array after insertion:");
    numbs.print();
  }
}