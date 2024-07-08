
public class Main {

  public static void main(String[] args) {
    System.out.println("========================================");

    MyExtendedArray my_array = new MyExtendedArray(5);
    // my_array.remove();

    my_array.insert(1);
    my_array.insert(2);
    my_array.insert(3);
    my_array.insert(4);
    my_array.insert(5);
    my_array.insert(6);
    my_array.remove();
    my_array.insert(7);
    my_array.remove();
    my_array.removeAll();
    my_array.insert(11);
    my_array.insert(22);
    my_array.insert(33);
    my_array.insert(44);
    my_array.insert(77);
    my_array.insert(55);
    my_array.insertAt(88, 1);

    int removed = my_array.removeAtIndex(2);
    System.out.println("Removed: " + removed);

    int removed2 = my_array.removeByValue(77);
    System.out.println("Removed2: " + removed2);

    System.out.println("Index Of: " + my_array.indexOf(44));
    System.out.println("Max Num: " + my_array.findMax());

    my_array.print();
    my_array.printReversedArray();
    my_array.print();

    System.out.println("========================================");

    // Dynamic Arrays:-
    // 1- Vector: increase 100% --- syncronized
    // 2- ArrayList: increase 50% - Not
  }

}